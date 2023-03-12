package main.controller;

import main.model.Aluno;
import main.model.Disciplina;
import main.service.AlunoService;

import java.util.LinkedList;
import java.util.List;

public class AlunoController {

    AlunoService alunoService;

    public Aluno editarMeuCadastro(Long id){

        return  null;
    }

    public Aluno visualizarMeuCurriculo(Long id){
        return  null;
    }

    public Aluno visualizarDisciplinasCursadas (Long id){
        return null;
    }

    public Aluno visualizarDisciplinasPendentes (Long id){
        return null;
    }

    public Aluno visualizarDisciplinasEmAndamento(Long id){
        return null;
    }

    public List<Disciplina> matricularEmDisciplinas (List<Disciplina> disciplinas, Long idAluno){

        Aluno aluno = findAlunoById(idAluno);

        List<Disciplina> matricula = alunoService.matricularEmDisciplinas(disciplinas,idAluno);

        if(matricula == null ){
            //nao foi possivel matricular, requisitos nao atendem

        }else{
            // foi possivel matricular
        }

        return matricula;

    }

    public boolean selecionarDisciplinas(Long idAluno){

        Aluno aluno = findAlunoById(idAluno);

        List<Disciplina> disciplinasDisponiveis = aluno.getCurriculo().getDisciplinasDoCurriculo();

        LinkedList disciplinasSelecionadas = new LinkedList<>();

        if(matricularEmDisciplinas(disciplinasSelecionadas,idAluno) != null ){

            return true;
        }else{
            return false;
        }

    }


    private Aluno findAlunoById(Long id) {
        return null;
    }

}
