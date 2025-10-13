package com.guernelli.restjson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guernelli.restjson.model.Persona;

/** Documentazione:
 *  Terzo step: Crea il controller REST
 *  @RestController -> indica che questa classe gestisce le richieste REST
 *  @RequestMapping("/api/persona") -> prefisso per tutti gli endpoint
 *  @GetMapping E @PostMapping -> associano i parametri all'URL
 *  @RequestBody -> legge il corpo JSON di una richiesta POST
 */

@RestController
@RequestMapping("/api/persona")
public class PersonaController {
	
	/** GET browser: http://localhost:8080/api/persona/info?nome=luigi&eta=25
	 * La richiesta GET con parametri dinamici ti permette di
	 * passare valori direttamente nell'URL
	 * ricevere i parametri nel controller con @RequestParam
	 * generare un oggetto come: Persona in questo caso
	 * Ricevere una risposta un JSON formattato
	 */
	@GetMapping("/info")
	public Persona getInfo( String nome, int eta) {
		return new Persona(nome, eta); // Spring lo tasforma in JSON
	}
	
	
	 /**  POST JSON Postman: http://localhost:8080/api/persona/invia
	  *   Per visualizzare la POST e consigliato utilizzare POSTMAN
	  *   Il browser darà La Whitelabel Error Page semplicemente
	  *   per un errore utilizzo del metodo HTTP
	  *   
	  *   http://localhost:8080/api/persona/invia
	  */
	
    @PostMapping("/invia")
    public String riceviJson(@RequestBody Persona persona) {
        return "Ricevuto: " + persona.getNome() + ", età: " + persona.getEta();
        
        /** Inserisci in POSTMAN questo JSON
         * {
         *  "nome": "Luigi",
         *   "eta": 24
         *   }
         */

    }
}
