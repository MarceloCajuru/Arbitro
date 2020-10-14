package com.soft.Arbitr.Model;


import javax.persistence.*;

@Entity
@Table(name = "arbitro")

public class Arbitro {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

  @Column
   private String usuarioArbitro;

  @Column
  private String nome;

  @Column
  private String sobrenome;

  @Column
  private String dataNasc;

  @Column
  private String celular;

  @Column
  private String email;

  @Column
  private String rg;

  @Column
  private String cpf;

  @Column
  private String funcao;

  @Column
  private String disponibilidade;

  @Column
  private String senha;


  @ManyToOne
  private Endereco endereco;

   //Documentos para importar

    @Column
    private String docFrente;

    @Column
    private String docVerso;

    @Column
    private String atestadoEsporte;

    @Column
    private String foto34;

    @Column
    private String compEndereco;

    

    public Arbitro(Integer id, String usuarioArbitro, String nome, String sobrenome, String dataNasc, String celular, String email, String rg, String cpf, String funcao, String disponibilidade, String senha, String docFrente, String docVerso, String atestadoEsporte, String foto34, String compEndereco, Endereco endereco) {
        this.id = id;
        this.usuarioArbitro = usuarioArbitro;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.celular = celular;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
        this.funcao = funcao;
        this.disponibilidade = disponibilidade;
        this.senha = senha;
        this.docFrente = docFrente;
        this.docVerso = docVerso;
        this.atestadoEsporte = atestadoEsporte;
        this.foto34 = foto34;
        this.compEndereco= compEndereco;
        this.endereco = endereco;
    }


    public Integer getId() {
        return id;
    }



    public String getUsuarioArbitro() {
        return usuarioArbitro;
    }

    public void setUsuarioArbitro(String usuarioArbitro) {
        this.usuarioArbitro = usuarioArbitro;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getAtestadoEsporte() {
        return atestadoEsporte;
    }

    public void setAtestadoEsporte(String atestadoEsporte) {
        this.atestadoEsporte = atestadoEsporte;
    }

    public String getFoto34() {
        return foto34;
    }

    public void setFoto34(String foto34) {
        this.foto34 = foto34;
    }

    public String getCompEndereco() {
        return compEndereco;
    }

    public void setCompEndereco(String compEndereco) {
        this.compEndereco = compEndereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Arbitro() {
    }
}
