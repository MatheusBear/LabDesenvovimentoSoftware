package main.service;

import main.model.Aluno;

public interface AlunoService {


    Aluno criarAluno(Aluno aluno);
    Aluno editarAluno (Aluno aluno);
    Aluno deletarAluno (Aluno aluno);

}
