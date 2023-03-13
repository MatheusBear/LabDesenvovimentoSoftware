package main.model;

import java.util.List;

public class Turma {

    private Long id;
    private List<Aluno> alunos;
    private Sala sala;
    private Curso curso;
    private Professor professor;

    public Turma(){

    }

    public Turma(Long id, List<Aluno> alunos, Sala sala, Curso curso, Professor professor){
        this.id = id;
        this.alunos = alunos;
        this.sala = sala;
        this.curso = curso;
        this.professor = professor;
    }

    //Setter
    public void setId(long Id){
        this.id = Id;
    }

    public void setAlunos(List<Aluno> Alunos){
        this.alunos = Alunos;
    }

    public void setSala(Sala Sala){
        this.sala = Sala;
    }

    public void setCurso(Curso Curso){
        this.curso = Curso;
    }

    public void setProfessor(Professor Professor){
        this.professor = Professor;
    }

    //Getter
    public Long getId(){
        return this.id;
    }

    public List<Aluno> getAlunos(){
        return this.alunos;
    }

    public Sala getSala(){
        return this.sala;
    }

    public Curso getCurso(){
        return this.curso;
    }

    public Professor getProfessor(){
        return this.professor;
    }
}
