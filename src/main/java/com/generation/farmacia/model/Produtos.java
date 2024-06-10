package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity 
@Table(name ="tb_produtos")
public class Produtos {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo nome é obrigatório!")
		@Size(min = 5, max = 50, message="O atributo NOME deve ter no mínimo 5 caracteres e no máximo 100 caracteres.")
		private String nome;
		
		@NotBlank(message = "O atributo remédio é obrigatório!")
		@Size(min = 5, max = 50, message="O atributo NOME deve ter no mínimo 5 caracteres e no máximo 50 caracteres.")
		private String remedio;
		
		@NotBlank(message = "O atributo fitoterapicos é obrigatório!")
		@Size(min = 5, max = 50, message="O atributo NOME deve ter no mínimo 5 caracteres e no máximo 100 caracteres.")
		private String fitoterapicos;
		
		@NotBlank(message = "O atributo dermocosméticos é obrigatório!")
		@Size(min = 5, max = 50, message="O atributo NOME deve ter no mínimo 5 caracteres e no máximo 100 caracteres.")
		private String dermocosmeticos;

		@NotNull(message="O atributo preço é obrigatório!")
		private float preco;
		
		public Categorias getCategorias() {
			return categorias;
		}

		public void setCategorias(Categorias categorias) {
			this.categorias = categorias;
		}

		@ManyToOne
		@JsonIgnoreProperties("produtos")
		private Categorias categorias;
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRemedio() {
			return remedio;
		}

		public void setRemedio(String remedio) {
			this.remedio = remedio;
		}

		public String getFitoterapicos() {
			return fitoterapicos;
		}

		public void setFitoterapicos(String fitoterapicos) {
			this.fitoterapicos = fitoterapicos;
		}

		public String getDermocosmeticos() {
			return dermocosmeticos;
		}

		public void setDermocosmeticos(String dermocosmeticos) {
			this.dermocosmeticos = dermocosmeticos;
		}
		public float getPreco() {
			return preco;
		}
		public void setPreco(float preco) {
			this.preco = preco;
		}
		public String getEstoque() {
			return estoque;
		}
		public void setEstoque(String estoque) {
			this.estoque = estoque;
		}

		@NotBlank(message = "O atributo estoque é obrigatório")
		@PositiveOrZero
		private String estoque;			
	}
