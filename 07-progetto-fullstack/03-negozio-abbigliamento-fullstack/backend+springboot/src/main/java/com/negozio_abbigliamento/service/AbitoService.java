package com.negozio_abbigliamento.service;

//AbitoService.java


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.negozio_abbigliamento.fileextends.CamiciaEntity;
import com.negozio_abbigliamento.fileextends.MaglioneEntity;
import com.negozio_abbigliamento.fileextends.PantaloneEntity;
import com.negozio_abbigliamento.model.AbitoEntity;
import com.negozio_abbigliamento.repository.AbitoRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.negozio_abbigliamento.model.AbitoEntity;
import com.negozio_abbigliamento.repository.AbitoRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AbitoService {

    private final AbitoRepository abitoRepository;

    public AbitoService(AbitoRepository abitoRepository) {
        this.abitoRepository = abitoRepository;
    }

    public List<AbitoEntity> findAll() {
        return abitoRepository.findAll();
    }

    public Optional<AbitoEntity> findById(Long id) {
        return abitoRepository.findById(id);
    }

    public List<AbitoEntity> findByTipo(String tipo) {
        return abitoRepository.findByTipo(tipo);
    }

    public AbitoEntity save(AbitoEntity abito) {
        return abitoRepository.save(abito);
    }

    public void deleteById(Long id) {
        abitoRepository.deleteById(id);
    }
}
