package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "comissao")

public class Comissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

   @Column
    private String nome;

   @Column
   private String sobrenome;

//menor 18 nao aceita
    @Column
    private String dataNasc;

   @Column
   private String rg;

   @Column
   private String cpf;

   @Column
   private String funcao;

 //documentos padrao

    @Column
    private String compEndereco;

 //caso for médico

    @Column
    private String crm;

    @Column
    private String fotoCrm;

    //caso for preparador,

    @Column
    private String cref;

    @Column
    private String fotoCref;


      //fisioterapeuta

        @Column
        private String Crefito;

    public Comissao(Integer id, String nome, String sobrenome, String dataNasc, String rg, String cpf, String funcao, String crm, String fotoCrm, String cref, String fotoCref, String crefito, String compEndereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.funcao = funcao;
        this.crm = crm;
        this.fotoCrm = fotoCrm;
        this.cref = cref;
        this.fotoCref = fotoCref;
        Crefito = crefito;
        this.compEndereco = compEndereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getFotoCrm() {
        return fotoCrm;
    }

    public void setFotoCrm(String fotoCrm) {
        this.fotoCrm = fotoCrm;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public String getFotoCref() {
        return fotoCref;
    }

    public void setFotoCref(String fotoCref) {
        this.fotoCref = fotoCref;
    }

    public String getCrefito() {
        return Crefito;
    }

    public void setCrefito(String crefito) {
        Crefito = crefito;
    }
}
