package com.negozio_abbigliamento.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 * Classe concreta AbitoEntity: definisce tutti gli attributi di abiti (pantaloni, camicie, maglioni)
 */
@Entity
@Table(name = "abito")
public class AbitoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo", length = 20, nullable = false)
    private String tipo; // "PANTALONE", "CAMICIA", "MAGLIONE"

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "taglia", nullable = false)
    private String taglia;

    @Column(name = "prezzo", nullable = false, precision = 12, scale = 2)
    private BigDecimal prezzo;

    @Column(name = "lunghezza_manica")
    private String lunghezzaManica; // utile per camicie

    @Column(name = "materiale")
    private String materiale; // utile per maglioni/pantaloni

    @Column(name = "fit")
    private String fit; // utile per pantaloni

    // --- Costruttori ---
    public AbitoEntity() {}

    public AbitoEntity(String tipo, String marca, String taglia, BigDecimal prezzo,
                       String lunghezzaManica, String materiale, String fit) {
        this.tipo = tipo;
        this.marca = marca;
        this.taglia = taglia;
        this.prezzo = prezzo;
        this.lunghezzaManica = lunghezzaManica;
        this.materiale = materiale;
        this.fit = fit;
    }

    // --- Getter e Setter ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getTaglia() { return taglia; }
    public void setTaglia(String taglia) { this.taglia = taglia; }

    public BigDecimal getPrezzo() { return prezzo; }
    public void setPrezzo(BigDecimal prezzo) { this.prezzo = prezzo; }

    public String getLunghezzaManica() { return lunghezzaManica; }
    public void setLunghezzaManica(String lunghezzaManica) { this.lunghezzaManica = lunghezzaManica; }

    public String getMateriale() { return materiale; }
    public void setMateriale(String materiale) { this.materiale = materiale; }

    public String getFit() { return fit; }
    public void setFit(String fit) { this.fit = fit; }

    @Override
    public String toString() {
        return "AbitoEntity{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", taglia='" + taglia + '\'' +
                ", prezzo=" + prezzo +
                ", lunghezzaManica='" + lunghezzaManica + '\'' +
                ", materiale='" + materiale + '\'' +
                ", fit='" + fit + '\'' +
                '}';
    }
}
