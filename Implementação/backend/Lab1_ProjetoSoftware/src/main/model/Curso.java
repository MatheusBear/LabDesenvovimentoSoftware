package main.model;

import java.io.Serializable;
import java.util.List;

public class Curso implements Serializable {

    private static final long serialVersionUID = 50L;

    private Long id;
    private List<Disciplina> disciplinasDoCurso;
    private List<Curriculo> curriculos;

}
