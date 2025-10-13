package com.guernelli.restapidemo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.guernelli.restapidemo.dto.UtenteDTO;
import com.guernelli.restapidemo.exception.RisorsaNonTrovataException;
import com.guernelli.restapidemo.model.Utente;
/** Documentazione UtenteService.java
 * 
 */
import com.guernelli.restapidemo.repository.UtenteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UtenteService {

	private final UtenteRepository utenteRepository;

	public List<UtenteDTO> trovaTutti() {
		return utenteRepository.findAll()
				// Java References Methods
				.stream().map(this::toDTO).collect(Collectors.toList());

	}

	public UtenteDTO trovaPerId(Long id) {
		Utente utente = utenteRepository.findById(id)
				.orElseThrow(() -> new RisorsaNonTrovataException("Utente non trovato")); // <-Lambda
		return toDTO(utente);
	}

    public UtenteDTO crea(UtenteDTO dto) {
        Utente nuovo = toEntity(dto);
        return toDTO(utenteRepository.save(nuovo));
    }

	public UtenteDTO aggiorna(Long id, UtenteDTO dto) {
		Utente utente = utenteRepository.findById(id)
				.orElseThrow(() -> new RisorsaNonTrovataException("Utente non trovato"));
		utente.setNome(dto.getNome());
		utente.setEmail(dto.getEmail());
		utente.setDataNascita(dto.getDataNascita());
		return toDTO(utenteRepository.save(utente));

	}
	

	
	public void elimina(Long id) {
		if(!utenteRepository.existsById(id)) {
			throw new RisorsaNonTrovataException("Utente non trovato");
		}
		utenteRepository.deleteById(id);
	}

	
    // Conversione Entity ⇄ DTO
	private UtenteDTO toDTO(Utente utente) {
		return UtenteDTO.builder()
                .id(utente.getId())
                .nome(utente.getNome())
                .email(utente.getEmail())
                .dataNascita(utente.getDataNascita())
                .build();
	}
	
	private Utente toEntity(UtenteDTO dto) {
		 return Utente.builder()
	                .nome(dto.getNome())
	                .email(dto.getEmail())
	                .dataNascita(dto.getDataNascita())
	                .build();
	}
	

}
