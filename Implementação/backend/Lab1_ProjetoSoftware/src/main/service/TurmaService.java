package main.service;

import main.model.Turma;

public interface TurmaService {


    Turma criarTurma(Turma turma);
    Turma editarTurma(Turma turma);
    Turma deletarTurma(Turma turma);

    Turma getTurma(Long idDisciplina, String numeroDisciplina);

    boolean matricularAluno(Long id, Turma turma);
}
