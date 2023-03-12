package main.model;


import java.util.List;

public class Aluno {

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
                 List<Disciplina> disciplinasPendentes, List<Disciplina> disciplinasEmAndamento, Curriculo curriculo, String curso, String anoIngresso,
                 String anoDesligamento, String endereco, List<Disciplina> disciplinasSolicitadas) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.nomeFamiliar = nomeFamiliar;
        this.documentoLegal = documentoLegal;
        this.disciplinasCursadas = disciplinasCursadas;
        this.disciplinasPendentes = disciplinasPendentes;
        this.disciplinasEmAndamento = disciplinasEmAndamento;
        this.curriculo = curriculo;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.anoDesligamento = anoDesligamento;
        this.endereco = endereco;
        this.disciplinasSolicitadas = disciplinasSolicitadas;
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
}
