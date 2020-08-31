package com.helloSpring.comunidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comunidade")
public class comunidadeController {
	
	@GetMapping
	public String getComunidade() {
		return"Um momento em grupo marcante na minha vida foi quando "
				+ "um amigo proximo teve que se mudar para outro estado.\n"
				+ "Essa ultima reunião que realizamos foi bem especial para todos.";	
	}
	
}
