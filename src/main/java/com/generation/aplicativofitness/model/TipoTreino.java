package com.generation.aplicativofitness.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_tipo_treino")
public class TipoTreino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Tipo é obrigatório." )
	@Size(min =1, max = 10, message = " O atributo Tipo  deve conter no mínimo 1 caracter e no máximo 10 caracteres.")
	private String tipo;
	
	@NotBlank(message = "O atributo Descricao é obrigatório." )
	@Size(min = 10, max = 100, message = " O atributo Descricao  deve conter no mínimo 50 caracteres e no máximo 100 caracteres.")
	private String descricao;
	
	/*
	@OneToMany(fetchType.LAZY, mappedBy = "-----", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("----")*/
	//private Xxxxx xxxxx
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/*public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}*/

}
