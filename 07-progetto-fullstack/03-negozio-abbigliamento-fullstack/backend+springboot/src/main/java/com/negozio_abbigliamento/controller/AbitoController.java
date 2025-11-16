package com.negozio_abbigliamento.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.negozio_abbigliamento.model.AbitoEntity;
import com.negozio_abbigliamento.service.AbitoService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/abiti")
@CrossOrigin(origins = "http://localhost:4200") // per Angular
public class AbitoController {

    private final AbitoService abitoService;

    public AbitoController(AbitoService abitoService) {
        this.abitoService = abitoService;
    }

    @GetMapping
    public List<AbitoEntity> getAllAbiti() {
        return abitoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AbitoEntity> getAbitoById(@PathVariable Long id) {
        Optional<AbitoEntity> o = abitoService.findById(id);
        return o.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/tipo/{tipo}")
    public List<AbitoEntity> getByTipo(@PathVariable String tipo) {
        return abitoService.findByTipo(tipo);
    }

    @PostMapping
    public ResponseEntity<AbitoEntity> createAbito(@Validated @RequestBody AbitoEntity abito) {
        AbitoEntity saved = abitoService.save(abito);
        return ResponseEntity.created(URI.create("/api/abiti/" + saved.getId())).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AbitoEntity> updateAbito(@PathVariable Long id, @Validated @RequestBody AbitoEntity abitoAggiornato) {
        Optional<AbitoEntity> esistente = abitoService.findById(id);
        if (esistente.isEmpty()) return ResponseEntity.notFound().build();
        AbitoEntity a = esistente.get();
        a.setTipo(abitoAggiornato.getTipo());
        a.setMarca(abitoAggiornato.getMarca());
        a.setTaglia(abitoAggiornato.getTaglia());
        a.setPrezzo(abitoAggiornato.getPrezzo());
        a.setLunghezzaManica(abitoAggiornato.getLunghezzaManica());
        a.setMateriale(abitoAggiornato.getMateriale());
        a.setFit(abitoAggiornato.getFit());
        AbitoEntity saved = abitoService.save(a);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAbito(@PathVariable Long id) {
        Optional<AbitoEntity> e = abitoService.findById(id);
        if (e.isEmpty()) return ResponseEntity.notFound().build();
        abitoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
