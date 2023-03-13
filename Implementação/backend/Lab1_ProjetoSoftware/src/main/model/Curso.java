package main.model;

import java.util.List;

public class Curso {

    private Long id;
    private List<Disciplina> disciplinasDoCurso;
    private List<Curriculo> curriculos;

    public Curso(){

    }

    public Curso(Long id, List<Disciplina> disciplinasDoCurso, List<Curriculo> curriculos){
        this.id = id;
        this.disciplinasDoCurso = disciplinasDoCurso;
        this.curriculos = curriculos;
    }

    public void setId(Long Id){
        this.id = Id;
    }

    public void setDisciplinasDoCurso(List<Disciplina> DisciplinasDoCurso){
        this.disciplinasDoCurso = DisciplinasDoCurso;
    }

    public void setCurriculos(List<Curriculo> Curriculos){
        this.curriculos = Curriculos;
    } 

    public Long getId(){
        return this.id;
    }

    public List<Disciplina> getDisciplinasDoCurso(){
        return this.disciplinasDoCurso;
    }

    public List<Curriculo> getCurriculos(){
        return this.curriculos;
    }
}
