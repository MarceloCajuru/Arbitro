package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "competicao")


public class Competicao {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;


 @Column
 private String nomeCompeticao;

 @Column
 private double nTimes;

 @Column
 private String nAtletas;

 @Column
 private String prazoInscricao;

 @Column
 private double pgtArbitro;

 @Column
 private double pgtArbitroAssistente;

 @Column
 private double pgtMesario;

 @Column
 private double pgtKm;

 @Column
 private double pgtDiaria;

 public Competicao(String nomeCompeticao, double nTimes, String nAtletas, String prazoInscricao, double pgtArbitro, double pgtArbitroAssistente, double pgtMesario, double pgtKm, double pgtDiaria, Integer id) {
  this.nomeCompeticao = nomeCompeticao;
  this.nTimes = nTimes;
  this.nAtletas = nAtletas;
  this.prazoInscricao = prazoInscricao;
  this.pgtArbitro = pgtArbitro;
  this.pgtArbitroAssistente = pgtArbitroAssistente;
  this.pgtMesario = pgtMesario;
  this.pgtKm = pgtKm;
  this.pgtDiaria = pgtDiaria;
  this.id = id;
 }

 public String getNomeCompeticao() {
  return nomeCompeticao;
 }

 public void setNomeCompeticao(String nomeCompeticao) {
  this.nomeCompeticao = nomeCompeticao;
 }

 public double getnTimes() {
  return nTimes;
 }

 public void setnTimes(double nTimes) {
  this.nTimes = nTimes;
 }

 public String getnAtletas() {
  return nAtletas;
 }

 public void setnAtletas(String nAtletas) {
  this.nAtletas = nAtletas;
 }

 public String getPrazoInscricao() {
  return prazoInscricao;
 }

 public void setPrazoInscricao(String prazoInscricao) {
  this.prazoInscricao = prazoInscricao;
 }

 public double getPgtArbitro() {
  return pgtArbitro;
 }

 public void setPgtArbitro(double pgtArbitro) {
  this.pgtArbitro = pgtArbitro;
 }

 public double getPgtArbitroAssistente() {
  return pgtArbitroAssistente;
 }

 public void setPgtArbitroAssistente(double pgtArbitroAssistente) {
  this.pgtArbitroAssistente = pgtArbitroAssistente;
 }

 public double getPgtMesario() {
  return pgtMesario;
 }

 public void setPgtMesario(double pgtMesario) {
  this.pgtMesario = pgtMesario;
 }

 public double getPgtKm() {
  return pgtKm;
 }

 public void setPgtKm(double pgtKm) {
  this.pgtKm = pgtKm;
 }

 public double getPgtDiaria() {
  return pgtDiaria;
 }

 public void setPgtDiaria(double pgtDiaria) {
  this.pgtDiaria = pgtDiaria;
 }

 public int getId() {
  return id;
 }


}
