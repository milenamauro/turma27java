package generation.farmacia.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import generation.farmacia.model.Produto;
import generation.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping ("/produtos")
@CrossOrigin ("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Produto>> buscarTodos(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Produto> buscarPorId(@PathVariable long id){
		return repositorio.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/nome/{nome}")
	public ResponseEntity<List<Produto>> buscarPorNome(@PathVariable String nome){
		return ResponseEntity.ok(repositorio.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produto> cadastrarProduto(@RequestBody @Valid Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> atualizarProduto (@RequestBody @Valid Produto produto){
		return ResponseEntity.ok(repositorio.save(produto));
	}
	
	@DeleteMapping ("/{id}")
	public void deletar (@PathVariable long id) {
		repositorio.deleteById(id);
	}
	
}