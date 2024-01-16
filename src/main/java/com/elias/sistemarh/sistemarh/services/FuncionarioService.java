package com.elias.sistemarh.sistemarh.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elias.sistemarh.sistemarh.models.FuncionarioModel;
import com.elias.sistemarh.sistemarh.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;

	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}

	public FuncionarioModel salvar(FuncionarioModel funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	public FuncionarioModel atualizar(FuncionarioModel funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	public void deletar(Long id) {
		funcionarioRepository.deleteById(id);
	}

	public List<FuncionarioModel> buscarTodos() {
		return funcionarioRepository.findAll();
	}

	public FuncionarioModel buscarPorId(Long id) {
		return funcionarioRepository.findById(id).orElse(null);
	}

}
