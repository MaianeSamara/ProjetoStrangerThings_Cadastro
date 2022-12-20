package com.maiane.cadastrostranger.servico;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiane.cadastrostranger.domain.Cadastro;
import com.maiane.cadastrostranger.repository.CadastroRepository;

@Service
public class CadastroServico {

	@Autowired
	private CadastroRepository repository;
	
	public Cadastro salvar(Cadastro cadastro) {
		cadastro.setDataCadastro(new Date());
		return repository.save(cadastro);
	}
}
