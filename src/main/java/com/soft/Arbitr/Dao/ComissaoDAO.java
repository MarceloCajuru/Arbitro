package com.soft.Arbitr.Dao;

import com.soft.Arbitr.Model.Arbitro;
import com.soft.Arbitr.Model.Comissao;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface ComissaoDAO extends JpaRepository<Comissao, Integer> {

}
