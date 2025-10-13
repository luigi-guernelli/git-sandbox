package com.guernelli.restapidemo.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Documentazione: DTO (Data Transfer Object) > protezione e trasformazione dei dati
 * Un DTO è una classse che trasporta dati tra il client e il server.
 */

@Data // Crea Getter, Setter, ToString
@NoArgsConstructor // Crea un costruttore vuoto
@AllArgsConstructor // Crea un Costruttore con tutti i campi
@Builder // Permette la creazione oggetti con Utente.builder().nome(...).build()

public class UtenteDTO {

	private Long id;
	
	// @NotBlank Campo non può essere vuoto o null
	@NotBlank(message = "Il nome è obbligatorio")
	private String nome;
	
	
	@Email // Verifica se l'input è una mail valida
	@NotBlank(message = "L'email è obbligatoria")
	private String email;
	
	// @Past la deta deve essere nel passato
	@Past(message = "La data di nascita deve essere nel passato")
	private LocalDate dataNascita;
	
}
