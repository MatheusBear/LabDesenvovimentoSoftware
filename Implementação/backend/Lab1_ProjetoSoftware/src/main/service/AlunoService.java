package main.service;

import main.model.Aluno;
import main.model.Disciplina;
import main.model.Requests.MatriculaRequestAlunos;

import java.util.List;

public interface AlunoService {


    Aluno criarAluno(MatriculaRequestAlunos aluno) throws Exception;
    Aluno editarAluno(Long id,Aluno alunoModificado) throws Exception;

    Aluno deletarAluno(Long id) throws Exception;

    List<Disciplina> matricularEmDisciplinas(List<Disciplina> disciplinasDesejadas, Long idAluno);

    Aluno findAlunoById(Long idAluno) throws Exception;
}
