import React, {useEffect, useState} from "react";
import {Link, useNavigate, useParams} from "react-router-dom";
import {getFilm} from "../api/FilmService2";

/** Selle abil saab esitada filmi detaile**/
const FilmDetails = ({ updateFilm }) => {
    const [film, setFilm] =useState({
        pilt: "",
        name: "",
        vanusepiirang: null,
        kestvus: null,
        zanr: "",
        toimumisAeg: null,
        toimumisPaev: "",
        vabadKohad: null,
    });
    const { id, paev } = useParams();
    const navigate = useNavigate();
    const fetchFilm = async (id) => {
        try{
            const { data } = await getFilm(id, paev);
            setFilm(data);
        }catch (error) {
            console.log(error);
        }
    };

    useEffect(() => {
        fetchFilm(id);
    }, []);

    const ostaPiletClick = () => {
        navigate(`/film/${paev}/${id}/ostaPilet`);
    }
    return (
        <div className='post'>
            <img src={film.pilt} alt={film.name} />
            <details_header>Filmi pealkiri: {film.name}</details_header>
            <details_text>Vanusepiirang: {film.vanusepiirang}</details_text>
            <details_text>Kestvus: {film.kestvus} minutit</details_text>
            <details_text>Žanr: {film.zanr}</details_text>
            <details_text>Vabad kohad: {film.vabadKohad}</details_text>
            <details_text>Kellaaeg: {film.toimumisAeg}</details_text>
            <button onClick={ostaPiletClick}>Osta Pilet</button>
        </div>

    )

}

export default FilmDetails;