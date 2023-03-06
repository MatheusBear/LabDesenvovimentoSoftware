package main.service;

import main.model.Disciplina;

public interface DisciplinaService {

    Disciplina criarDisciplina( Disciplina disciplina);
    Disciplina editarDisciplina( Disciplina disciplina);
    Disciplina deletarDisciplina( Disciplina disciplina);
}
