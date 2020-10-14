package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "estadio")


public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nomeEstadio;

    @Column
    private double capacidade;

    @Column
    private String nomeResponsavel;

    @Column
    private String sobrenomeResponsavel;

    @Column
    private String rg;

    @Column
    private String cpf;

    @Column
    private String numeroTelefone;

    //Documentos

    @Column
    private String laudoBombeiro;

    @Column
    private String Avcb;

    @Column
    private String LaudoAditivoEngenharia;

    @Column
    private String CondicoesSanitariasHigiene;

    @Column
    private String PrevencaoCombateIncendio;

    @Column
    private String seguranca;

    @Column
    private String vistoriaEngenharia;

    public Estadio(String nomeEstadio, double capacidade, String nomeResponsavel, String sobrenomeResponsavel, String rg, String cpf, String numeroTelefone, String laudoBombeiro, String avcb, String laudoAditivoEngenharia, String condicoesSanitariasHigiene, String prevencaoCombateIncendio, String seguranca, String vistoriaEngenharia, Integer id) {
        this.nomeEstadio = nomeEstadio;
        this.capacidade = capacidade;
        this.nomeResponsavel = nomeResponsavel;
        this.sobrenomeResponsavel = sobrenomeResponsavel;
        this.rg = rg;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
        this.laudoBombeiro = laudoBombeiro;
        Avcb = avcb;
        LaudoAditivoEngenharia = laudoAditivoEngenharia;
        CondicoesSanitariasHigiene = condicoesSanitariasHigiene;
        PrevencaoCombateIncendio = prevencaoCombateIncendio;
        this.seguranca = seguranca;
        this.vistoriaEngenharia = vistoriaEngenharia;
        this.id = id;
    }

    public String getNomeEstadio() {
        return nomeEstadio;
    }

    public void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getSobrenomeResponsavel() {
        return sobrenomeResponsavel;
    }

    public void setSobrenomeResponsavel(String sobrenomeResponsavel) {
        this.sobrenomeResponsavel = sobrenomeResponsavel;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getLaudoBombeiro() {
        return laudoBombeiro;
    }

    public void setLaudoBombeiro(String laudoBombeiro) {
        this.laudoBombeiro = laudoBombeiro;
    }

    public String getAvcb() {
        return Avcb;
    }

    public void setAvcb(String avcb) {
        Avcb = avcb;
    }

    public String getLaudoAditivoEngenharia() {
        return LaudoAditivoEngenharia;
    }

    public void setLaudoAditivoEngenharia(String laudoAditivoEngenharia) {
        LaudoAditivoEngenharia = laudoAditivoEngenharia;
    }

    public String getCondicoesSanitariasHigiene() {
        return CondicoesSanitariasHigiene;
    }

    public void setCondicoesSanitariasHigiene(String condicoesSanitariasHigiene) {
        CondicoesSanitariasHigiene = condicoesSanitariasHigiene;
    }

    public String getPrevencaoCombateIncendio() {
        return PrevencaoCombateIncendio;
    }

    public void setPrevencaoCombateIncendio(String prevencaoCombateIncendio) {
        PrevencaoCombateIncendio = prevencaoCombateIncendio;
    }

    public String getSeguranca() {
        return seguranca;
    }

    public void setSeguranca(String seguranca) {
        this.seguranca = seguranca;
    }

    public String getVistoriaEngenharia() {
        return vistoriaEngenharia;
    }

    public void setVistoriaEngenharia(String vistoriaEngenharia) {
        this.vistoriaEngenharia = vistoriaEngenharia;
    }

    public Integer getId() {
        return id;
    }

}
