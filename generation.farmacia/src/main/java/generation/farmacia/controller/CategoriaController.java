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

import generation.farmacia.model.Categoria;
import generation.farmacia.repository.CategoriaRepository;

@RestController
@RequestMapping ("/categorias")
@CrossOrigin ("*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> buscarTodos(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Categoria> buscarPorId(@PathVariable long id){
		return repositorio.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/nome/{nome}")
	public ResponseEntity<List<Categoria>> buscarPorDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(repositorio.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> cadastrarCategoria(@RequestBody @Valid Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> atualizarCategoria (@RequestBody @Valid Categoria categoria){
		return ResponseEntity.ok(repositorio.save(categoria));
	}
	
	@DeleteMapping ("/{id}")
	public void deletar (@PathVariable long id) {
		repositorio.deleteById(id);
	}
	
}