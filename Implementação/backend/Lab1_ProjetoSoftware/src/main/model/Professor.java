package main.model;

import java.io.Serializable;
import java.util.List;

public class Professor extends Funcionario implements Serializable {

    private static final long serialVersionUID = 110L;

    private List<Turma> turmas;

}
