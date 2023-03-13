package main.service;

import main.model.Aluno;
import main.model.Disciplina;

import java.util.List;

public interface AlunoService {


    Aluno criarAluno(Aluno aluno) throws Exception;
    Aluno editarAluno(Long id) throws Exception;

    Aluno deletarAluno(Long id) throws Exception;

    List<Disciplina> matricularEmDisciplinas(List<Disciplina> disciplinasDesejadas, Long idAluno);

    Aluno findAlunoById(Long idAluno) throws Exception;
}
