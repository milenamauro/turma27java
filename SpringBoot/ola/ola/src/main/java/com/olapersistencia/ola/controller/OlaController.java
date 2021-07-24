package com.olapersistencia.ola.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 ;

@RestController
 @RequestMapping("/Oi")
public class OlaController {
	
	@GetMapping 
    public String ola() {
		return "Olá Persistência!!!!";
	}
}
