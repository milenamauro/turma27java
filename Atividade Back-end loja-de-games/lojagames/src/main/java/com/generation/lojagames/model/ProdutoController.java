package com.generation.lojagames.model;

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

import com.generation.lojagames.model.repository.CategoriaRepository;


@RestController
@RequestMapping ("/categoria")
@CrossOrigin ("*")
public class ProdutoController {
     
	
	@Autowired
	private ProdutoController controller;
	
	@GetMapping
	public ResponseEntity<List <Produtos>> GetAll(){
		return  ResponseEntity.ok(Repository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produtos> GetByid(@PathVariable long id){
		return controller.findById(id)
				.map(resp -> ResponseEntity.ok (resp)).
				orElse(ResponseEntity.notFound().build());
	}
	
	  @GetMapping("/descrição/{descricao}")
	  public ResponseEntity<List<Produtos>> GetByDescricao(@PathVariable String descricao){
		  return ResponseEntity.ok(controller.FindAllByDescricaoContaingIgnoreCase(descricao));
	  }
	  
	  @PostMapping
	 public ResponseEntity<Produtos> Post(@RequestBody Categoria post){
		  return ResponseEntity.status(HttpStatus.CREATED).body(controller.save(post));
	  }
	  
	 @PutMapping
	 public ResponseEntity<Produtos> Pur(@RequestBody Categoria put){
		 return ResponseEntity.status(HttpStatus.OK).body (Repository.save(put));
	 }
	 
	 @DeleteMapping ("{id}")
	 public void delete (@PathVariable long id) {
		 controller.deleteById(id);
	 }
}