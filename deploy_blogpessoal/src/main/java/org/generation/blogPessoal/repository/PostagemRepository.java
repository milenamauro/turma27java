package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//anotacao avisa ao spring que essa é uma classe repositorio
@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	//consulta pelo tutilo da postagem
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);

}
