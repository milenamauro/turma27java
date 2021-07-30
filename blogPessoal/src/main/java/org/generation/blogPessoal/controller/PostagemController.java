package org.generation.blogPessoal.controller;

import java.awt.List;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;

//mostrar que é um controler
@RestController
//uri consume essa classe,  
@RequestMapping ("/postagens")
//o front end vem de uma origem diferente e consume essa parte
@CrossOrigin ("*")
public class PostagemController<Postagem> {
    
	//spting, todos serviçoes dessa interface esteja acessada a partir do controller
	@Autowired
	private PostagemRepository repository; 
	
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
	return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<org.generation.blogPessoal.model.Postagem> GetById (@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)) 
				.orElse(ResponseEntity.notFound().build());
		
	}
	 @GetMapping("/titulo/{titulo}")
	 public ResponseEntity<List <Postagem>> GetByTitulo(@PathVariable String titulo){
		 return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	 }
	 @PutMapping
	 public ResponseEntity<org.generation.blogPessoal.model.Postagem> put (@RequestBody Postagem) {
		 return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
		 
	 }
}
