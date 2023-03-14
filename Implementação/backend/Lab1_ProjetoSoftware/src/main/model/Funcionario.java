package main.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

public abstract class Funcionario implements Serializable {

    private static final long serialVersionUID = 90L;

    private Long id;
    private Long matricula;
    private String nome;
    private String nomeFamiliar;
    private String documentoLegal;
    private String departamento;
    private String anoIngresso;
    private String anoDesligamento;
    private String endereco;
    private BigInteger salario;
}
