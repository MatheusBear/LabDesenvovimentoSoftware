package main.model;

import java.util.List;

public class Curriculo {

    private Long id;
    private List<Disciplina> disciplinasDoCurriculo;
    private Integer numeroCurriculo;
    private String nomeCurriculo;

    public Curriculo(Long id, List<Disciplina> disciplinasDoCurriculo,
                     Integer numeroCurriculo, String nomeCurriculo) {
        this.id = id;
        this.disciplinasDoCurriculo = disciplinasDoCurriculo;
        this.numeroCurriculo = numeroCurriculo;
        this.nomeCurriculo = nomeCurriculo;
    }

    public Curriculo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Disciplina> getDisciplinasDoCurriculo() {
        return disciplinasDoCurriculo;
    }

    public void setDisciplinasDoCurriculo(List<Disciplina> disciplinasDoCurriculo) {
        this.disciplinasDoCurriculo = disciplinasDoCurriculo;
    }

    public Integer getNumeroCurriculo() {
        return numeroCurriculo;
    }

    public void setNumeroCurriculo(Integer numeroCurriculo) {
        this.numeroCurriculo = numeroCurriculo;
    }

    public String getNomeCurriculo() {
        return nomeCurriculo;
    }

    public void setNomeCurriculo(String nomeCurriculo) {
        this.nomeCurriculo = nomeCurriculo;
    }
}
