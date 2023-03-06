package main.service;

import main.model.Curriculo;
import main.model.Disciplina;

public interface CursoService {


    Curriculo criarCurriculo(Curriculo curriculo);
    Curriculo editarCurriculo(Curriculo curriculo);
    Curriculo deletarCurriculo (Curriculo curriculo);

    Disciplina incluirDisciplina (Disciplina disciplina, Curriculo curriculo);


}
