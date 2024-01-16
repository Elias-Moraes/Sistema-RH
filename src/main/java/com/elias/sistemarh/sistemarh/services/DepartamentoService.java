package com.elias.sistemarh.sistemarh.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elias.sistemarh.sistemarh.models.DepartamentoModel;
import com.elias.sistemarh.sistemarh.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

	private final DepartamentoRepository departamentoRepositoty;

	public DepartamentoService(DepartamentoRepository departamentoRepository) {
		this.departamentoRepositoty = departamentoRepository;
	}

	public DepartamentoModel salvar(DepartamentoModel departamento) {
		return departamentoRepositoty.save(departamento);
	}

	public DepartamentoModel atualizar(DepartamentoModel depatamento) {
		return departamentoRepositoty.save(depatamento);
	}

	public void deletar(Long Id) {
		departamentoRepositoty.deleteById(Id);
	}

	public List<DepartamentoModel> buscaTodos() {
		return departamentoRepositoty.findAll();
	}

	public DepartamentoModel buscaId(Long Id) {
		return departamentoRepositoty.findById(Id).orElse(null);

	}
}
