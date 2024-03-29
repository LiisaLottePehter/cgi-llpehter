package com.example.cgi_llpehter.controller;

import com.example.cgi_llpehter.model.Film;
import com.example.cgi_llpehter.model.OstetudPiletid;
import com.example.cgi_llpehter.repository.OstetudPiletidRepository;
import com.example.cgi_llpehter.service.FilmService;
import com.example.cgi_llpehter.service.OstetudPiletidService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/film")
@RestController
public class FilmKontroller {
    private final FilmService filmService;
    private final OstetudPiletidService ostetudPiletidService;
    private final OstetudPiletidRepository ostetudPiletidRepository;

    @Autowired
    public FilmKontroller(FilmService filmService, OstetudPiletidService ostetudPiletidService, OstetudPiletidRepository ostetudPiletidRepository) {
        this.filmService = filmService;
        this.ostetudPiletidService = ostetudPiletidService;
        this.ostetudPiletidRepository = ostetudPiletidRepository;
    }

    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.getFilms();
    }

    @GetMapping(path = "/{paev}/{id}")
    public Optional<Film> getFilm(@PathVariable Long id, @PathVariable String paev) {
        return filmService.getFilm(id, paev);
    }

    @PostMapping(path = "/{paev}/{id}/ostaPilet")
    public OstetudPiletid postOst(@RequestBody OstetudPiletid ostetudPiletid, @PathVariable Long id, @PathVariable String paev) {
        return ostetudPiletidRepository.save(ostetudPiletid);
    }

}

