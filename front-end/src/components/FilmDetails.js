import React, {useEffect, useState} from "react";
import { useParams} from "react-router-dom";
import {getFilm} from "../api/FilmService2";

const FilmDetails = ({ updateFilm }) => {
    const [film, setFilm] =useState({
        pilt: "",
        name: "",
        vanusepiirang: null,
        kestvus: null,
        zanr: "",
    });
    const { id } = useParams();

    const fetchFilm = async (id) => {
        try{
            const { data } = await getFilm(id);
            setFilm(data);
        }catch (error) {
            console.log(error);
        }
    };

    useEffect(() => {
        fetchFilm(id);
    }, [id]);

    return (
        <>
            <div className='post'>
                <img src={film.pilt} alt={film.name} />
                <details_header>Filmi pealkiri: {film.name}</details_header>
                <details_text>Vanusepiirang: {film.vanusepiirang}</details_text>
                <details_text>Kestvus: {film.kestvus} minutit</details_text>
                <details_text>Žanr: {film.zanr}</details_text>
                <button>Osta Piletid</button>
            </div>
        </>
    )

}

export default FilmDetails;