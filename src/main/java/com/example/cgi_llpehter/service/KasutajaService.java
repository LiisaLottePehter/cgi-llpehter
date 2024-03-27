package com.example.cgi_llpehter.service;


import com.example.cgi_llpehter.model.Kasutaja;
import com.example.cgi_llpehter.repository.KasutajaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KasutajaService {
    private final KasutajaRepository kasutajaRepository;

    @Autowired
    public KasutajaService(KasutajaRepository kasutajaRepository) {
        this.kasutajaRepository = kasutajaRepository;
    }

    public List<Kasutaja> getKasutajad() {
        return kasutajaRepository.findAll();
    }
}