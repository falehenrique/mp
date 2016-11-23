package br.com.mercadopago.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercadopago.domain.Teste;

@RestController
public class TesteController {

	@RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
	public Teste teste() {
		Teste t = new Teste("a", 1);
		return t;
	}

	@RequestMapping(value = "/jsonPost", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Teste testePost(@RequestBody Teste t) {
		t.getNome();
		return t;
	}
}
