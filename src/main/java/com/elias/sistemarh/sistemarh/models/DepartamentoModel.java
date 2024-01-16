package com.elias.sistemarh.sistemarh.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class DepartamentoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdDepartamento;

	@Column(name = "nome_departamento")
	private String NomeDepartamento;

	@Column(name = "gesto_departamento")
	@ManyToOne
	private FuncionarioModel GestoDepartamento;

	public Long getIdDepartamento() {
		return IdDepartamento;
	}

	public void setIdDepartamento(Long idDepartamento) {
		IdDepartamento = idDepartamento;
	}

	public String getNomeDepartamento() {
		return NomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		NomeDepartamento = nomeDepartamento;
	}

	public FuncionarioModel getGestoDepartamento() {
		return GestoDepartamento;
	}

	public void setGestoDepartamento(FuncionarioModel gestoDepartamento) {
		GestoDepartamento = gestoDepartamento;
	}

}
