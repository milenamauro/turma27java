package com.generation.lojagames.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojagames.model.Usuario;
import com.generation.lojagames.model.UsuarioLogin;
import com.generation.lojagames.service.UsuarioService;

@RestController
@RequestMapping ("/usuarios")
@CrossOrigin(origins ="*", allowedHeaders="*")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> loginUsuario (@RequestBody Optional<UsuarioLogin> usuarioLogin){
	
	return UsuarioService.loginUsuario(usuarioLogin)
			.map(resp-> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	@PostMapping("/cadastrar")
	public ResponseEntity<UsuarioLogin> postUsuario (@RequestBody Usuario usuario){
	
	return UsuarioService.cadastrarUsuario (usuario)
			.map(resp-> ResponseEntity.status(HttpStatus.CREATED).body(resp))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST.build()));
	}
	
	
	@PostMapping("/alterar")
	public ResponseEntity<Usuario> putsUsuario (@RequestBody Usuario usuario){
	
	return UsuarioService.atualizarUsuario (usuario)
			.map(resp-> ResponseEntity.status(HttpStatus.OK).body(resp))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST.build()));
	}
	
}
