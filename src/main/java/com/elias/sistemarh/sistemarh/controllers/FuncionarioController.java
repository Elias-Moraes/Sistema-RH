package com.elias.sistemarh.sistemarh.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elias.sistemarh.sistemarh.models.FuncionarioModel;
import com.elias.sistemarh.sistemarh.services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	private final FuncionarioService funcionarioService;

	public FuncionarioController(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}

	@GetMapping("/{Id}")
	public FuncionarioModel getFuncionario(@PathVariable Long Id) {
		return funcionarioService.buscarPorId(Id);
	}

	@PostMapping
	public FuncionarioModel salvarFuncionario(@RequestBody FuncionarioModel funcionario) {
		return funcionarioService.salvar(funcionario);
	}

	@PutMapping("/{Id")
	public FuncionarioModel atualizarFuncionario(@PathVariable Long Id, @RequestBody FuncionarioModel funcionario) {
		return funcionarioService.atualizar(funcionario);
	}

	@DeleteMapping("/{Id")
	public ResponseEntity<String> deleteFuncionario(@PathVariable Long Id) {
		funcionarioService.deletar(Id);
		return ResponseEntity.ok("Funcionário deletado com sucesso!");

	}

}
