package com.guernelli.test;

import com.guernelli.test.model.*;
import com.guernelli.test.repository.TestRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializerTest implements CommandLineRunner {

    private final TestRepository testRepository;

    public DataInitializerTest(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Test 1
        DettaglioTestEntity dettaglio1 = new DettaglioTestEntity("Luigi", "Note di esempio 1");
        TestEntity test1 = new TestEntity("Test A", "Descrizione test A", dettaglio1);
        testRepository.save(test1);

        // Test 2
        DettaglioTestEntity dettaglio2 = new DettaglioTestEntity("Mika", "Note di esempio 2");
        TestEntity test2 = new TestEntity("Test B", "Descrizione test B", dettaglio2);
        testRepository.save(test2);

        // Test 3
        DettaglioTestEntity dettaglio3 = new DettaglioTestEntity("Anonimo", "Note extra");
        TestEntity test3 = new TestEntity("Test C", "Test di esempio C", dettaglio3);
        testRepository.save(test3);

        System.out.println("✅ Dati inizializzati con successo!");
    }
}
