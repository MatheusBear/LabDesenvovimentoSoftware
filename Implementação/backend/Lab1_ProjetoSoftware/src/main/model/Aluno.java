package main.model;


import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Aluno implements Serializable{

    private static final long serialVersionUID = 10L;
    private Long id;
    private Long matricula;
    private String nome;
    private String nomeFamiliar;
    private String documentoLegal;
    private List<Disciplina> disciplinasCursadas;
    private List<Disciplina> disciplinasPendentes;
    private List<Disciplina> disciplinasEmAndamento;

    private List<Disciplina> disciplinasSolicitadas;
    private Curriculo curriculo;
    private String curso;
    private String anoIngresso;
    private String anoDesligamento;
    private String endereco;

    public Aluno() {
    }

    public Aluno(Long id, Long matricula, String nome, String nomeFamiliar, String documentoLegal, List<Disciplina> disciplinasCursadas,
                 List<Disciplina> disciplinasPendentes, List<Disciplina> disciplinasEmAndamento, List<Disciplina> disciplinasSolicitadas,
                 Curriculo curriculo, String curso, String anoIngresso, String anoDesligamento, String endereco) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.nomeFamiliar = nomeFamiliar;
        this.documentoLegal = documentoLegal;
        this.disciplinasCursadas = disciplinasCursadas;
        this.disciplinasPendentes = disciplinasPendentes;
        this.disciplinasEmAndamento = disciplinasEmAndamento;
        this.disciplinasSolicitadas = disciplinasSolicitadas;
        this.curriculo = curriculo;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.anoDesligamento = anoDesligamento;
        this.endereco = endereco;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFamiliar() {
        return nomeFamiliar;
    }

    public void setNomeFamiliar(String nomeFamiliar) {
        this.nomeFamiliar = nomeFamiliar;
    }

    public String getDocumentoLegal() {
        return documentoLegal;
    }

    public void setDocumentoLegal(String documentoLegal) {
        this.documentoLegal = documentoLegal;
    }

    public List<Disciplina> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public void setDisciplinasCursadas(List<Disciplina> disciplinasCursadas) {
        this.disciplinasCursadas = disciplinasCursadas;
    }

    public List<Disciplina> getDisciplinasPendentes() {
        return disciplinasPendentes;
    }

    public void setDisciplinasPendentes(List<Disciplina> disciplinasPendentes) {
        this.disciplinasPendentes = disciplinasPendentes;
    }

    public List<Disciplina> getDisciplinasEmAndamento() {
        return disciplinasEmAndamento;
    }

    public void setDisciplinasEmAndamento(List<Disciplina> disciplinasEmAndamento) {
        this.disciplinasEmAndamento = disciplinasEmAndamento;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getAnoDesligamento() {
        return anoDesligamento;
    }

    public void setAnoDesligamento(String anoDesligamento) {
        this.anoDesligamento = anoDesligamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Disciplina> getDisciplinasSolicitadas() {
        return disciplinasSolicitadas;
    }

    public void setDisciplinasSolicitadas(List<Disciplina> disciplinasSolicitadas) {
        this.disciplinasSolicitadas = disciplinasSolicitadas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMatricula(), getNome(), getNomeFamiliar(), getDocumentoLegal(),
                getDisciplinasCursadas(), getDisciplinasPendentes(), getDisciplinasEmAndamento(), getDisciplinasSolicitadas(),
                getCurriculo(), getCurso(), getAnoIngresso(), getAnoDesligamento(), getEndereco());
    }

    @Override
    public Aluno clone(){
        Aluno retorno = new Aluno();

        retorno.id = this.id;
        retorno.matricula = this.matricula;
        retorno.nome = this.nome;
        retorno.nomeFamiliar = this.nomeFamiliar;
        retorno.documentoLegal = this.documentoLegal;
        retorno.disciplinasCursadas = new LinkedList<Disciplina>(this.disciplinasCursadas);
        retorno.disciplinasPendentes = new LinkedList<Disciplina>(this.disciplinasPendentes);
        retorno.disciplinasEmAndamento = new LinkedList<Disciplina>(this.disciplinasEmAndamento);
        retorno.disciplinasSolicitadas = new LinkedList<Disciplina>(this.disciplinasSolicitadas);
        retorno.curriculo = this.curriculo;
        retorno.curso = this.curso;
        retorno.anoIngresso = this.anoIngresso;
        retorno.anoDesligamento = this.anoDesligamento;
        retorno.endereco = this.endereco;

        return retorno;
    }
}
