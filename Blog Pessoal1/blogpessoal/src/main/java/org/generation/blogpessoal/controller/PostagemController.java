package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController 
@RequestMapping("/postagem")
@CrossOrigin("*")
public class PostagemController<Postagem> {
	
	
	@Autowired
	private PostagemRepository reposity;
	
	@GetMapping
	public ResponseEntity<List<org.generation.blogpessoal.model.Postagem>> GetAll(){ //cria um objeto padrão HTTP
		return ResponseEntity.ok(reposity.findAll());
		
		
	}

}
