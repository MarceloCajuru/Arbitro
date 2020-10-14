package com.soft.Arbitr.Dao;

import com.soft.Arbitr.Model.Arbitro;
import com.soft.Arbitr.Model.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface AtletaDAO extends JpaRepository<Atleta, Integer> {
}
