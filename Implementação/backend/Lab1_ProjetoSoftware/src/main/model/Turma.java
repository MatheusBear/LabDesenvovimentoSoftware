package main.model;

import java.io.Serializable;
import java.util.List;

public class Turma implements Serializable {

    private static final long serialVersionUID = 170L;

    private Long id;
    private List<Aluno> alunos;
    private Sala sala;
    private Curso curso;
    private Professor professor;

}
