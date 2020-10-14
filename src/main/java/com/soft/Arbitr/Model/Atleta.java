package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "atleta")


public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nomeAtleta;

    @Column
    private String sobrenomeAtleta;

    @Column
    private String dataNasc;

    @Column
    private String telefoneAtleta;

    @Column
    private int numeroCamisa;

    @Column
    private String funcao;

 //caso for menor 18

    @Column
    private String nomeResponsavel;

    @Column
    private String sobrenomeResponsavel;

    @Column
    private String telefoneResponsavel;


    //documentos

    @Column
    private String docHabitoEsportes;

    @Column
    private String docRg;

    @Column
    private String Cpf;

    @Column
    private String fotoRosto;

    @Column
    private String compEndereco;

    public Atleta(int id, String nomeAtleta, String sobrenomeAtleta, String dataNasc, String telefoneAtleta, int numeroCamisa, String funcao, String nomeResponsavel, String sobrenomeResponsavel, String telefoneResponsavel, String docHabitoEsportes, String docRg, String cpf, String fotoRosto, String compEndereco) {
        this.id = id;
        this.nomeAtleta = nomeAtleta;
        this.sobrenomeAtleta = sobrenomeAtleta;
        this.dataNasc = dataNasc;
        this.telefoneAtleta = telefoneAtleta;
        this.numeroCamisa = numeroCamisa;
        this.funcao = funcao;
        this.nomeResponsavel = nomeResponsavel;
        this.sobrenomeResponsavel = sobrenomeResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.docHabitoEsportes = docHabitoEsportes;
        this.docRg = docRg;
        Cpf = cpf;
        this.fotoRosto = fotoRosto;
        this.compEndereco = compEndereco;
    }

    public Integer getId() {
        return id;
    }


    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public String getSobrenomeAtleta() {
        return sobrenomeAtleta;
    }

    public void setSobrenomeAtleta(String sobrenomeAtleta) {
        this.sobrenomeAtleta = sobrenomeAtleta;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefoneAtleta() {
        return telefoneAtleta;
    }

    public void setTelefoneAtleta(String telefoneAtleta) {
        this.telefoneAtleta = telefoneAtleta;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
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

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getDocHabitoEsportes() {
        return docHabitoEsportes;
    }

    public void setDocHabitoEsportes(String docHabitoEsportes) {
        this.docHabitoEsportes = docHabitoEsportes;
    }

    public String getDocRg() {
        return docRg;
    }

    public void setDocRg(String docRg) {
        this.docRg = docRg;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getFotoRosto() {
        return fotoRosto;
    }

    public void setFotoRosto(String fotoRosto) {
        this.fotoRosto = fotoRosto;
    }

    public String getCompEndereco() {
        return compEndereco;
    }

    public void setCompEndereco(String compEndereco) {
        this.compEndereco = compEndereco;
    }
}
