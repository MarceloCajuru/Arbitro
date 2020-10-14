package com.soft.Arbitr.Model;

import javax.persistence.*;

@Entity
@Table(name = "noticia")

public class Noticia {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;

 @Column
 private String data;

 @Column
 private String noticiaTitulo;

 @Column
 private String noticiaEscrita;

 @Column
 private String Imagem;


 public Noticia(String data, String noticiaTitulo, String noticiaEscrita, String imagem, Integer id) {
  this.data = data;
  this.noticiaTitulo = noticiaTitulo;
  this.noticiaEscrita = noticiaEscrita;
  this.Imagem = imagem;
  this.id = id;
 }

 public String getData() {
  return data;
 }

 public void setData(String data) {
  this.data = data;
 }

 public String getNoticiaTitulo() {
  return noticiaTitulo;
 }

 public void setNoticiaTitulo(String noticiaTitulo) {
  this.noticiaTitulo = noticiaTitulo;
 }

 public String getNoticiaEscrita() {
  return noticiaEscrita;
 }

 public void setNoticiaEscrita(String noticiaEscrita) {
  this.noticiaEscrita = noticiaEscrita;
 }

 public String getImagem() {
  return Imagem;
 }

 public void setImagem(String imagem) {
  Imagem = imagem;
 }

 public Integer getId() {
  return id;
 }


}
