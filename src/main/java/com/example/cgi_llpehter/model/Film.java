package com.example.cgi_llpehter.model;


import jakarta.persistence.*;

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

    public Film() {}

    public Film(Long id, String pilt, String name, Integer vanusepiirang, Integer kestvus, String zanr) {
        this.id = id;
        this.pilt = pilt;
        this.name = name;
        this.vanusepiirang = vanusepiirang;
        this.kestvus = kestvus;
        this.zanr = zanr;
    }

    public Film(String pilt, String name, Integer vanusepiirang, Integer kestvus, String zanr) {
        this.pilt = pilt;
        this.name = name;
        this.vanusepiirang = vanusepiirang;
        this.kestvus = kestvus;
        this.zanr = zanr;
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

