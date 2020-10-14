package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "comunicado")

public class Comunicado {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;

 @Column
 private String data;

 @Column
 private String direcionamento;

 @Column
 private String titulo;

 @Column
 private String comunicadoo;

 @Column
 private String imagem;


 public Comunicado(String data, String direcionamento, String titulo, String comunicadoo, String imagem, Integer id) {
  this.data = data;
  this.direcionamento = direcionamento;
  this.titulo = titulo;
  this.comunicadoo = comunicadoo;
  this.imagem = imagem;
  this.id = id;
 }

 public String getData() {
  return data;
 }

 public void setData(String data) {
  this.data = data;
 }

 public String getDirecionamento() {
  return direcionamento;
 }

 public void setDirecionamento(String direcionamento) {
  this.direcionamento = direcionamento;
 }

 public String getTitulo() {
  return titulo;
 }

 public void setTitulo(String titulo) {
  this.titulo = titulo;
 }

 public String getComunicadoo() {
  return comunicadoo;
 }

 public void setComunicadoo(String comunicadoo) {
  this.comunicadoo = comunicadoo;
 }

 public String getImagem() {
  return imagem;
 }

 public void setImagem(String imagem) {
  this.imagem = imagem;
 }

 public Integer getId() {
  return id;
 }

}
