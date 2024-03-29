package com.example.cgi_llpehter.config;

import com.example.cgi_llpehter.model.Film;
import com.example.cgi_llpehter.model.Kasutaja;
import com.example.cgi_llpehter.repository.FilmRepository;
import com.example.cgi_llpehter.repository.KasutajaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/** Vähemalt mingigi info kuvamiseks sisestasin andmed käsitsi**/
@Configuration
public class KinoConfig {
    @Bean
    CommandLineRunner commandLineRunner(FilmRepository filmRepository) {
        return args -> {
            LocalTime aeg = LocalTime.of(12, 30, 00, 00);
            LocalTime aeg2 = LocalTime.of(19, 15, 00, 00);
            LocalTime aeg3 = LocalTime.of(20, 30, 00, 00);
            LocalTime aeg4 = LocalTime.of(10, 50, 00, 00);
            Film kungfupanda = new Film("https://m.media-amazon.com/images/M/MV5BODJkZTZhMWItMDI3Yy00ZWZlLTk4NjQtOTI1ZjU5NjBjZTVjXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_.jpg", "Kung fu panda", 8, 90, "Pere", "Esmaspäev", aeg, 50, 1);
            Film rapuntsel = new Film("https://upload.wikimedia.org/wikipedia/en/a/a8/Tangled_poster.jpg","Rapuntsel", 8, 90, "Pere", "Teisipäev", aeg2, 70, 1);
            Film dune = new Film("https://m.media-amazon.com/images/M/MV5BMDQ0NjgyN2YtNWViNS00YjA3LTkxNDktYzFkZTExZGMxZDkxXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_FMjpg_UX1000_.jpg", "Dune", 16, 90, "Ulmefilm", "Kolmapäev", aeg3, 40, 3);
            Film koerArthur = new Film("https://mcswebsites.blob.core.windows.net/1056/Event_10432/portrait_medium/ATK_FC-poster_1350x2000_EE.jpg", "Koer Arthur", 8, 90, "Seiklus", "Neljapäev", aeg4, 24, 4);
            Film Godzilla = new Film("https://assets-prd.ignimgs.com/2022/06/24/godzilla-two-thousand-1656102733092.jpeg", "Godzilla", 12, 90, "Märul", "Reede", aeg, 50, 1);
            Film  patustPuhas = new Film("https://m.media-amazon.com/images/M/MV5BNmYyZGQzM2YtYTY3My00NGE5LWIzMmQtMDIxMTFhMGIxZDhhXkEyXkFqcGdeQXVyMTY0Njc2MTUx._V1_FMjpg_UX1000_.jpg","Patust Puhas", 16, 90, "Õudus", "Laupäev", aeg3, 70, 1);
            Film soov = new Film("https://m.media-amazon.com/images/I/81zGSTSQgpL._UF1000,1000_QL80_.jpg","Soov", 8, 90, "Pere", "Pühapäev", aeg2, 70, 1);
            Film anyoneButYou = new Film("https://apl-api.apollo.ee/img/600/744/resize/catalog/product//7/3/7333018029200.jpg", "Armastan sind vihata", 16, 90, "Romantiline komöödia", "Esmaspäev", aeg3, 40, 3);
            filmRepository.saveAll(List.of(kungfupanda, rapuntsel, dune, koerArthur, Godzilla, patustPuhas, soov, anyoneButYou));
        };
    }

    @Bean
    CommandLineRunner commandLineRunner2(KasutajaRepository kasutajaRepository){
        return args -> {
            Kasutaja üks = new Kasutaja("Mari Maasikas", "123", "komöödia,pere");
            kasutajaRepository.save(üks);
        };
    }

}