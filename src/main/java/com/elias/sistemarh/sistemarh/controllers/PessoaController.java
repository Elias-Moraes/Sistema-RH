package com.elias.sistemarh.sistemarh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elias.sistemarh.sistemarh.models.PessoaModel;
import com.elias.sistemarh.sistemarh.repository.PessoaRepository;

@RestController
@RequestMapping(value = "/api/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping
	public ResponseEntity<List<pessoaRepository>> getAllPessoa(){
		return ResponseEntity.ok(pessoaRepository.findAll());
	}
}
