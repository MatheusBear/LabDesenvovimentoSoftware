package main.model;

import java.io.Serializable;
import java.util.*;

public class Disciplina implements Serializable {

    private static final long serialVersionUID = 70L;

    private Long id;
    private String nome;
    private String numero;
    private String periodo;
    private String cargaHoraria;
    private String curriculo;
    private String horario;
    private String turno;
    private String duração;
    private Integer peso;
    private boolean obrigatoria;

    public Disciplina() {
    }

    public Disciplina(Long id, String nome, String numero, String periodo, String cargaHoraria,
                      String curriculo, String horario, String turno, String duração, Integer peso,
                      boolean obrigatoria) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.periodo = periodo;
        this.cargaHoraria = cargaHoraria;
        this.curriculo = curriculo;
        this.horario = horario;
        this.turno = turno;
        this.duração = duração;
        this.peso = peso;
        this.obrigatoria = obrigatoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isObrigatoria() {
        return obrigatoria;
    }

    public void setObrigatoria(boolean obrigatoria) {
        this.obrigatoria = obrigatoria;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getNumero(), getPeriodo(), getCargaHoraria(),
                getCurriculo(), getHorario(), getTurno(), getDuração(),
                getPeso(), isObrigatoria());
    }

    public Disciplina Clone(){
        Disciplina disc = new Disciplina();

        disc.id = this.id;
        disc.nome = this.nome;
        disc.numero = this.numero;
        disc.periodo = this.periodo;
        disc.cargaHoraria = this.cargaHoraria;
        disc.curriculo = this.curriculo;
        disc.horario = this.horario;
        disc.turno = this.turno;
        disc.duração = this.duração;
        disc.peso = this.peso;
        disc.obrigatoria = this.obrigatoria;

        return disc;
    }
}
