package com.example.cgi_llpehter.controller;

import com.example.cgi_llpehter.model.Film;
import com.example.cgi_llpehter.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/film")
@RestController
public class FilmKontroller {
    private final FilmService filmService;

    @Autowired
    public FilmKontroller(FilmService filmService) {
        this.filmService = filmService;
    }
    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.getFilms();
    }
    @GetMapping(path = "/film/{id}")
    public Optional<Film> getFilmById(Long id) {
        return filmService.getFilmById(id);
    }


}

