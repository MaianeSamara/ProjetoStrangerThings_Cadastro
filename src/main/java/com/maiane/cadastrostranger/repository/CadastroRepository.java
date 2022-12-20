package com.maiane.cadastrostranger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maiane.cadastrostranger.domain.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{

}
