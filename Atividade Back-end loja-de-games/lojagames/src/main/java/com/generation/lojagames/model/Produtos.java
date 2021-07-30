package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
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
	
	@Min(1)
	private double preco;
	
	private boolean disponivel;
	
    @ManyToOne            //anotacao que vai relacionar isso. O ultimo nome da anotacao referece a quantidade de dados que estou recebendo
	@JsonIgnoreProperties("Produtos")
    private Categoria categoria; //o tipo do dado deve ser o mesmo nome da classse que eu queto relacionar
	
	
	
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
