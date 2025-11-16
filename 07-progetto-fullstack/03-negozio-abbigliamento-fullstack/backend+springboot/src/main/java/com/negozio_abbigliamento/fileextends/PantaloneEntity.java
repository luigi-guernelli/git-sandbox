package com.negozio_abbigliamento.fileextends;

import java.math.BigDecimal;

import com.negozio_abbigliamento.model.AbitoEntity;

import jakarta.persistence.Column;

//Pantalone.java

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
* Sottoclasse Pantalone con eventuale attributo aggiuntivo (es. fit: slim/regular)
*/@Entity
@DiscriminatorValue("PANTALONE")
public class PantaloneEntity extends AbitoEntity {

    @Column(name = "fit")
    private String fit;

    public PantaloneEntity() {}

    public PantaloneEntity(String marca, String taglia, BigDecimal prezzo, String fit) {
        this.fit = fit;
    }

    public String getFit() { return fit; }
    public void setFit(String fit) { this.fit = fit; }

    @Override
    public String toString() {
        return "Pantalone{" + super.toString() + ", fit='" + fit + '\'' + '}';
    }
}
