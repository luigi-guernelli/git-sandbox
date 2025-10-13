package com.guernelli.hellorestapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/** Documentazione: 
 * Primo programma di servizio RESTful
 * 1. Crea un package .controller
 * 2. Mappa la richiesta HTTP GET su /hello
 * 3. Avvia L'applicazione (Run as > Java Application)
 * 4. Testa l'endpoint: http://localhost:8080/hello
 */
@RestController
public class HelloController {
	 
	@GetMapping("/hello") // Metodo HTTP GET
	public String saluta() {
		return "Ciao dal server REST2025 com.guernelli!"; // Risponde con una stringa al client
		

	}
	
}
