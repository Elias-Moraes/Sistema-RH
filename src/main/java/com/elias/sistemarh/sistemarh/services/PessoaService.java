package com.elias.sistemarh.sistemarh.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elias.sistemarh.sistemarh.models.PessoaModel;
import com.elias.sistemarh.sistemarh.repository.PessoaRepository;

@Service
public class PessoaService {

	private final PessoaRepository pessoaRepository;

	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	public PessoaModel salvar(PessoaModel pessoa) {
		return pessoaRepository.save(pessoa);
	}

	public PessoaModel atualizar(PessoaModel pessoa) {
		return pessoaRepository.save(pessoa);
	}

	public List<PessoaModel> buscaTodos() {
		return pessoaRepository.findAll();

	}
	public PessoaModel bucaId(Long id) {
		return pessoaRepository.findById(id).orElse(null);
	}
}
