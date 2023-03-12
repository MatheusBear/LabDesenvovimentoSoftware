package main.service.Impl;

import main.model.Aluno;
import main.model.Disciplina;
import main.model.Turma;
import main.service.AlunoService;
import main.service.TurmaService;

import java.util.List;

public class AlunoServiceImpl implements AlunoService {


    private TurmaService turmaService;
    @Override
    public Aluno criarAluno(Aluno aluno) {
        return null;
    }

    @Override
    public Aluno editarAluno(Aluno aluno) {
        return null;
    }

    @Override
    public Aluno deletarAluno(Aluno aluno) {
        return null;
    }

    @Override
    public List<Disciplina> matricularEmDisciplinas(List<Disciplina> disciplinasDesejadas, Long id) {

        int somatorioPeso = 0 ;
        int somatorioDisciplinasObrigatorias =0;
        int somatorioDisciplinasOptativas=0;


        //verifica se a lista é vlida de acordo com as regras
        for (Disciplina disciplinaAtual: disciplinasDesejadas) {

            somatorioPeso+=disciplinaAtual.getPeso();
            if(disciplinaAtual.isObrigatoria()){
                somatorioDisciplinasObrigatorias++;
            }else{
                somatorioDisciplinasOptativas++;
            }
        }

        if (somatorioDisciplinasObrigatorias>=4 && somatorioDisciplinasOptativas >=2 && somatorioPeso > 3){

            for (Disciplina disciplinaAtual: disciplinasDesejadas) {

                Turma turma = turmaService.getTurma(disciplinaAtual.getId(), disciplinaAtual.getNumero());
                turmaService.matricularAluno(id,turma);

            }
            return disciplinasDesejadas;

        }
        return null;
    }
}
