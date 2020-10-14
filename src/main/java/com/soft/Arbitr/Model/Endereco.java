package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "endereco")

public class Endereco {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;

 @Column
 private String cep;

 @Column
 private String endereco;

 @Column
 private String numero;

 @Column
 private String complemento;

 @Column
 private String bairro;

 @Column
 private String municipio;

 @Column
 private String uf;

 public Endereco(String cep, String endereco, String numero, String complemento, String bairro, String municipio, String uf, Integer id) {
  this.cep = cep;
  this.endereco = endereco;
  this.numero = numero;
  this.complemento = complemento;
  this.bairro = bairro;
  this.municipio = municipio;
  this.uf = uf;
  this.id = id;
 }

 public String getCep() {
  return cep;
 }

 public void setCep(String cep) {
  this.cep = cep;
 }

 public String getEndereco() {
  return endereco;
 }

 public void setEndereco(String endereco) {
  this.endereco = endereco;
 }

 public String getNumero() {
  return numero;
 }

 public void setNumero(String numero) {
  this.numero = numero;
 }

 public String getComplemento() {
  return complemento;
 }

 public void setComplemento(String complemento) {
  this.complemento = complemento;
 }

 public String getBairro() {
  return bairro;
 }

 public void setBairro(String bairro) {
  this.bairro = bairro;
 }

 public String getMunicipio() {
  return municipio;
 }

 public void setMunicipio(String municipio) {
  this.municipio = municipio;
 }

 public String getUf() {
  return uf;
 }

 public void setUf(String uf) {
  this.uf = uf;
 }

 public Integer getId() {
  return id;
 }

 public Endereco() {
 }
}
