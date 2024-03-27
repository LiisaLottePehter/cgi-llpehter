package com.example.cgi_llpehter.service;

import com.example.cgi_llpehter.model.Film;
import com.example.cgi_llpehter.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FilmService {
    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getFilms() {return filmRepository.findAll();}

    public Optional<Film> getFilmById(Long id) {
        return filmRepository.findById(id);
    }
}