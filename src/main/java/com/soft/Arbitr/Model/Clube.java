package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "clube")

public class Clube {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String usuarioClube;

    @Column
    private String nomeClube;

    @Column
    private String cnpj;

    @Column
    private String dataFundacao;

    @Column
    private String nomeResponsavel;

    @Column
    private String sobrenomeResponsavel;

    @Column
    private String telefoneResponsavel;

    @Column
    private String email;

    @Column
    private String rg;

    @Column
    private String cpf;

    @Column
    private String senha;


//Documentos

  @Column
  private String estatutoTorcedor;

  @Column
  private String ataFundacao;

  @Column
  private String docCnpj;

  @Column
  private String cnd;

  @Column
  private String alvaraFuncionamento;


    public Clube(String usuarioClube, String nomeClube, String cnpj, String dataFundacao, String nomeResponsavel, String sobrenomeResponsavel, String telefoneResponsavel, String email, String rg, String cpf, String senha, String estatutoTorcedor, String ataFundacao, String docCnpj, String cnd, String alvaraFuncionamento, Integer id) {
        this.usuarioClube = usuarioClube;
        this.nomeClube = nomeClube;
        this.cnpj = cnpj;
        this.dataFundacao = dataFundacao;
        this.nomeResponsavel = nomeResponsavel;
        this.sobrenomeResponsavel = sobrenomeResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
        this.senha = senha;
        this.estatutoTorcedor = estatutoTorcedor;
        this.ataFundacao = ataFundacao;
        this.docCnpj = docCnpj;
        this.cnd = cnd;
        this.alvaraFuncionamento = alvaraFuncionamento;
        this.id = id;
    }

    public String getUsuarioClube() {
        return usuarioClube;
    }

    public void setUsuarioClube(String usuarioClube) {
        this.usuarioClube = usuarioClube;
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEstatutoTorcedor() {
        return estatutoTorcedor;
    }

    public void setEstatutoTorcedor(String estatutoTorcedor) {
        this.estatutoTorcedor = estatutoTorcedor;
    }

    public String getAtaFundacao() {
        return ataFundacao;
    }

    public void setAtaFundacao(String ataFundacao) {
        this.ataFundacao = ataFundacao;
    }

    public String getDocCnpj() {
        return docCnpj;
    }

    public void setDocCnpj(String docCnpj) {
        this.docCnpj = docCnpj;
    }

    public String getCnd() {
        return cnd;
    }

    public void setCnd(String cnd) {
        this.cnd = cnd;
    }

    public String getAlvaraFuncionamento() {
        return alvaraFuncionamento;
    }

    public void setAlvaraFuncionamento(String alvaraFuncionamento) {
        this.alvaraFuncionamento = alvaraFuncionamento;
    }

    public Integer getId() {
        return id;
    }

}
