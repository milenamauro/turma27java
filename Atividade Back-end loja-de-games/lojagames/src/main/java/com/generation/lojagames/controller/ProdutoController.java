package com.generation.lojagames.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojagames.model.Produtos;
import com.generation.lojagames.repository.ProdutoRepository;


@RestController
@RequestMapping ("/produto")
@CrossOrigin ("*")
public class ProdutoController {
     
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List <Produtos>> GetAll(){
		return  ResponseEntity.ok(repository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produtos> GetByid(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok (resp)).
				orElse(ResponseEntity.notFound().build());
	}
	
	  @GetMapping("/nome/{nome}")
	  public ResponseEntity<List<Produtos>> GetByNome(@PathVariable String nome){
		  return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	  }
	  
	  @PostMapping
	 public ResponseEntity<Produtos> Post(@RequestBody Produtos produtos){
		  return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produtos));
	  }
	  
	 @PutMapping
	 public ResponseEntity<Produtos> Put(@RequestBody Produtos produtos){
		 return ResponseEntity.status(HttpStatus.OK).body (repository.save(produtos));
	 }
	 
	 @DeleteMapping ("{id}")
	 public void delete (@PathVariable long id) {
		 repository.deleteById(id);
	 }
}