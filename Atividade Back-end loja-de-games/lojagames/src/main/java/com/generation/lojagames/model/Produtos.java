package com.generation.lojagames.model;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name= "tb_produtos")
public class Produtos {

	@Id
	@GeneratedValue ()
	private long id;
	
	
	@NotBlank
	@Size (min=1, max=100)
	private String nome;
	
	@NotNull
	@Positive
	private double preco;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getPreco() {
		return preco;
	}


	@ManyToOne
	@JsonIgnoreProperties("produtos")
			private Categoria categoria;
	@ManyToOne
	@JsonIgnoreProperties("produtos")
			private Usuario usuario;

	
	
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

 
	public void setPreco(double preco) {
		this.preco = preco;
	}

	 
	
	
}
