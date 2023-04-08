package com.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestao.model.Convidado;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long> {

}
