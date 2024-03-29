package com.example.cgi_llpehter.model;


import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table
public class Film {
    @Id
    @SequenceGenerator(
            name = "film_sequence",
            sequenceName = "film_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "film_squence"
    )
    private Long id;
    private String pilt;
    private String name;
    private Integer vanusepiirang;
    private Integer kestvus;
    private String zanr;
    private String toimumisPaev;
    private LocalTime toimumisAeg;
    private int vabadKohad;
    private Integer SaaliNumber;

    public Film() {
    }

    public Film(Long id, String pilt, String name, Integer vanusepiirang, Integer kestvus, String zanr, String toimumisPaev, LocalTime toimumisAeg, int vabadKohad, Integer saaliNumber) {
        this.id = id;
        this.pilt = pilt;
        this.name = name;
        this.vanusepiirang = vanusepiirang;
        this.kestvus = kestvus;
        this.zanr = zanr;
        this.toimumisPaev = toimumisPaev;
        this.toimumisAeg = toimumisAeg;
        this.vabadKohad = vabadKohad;
        SaaliNumber = saaliNumber;
    }

    public Film(String pilt, String name, Integer vanusepiirang, Integer kestvus, String zanr, String toimumisPaev, LocalTime toimumisAeg, int vabadKohad, Integer saaliNumber) {
        this.pilt = pilt;
        this.name = name;
        this.vanusepiirang = vanusepiirang;
        this.kestvus = kestvus;
        this.zanr = zanr;
        this.toimumisPaev = toimumisPaev;
        this.toimumisAeg = toimumisAeg;
        this.vabadKohad = vabadKohad;
        SaaliNumber = saaliNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getVanusepiirang() {
        return vanusepiirang;
    }

    public Integer getKestvus() {
        return kestvus;
    }

    public String getZanr() {
        return zanr;
    }

    public String getPilt() {
        return pilt;
    }

    public String getToimumisPaev() {
        return toimumisPaev;
    }

    public LocalTime getToimumisAeg() {
        return toimumisAeg;
    }

    public int getVabadKohad() {
        return vabadKohad;
    }

    public Integer getSaaliNumber() {
        return SaaliNumber;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vanusepiirang=" + vanusepiirang +
                ", kestvus=" + kestvus +
                ", zanr='" + zanr + '\'' +
                '}';
    }

}

