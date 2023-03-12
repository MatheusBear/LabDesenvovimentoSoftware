package main.service;

import main.model.Aluno;
import main.model.Disciplina;

import java.util.List;

public interface AlunoService {


    Aluno criarAluno(Aluno aluno);
    Aluno editarAluno (Aluno aluno);
    Aluno deletarAluno (Aluno aluno);

    List<Disciplina> matricularEmDisciplinas(List<Disciplina> disciplinasDesejadas, Long idAluno);

}
