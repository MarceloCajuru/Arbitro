package com.soft.Arbitr.Dao;


import com.soft.Arbitr.Model.Arbitro;
import com.soft.Arbitr.Model.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoDAO extends JpaRepository<Banco, Integer> {

}