package com.spring.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.jpa.model.ClienteEntity;
import com.spring.jpa.repository.ClienteRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ClienteRepository clienteRepository;

    public DataInitializer(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Se vuoi evitare duplicati, puoi verificare se è vuoto
        if (clienteRepository.count() == 0) {
            clienteRepository.save(new ClienteEntity("Mario", "Rossi", "mario.rossi@example.com"));
            clienteRepository.save(new ClienteEntity("Luigi", "Verdi", "luigi.verdi@example.com"));
            clienteRepository.save(new ClienteEntity("Anna", "Bianchi", "anna.bianchi@example.com"));
            System.out.println("Dati iniziali caricati nel DB.");
        } else {
            System.out.println("Il database ha già dati, salta l’inizializzazione.");
        }
    }
}

