package com.soft.Arbitr.Dao;

import com.soft.Arbitr.Model.Arbitro;
import com.soft.Arbitr.Model.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaDAO extends JpaRepository<Noticia, Integer> {

}