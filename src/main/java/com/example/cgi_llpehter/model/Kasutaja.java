package com.example.cgi_llpehter.model;


import jakarta.persistence.*;

@Entity
@Table
public class Kasutaja {
    @Id
    @SequenceGenerator(
            name = "kasutaja_sequence",
            sequenceName = "kasutaja_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "film_sequence"
    )
    private Long id;
    private String nimi;
    private String parool;
    private String vaadatudZanrid;

    public Kasutaja() {
    }

    public Kasutaja(Long id, String nimi, String parool, String vaadatudZanrid) {
        this.id = id;
        this.nimi = nimi;
        this.parool = parool;
        this.vaadatudZanrid = vaadatudZanrid;
    }

    public Kasutaja(String nimi, String parool, String vaadatudZanrid) {
        this.nimi = nimi;
        this.parool = parool;
        this.vaadatudZanrid = vaadatudZanrid;
    }

    public Long getId() {
        return id;
    }

    public String getNimi() {
        return nimi;
    }

    public String getParool() {
        return parool;
    }

    public String getVaadatudZanrid() {
        return vaadatudZanrid;
    }

    @Override
    public String toString() {
        return "Kasutaja{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                ", parool='" + parool + '\'' +
                ", vaadatudZanrid='" + vaadatudZanrid + '\'' +
                '}';
    }
}
