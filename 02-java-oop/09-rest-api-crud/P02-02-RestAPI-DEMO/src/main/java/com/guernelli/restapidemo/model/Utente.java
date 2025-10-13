package com.guernelli.restapidemo.model;
/** Documentazione: REST API DEMO
 * 1. Connessione a un database usando JPA (Hibernate)
 * 2. Utilizzo di lombok per evitare boillerplate code
 * 3. Validazione degli input con le annotazioni di Bean Validation (@NotNull, @Size, ecc)
 * 4. CRUD completo (Create, Read, Update, Delete) tramite le API REST
 */
import java.time.LocalDate;

import org.hibernate.tuple.GenerationTiming;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.*;

@Entity    // @Table(name="utenti")
@Data // equivale a @Getter, @Setter, @ToString, @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    private LocalDate dataNascita;
	
}
