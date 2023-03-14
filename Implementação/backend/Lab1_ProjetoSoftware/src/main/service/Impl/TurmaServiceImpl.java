package main.service.Impl;

import main.model.Turma;
import main.service.TurmaService;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TurmaServiceImpl implements TurmaService {
    @Override
    public Turma criarTurma(Turma turma) {
        Date dataAtual = new Date();

        Turma turmaAtual = findTurmaByDocumentoLegal(turma.getDocumentoLegal());
        if ( turmaAtual == null){

            Long id= geradorDeId();
            turmaAtual = new Turma(
            id,
            id,
            turma.getAlunos(),
            turma.getCurso(),
            turma.getProfessor(),

            ""+dataAtual.getYear(),
            null,
            turma.getSala(),
            );
            escreverTurmaNoArquivo(turmaAtual,"Turmas.txt");
        }
        return turmaAtual;
    }

    private Long geradorDeId() throws Exception {

        LinkedList<Turma> turmasMatriculadas = (LinkedList<Turma>) carregarArquivoTurmaParaMemoria("Turmas.txt");

        if(turmasMatriculadas.size() <= 0) {
            return 1L;
        }else{
            Turma turma = turmasMatriculadas.get(turmasMatriculadas.size()-1);
            return (turma.getId()+1L);
        }
    }

    @Override
    public Turma editarTurma(Long id, Turma turmaModificada) {
        Turma turma = findTurmaById(id);
        if ( turma!= null){
            deletarTurma(id);
            turma = turmaModificada.clone();
            escreverTurmaNoArquivo(turma,"Turmas.txt");
        }else{
            System.out.println("TURMA NÃO ENCONTRADO");
        }
        return turma;
    }

    @Override
    public Turma deletarTurma(Long id) {
        Turma turma = findTurmaById(id);
        if ( turma!= null){

            excluirTurmaNoArquivo(turma,"Turmas.txt");
        }else{
            System.out.println("TURMA NÃO ENCONTRADO");
        }
        return turma;
    }

    @Override
    public Turma getTurma(Long idDisciplina, String numeroDisciplina) {
        return null;

    }

    @Override
    public boolean matricularAluno(Long id, Turma turma) {
        return false;
    }
}
