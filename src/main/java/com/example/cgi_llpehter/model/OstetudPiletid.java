package com.example.cgi_llpehter.model;

import jakarta.persistence.*;

@Entity
@Table
public class OstetudPiletid {
    @Id
    @SequenceGenerator(
            name = "piletid_sequence",
            sequenceName = "piletid_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "piletid_sequence"
    )
    private Long id;
    private String filmName;
    private Integer ostetudPiletiteArv;
    private String ostjaNimi;

    public OstetudPiletid() {
    }

    public OstetudPiletid(String filmName, Integer ostetudPiletiteArv, String ostjaNimi) {
        this.filmName = filmName;
        this.ostetudPiletiteArv = ostetudPiletiteArv;
        this.ostjaNimi = ostjaNimi;
    }

    public OstetudPiletid(Long id, String filmName, Integer ostetudPiletiteArv, String ostjaNimi) {
        this.id = id;
        this.filmName = filmName;
        this.ostetudPiletiteArv = ostetudPiletiteArv;
        this.ostjaNimi = ostjaNimi;
    }

    public Long getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
    }

    public Integer getOstetudPiletiteArv() {
        return ostetudPiletiteArv;
    }

    public String getOstjaNimi() {

        return ostjaNimi;
    }

    @Override
    public String toString() {
        return "OstetudPiletid{" +
                "id=" + id +
                ", filmName='" + filmName + '\'' +
                ", ostetudPiletiteArv=" + ostetudPiletiteArv +
                ", ostjaNimi='" + ostjaNimi + '\'' +
                '}';
    }
}
