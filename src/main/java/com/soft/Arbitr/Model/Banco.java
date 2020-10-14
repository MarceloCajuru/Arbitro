package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "banco")

public class Banco {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;

 @Column
 private String nomeBanco;

 @Column
 private String bancoAgencia;

 @Column
 private String nconta;

 public Banco(String nomeBanco, String bancoAgencia, String nconta, Integer id) {
  this.nomeBanco = nomeBanco;
  this.bancoAgencia = bancoAgencia;
  this.nconta = nconta;
  this.id = id;
 }

 public String getNomeBanco() {
  return nomeBanco;
 }

 public void setNomeBanco(String nomeBanco) {
  this.nomeBanco = nomeBanco;
 }

 public String getBancoAgencia() {
  return bancoAgencia;
 }

 public void setBancoAgencia(String bancoAgencia) {
  this.bancoAgencia = bancoAgencia;
 }

 public String getNconta() {
  return nconta;
 }

 public void setNconta(String nconta) {
  this.nconta = nconta;
 }

 public Integer getId() {
  return id;
 }

 public Banco() {
 }
}
