package org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;
//parametros (essa classe vai se do jkibernate)
@Entity
@Table (name ="Postagem")
public class Postagem {
      
	 @Id //como ira se comportar
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	 @NotNull
	  private long id;
	 
	 @NotBlank //o campo não pode ser vazio ou nulo
	 @Size(min = 5, max= 100) //define quantidade min de caractere
	 private String nome;

	
	 
	 @Min (value=18, message= "Idade minima 18")
	 private int idade;
	 
	 
	 private boolean ativo;
	 

	 
	  @Temporal (TemporalType.TIMESTAMP)
	  private Date date = new java.sql.Date(System.currentTimeMillis());
	public long getId() {
		return id;
	}
	
	
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	};
	  
}
