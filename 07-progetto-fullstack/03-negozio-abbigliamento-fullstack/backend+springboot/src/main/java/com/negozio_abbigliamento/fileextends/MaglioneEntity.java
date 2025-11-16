package com.negozio_abbigliamento.fileextends;

import java.math.BigDecimal;

import com.negozio_abbigliamento.model.AbitoEntity;

//Maglione.java

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
* Sottoclasse Maglione con attributo aggiuntivo (es. materiale: lana/cotone)
*/@Entity
@DiscriminatorValue("MAGLIONE")
public class MaglioneEntity extends AbitoEntity {

    @Column(name = "materiale")
    private String materiale;

    public MaglioneEntity() {}

    public MaglioneEntity(String marca, String taglia, BigDecimal prezzo, String materiale) {
        this.materiale = materiale;
    }

    public String getMateriale() { return materiale; }
    public void setMateriale(String materiale) { this.materiale = materiale; }

    @Override
    public String toString() {
        return "Maglione{" + super.toString() + ", materiale='" + materiale + '\'' + '}';
    }
}
