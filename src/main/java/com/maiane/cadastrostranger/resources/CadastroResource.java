package com.maiane.cadastrostranger.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maiane.cadastrostranger.domain.Cadastro;
import com.maiane.cadastrostranger.repository.CadastroRepository;
import com.maiane.cadastrostranger.servico.CadastroServico;

@RestController
@RequestMapping(value="/cadastros")
public class CadastroResource {
	
	@Autowired
	private CadastroRepository repository;
	
	@Autowired
	private CadastroServico servico;

	@GetMapping
	public List<Cadastro> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	public Cadastro salva(@RequestBody Cadastro cadastro) {
		return servico.salvar(cadastro);
	}
}
