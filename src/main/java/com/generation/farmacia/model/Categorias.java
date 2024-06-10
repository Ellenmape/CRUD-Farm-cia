package com.generation.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categorias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O título da categoria é obrigatório")
	@Size(min = 4, max = 100, message = "O atributo título deve ter no mínimo 4 caracteres e no máximo 100 caracteres.")
	private String titulo;

	@NotBlank(message = "O atributo descrição é obrigatório")
	@Size(min = 4, max = 100, message = "O campo descricao precisa ter entre 4 e 100 caracteres")
	private String descricao;
	
	@NotBlank(message = "O atributo produto medicamento é obrigatório")
	@Size(min = 4, max = 100, message = "O campo descricao precisa ter entre 4 e 100 caracteres")
	private String medicamentos;
	
	@NotBlank(message = "O atributo produto de perfumaria é obrigatório")
	@Size(min = 4, max = 100, message = "O campo descricao precisa ter entre 4 e 100 caracteres")
	private String perfumaria;
	
	@NotBlank(message = "O atributo quantidade é obrigatório")
	@PositiveOrZero
	private int quantidade;

	public Long getId() {
		return id;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getPerfumaria() {
		return perfumaria;
	}

	public void setPerfumaria(String perfumaria) {
		this.perfumaria = perfumaria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
