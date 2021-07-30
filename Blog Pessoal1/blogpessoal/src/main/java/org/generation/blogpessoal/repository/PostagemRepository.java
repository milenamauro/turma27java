package org.generation.blogpessoal.repository;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
 


@Repository
@RequestMapping
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByTituloContaingIgnoreCase (String titulo);
	
 
     
}
