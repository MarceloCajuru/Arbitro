package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "dirigentes")


public class Dirigentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column
    private String nomeCompleto;

    @Column
    private String rg;

    @Column
    private String cpf;

    @Column
    private String telefone;

    @Column
    private String cargo;

    @Column
    private String duracaoMandato;

 // documentos

    @Column
    private String docFrente;

    @Column
    private String docVerso;

    @Column
    private String compEndereco;

    public Dirigentes(String nomeCompleto, String rg, String cpf, String telefone, String cargo, String duracaoMandato, String docFrente, String docVerso, String compEndereco, Integer id) {
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cargo = cargo;
        this.duracaoMandato = duracaoMandato;
        this.docFrente = docFrente;
        this.docVerso = docVerso;
        this.compEndereco = compEndereco;
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDuracaoMandato() {
        return duracaoMandato;
    }

    public void setDuracaoMandato(String duracaoMandato) {
        this.duracaoMandato = duracaoMandato;
    }

    public String getDocFrente() {
        return docFrente;
    }

    public void setDocFrente(String docFrente) {
        this.docFrente = docFrente;
    }

    public String getDocVerso() {
        return docVerso;
    }

    public void setDocVerso(String docVerso) {
        this.docVerso = docVerso;
    }

    public String getCompEndereco() {
        return compEndereco;
    }

    public void setCompEndereco(String compEndereco) {
        this.compEndereco = compEndereco;
    }

    public Integer getId() {
        return id;
    }

}

