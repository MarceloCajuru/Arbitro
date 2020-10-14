package com.soft.Arbitr.Dao;


import com.soft.Arbitr.Model.Arbitro;
import com.soft.Arbitr.Model.Comunicado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComunicadoDAO extends JpaRepository<Comunicado, Integer> {


}