package com.example.cgi_llpehter.controller;


import com.example.cgi_llpehter.model.Kasutaja;
import com.example.cgi_llpehter.service.KasutajaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/kasutaja")
public class KasutajaController {
    private final KasutajaService kasutajaService;

    @Autowired
    public KasutajaController(KasutajaService kasutajaService) {
        this.kasutajaService = kasutajaService;
    }

    @GetMapping
    public List<Kasutaja> getKasutajad() {
        return kasutajaService.getKasutajad();
    }
}

