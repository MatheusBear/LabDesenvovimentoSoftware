package main.service;

import main.model.Requests.MatriculaRequestAlunos;
import main.model.Requests.MatriculaRequestFuncionario;

public interface MatriculaService {


    Integer efetuarMatriculaAluno(MatriculaRequestFuncionario requisicao);
    Integer efetuarMatriculaFuncionario (MatriculaRequestFuncionario requisicao);

    Integer deletarMatriculaFuncionario (MatriculaRequestFuncionario requestFuncionario);

    Integer deletarMatriculaAluno (MatriculaRequestAlunos matriculaRequestAlunos);



}
