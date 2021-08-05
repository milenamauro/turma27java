package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//essa anotação indica essa classe é uma entidade do jpa ibernate
@Entity
//essa entidade dentro do banco de dados ela vira uma tabela, sera de postagens
@Table(name = "postagem") // crea postagem
//primeiro um ID
public class Postagem {

	@Id // Tudo isso até idenitty se comporta como chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // um valor que será gerado auto incremento
	private long id; // big int

	@NotNull // Anotacao para dizer que não pode ter titulo nulo
	@Size(min = 5, max = 100) // anotação para a quantidade de caracter que o cliente consegue mandar como
								// titulo
	private String titulo; // tipo o varchar (100)

	@NotNull // Anotacao para dizer que não pode ter titulo nulo
	// anotação para a quantidade de caracter que o cliente consegue mandar como
	// titulo
	@Size(min = 10, max = 500)
	private String texto;

	@Temporal(TemporalType.TIMESTAMP) // anotação que vai indicar o JPA ibernate que estamos trabalhando com tempo
	private Date date = new java.sql.Date(System.currentTimeMillis()); // pega a data atual e preeenche

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}


}
