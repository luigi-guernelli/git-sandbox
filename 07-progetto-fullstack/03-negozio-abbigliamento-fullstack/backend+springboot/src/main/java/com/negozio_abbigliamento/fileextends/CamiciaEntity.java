package com.negozio_abbigliamento.fileextends;

import java.math.BigDecimal;

import com.negozio_abbigliamento.model.AbitoEntity;

//Camicia.java

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
* Sottoclasse Camicia con attributo aggiuntivo (es. lunghezzaManica: corta/lunga)
*/@Entity
@DiscriminatorValue("CAMICIA")
public class CamiciaEntity extends AbitoEntity {

    @Column(name = "lunghezza_manica")
    private String lunghezzaManica;

    public CamiciaEntity() {}

    public CamiciaEntity(String marca, String taglia, BigDecimal prezzo, String lunghezzaManica) {
        this.lunghezzaManica = lunghezzaManica;
    }

    public String getLunghezzaManica() { return lunghezzaManica; }
    public void setLunghezzaManica(String lunghezzaManica) { this.lunghezzaManica = lunghezzaManica; }

    @Override
    public String toString() {
        return "Camicia{" + super.toString() + ", lunghezzaManica='" + lunghezzaManica + '\'' + '}';
    }
}
