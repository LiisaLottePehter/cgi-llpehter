package com.example.cgi_llpehter.config;

import com.example.cgi_llpehter.model.Film;
import com.example.cgi_llpehter.model.Kasutaja;
import com.example.cgi_llpehter.repository.FilmRepository;
import com.example.cgi_llpehter.repository.KasutajaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class KinoConfig {
    @Bean
    CommandLineRunner commandLineRunner(FilmRepository filmRepository) {
        return args -> {
            Film kungfupanda = new Film("https://m.media-amazon.com/images/M/MV5BODJkZTZhMWItMDI3Yy00ZWZlLTk4NjQtOTI1ZjU5NjBjZTVjXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_.jpg", "Kung fu panda", 8, 90, "Pere");
            Film rapuntsel = new Film("https://upload.wikimedia.org/wikipedia/en/a/a8/Tangled_poster.jpg","Rapuntsel", 8, 90, "Pere");
            //Film dune = new Film("Dune", 16, 90, "Ulmefilm");
            //Film koerArthur = new Film("Koer Arthur", 8, 90, "Seiklus");
            filmRepository.saveAll(List.of(kungfupanda, rapuntsel));
        };
    };
    @Bean
    CommandLineRunner commandLineRunner2(KasutajaRepository kasutajaRepository){
        return args -> {
            Kasutaja üks = new Kasutaja("Mari Maasikas", "123", "komöödia,pere");
            kasutajaRepository.save(üks);
        };
    }

}