package main.controller;

import main.model.Aluno;
import main.model.Disciplina;
import main.model.Funcionario;
import main.model.Requests.MatriculaRequestAlunos;
import main.model.Requests.MatriculaRequestFuncionario;
import main.service.AlunoService;
import main.service.Impl.AlunoServiceImpl;

import java.util.List;

public class MatriculaController {



    AlunoService alunoService = new AlunoServiceImpl();
    public List<Aluno> processaMatriculaAlunos(){
        return null;
    }

    public List<Disciplina> processaCriacaoDeDisciplinas(){
        return null;
    }

    public Aluno matriculaAluno(MatriculaRequestAlunos requestAlunos) throws Exception {

        System.out.println("entrei");
        return alunoService.criarAluno(requestAlunos);
    }

    public Funcionario matriculaFuncionario (MatriculaRequestFuncionario requestFuncionario){
        return null;
    }

}
