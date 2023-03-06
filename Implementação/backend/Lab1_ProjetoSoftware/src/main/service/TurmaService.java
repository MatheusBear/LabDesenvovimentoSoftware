package main.service;

import main.model.Sala;
import main.model.Turma;

public interface TurmaService {


    Turma criarTurma(Turma turma);
    Turma editarTurma(Turma turma);
    Turma deletarTurma(Turma turma);
}
