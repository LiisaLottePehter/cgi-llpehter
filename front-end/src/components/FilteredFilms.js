import React, {useEffect, useState} from 'react'
import {Link, useParams} from "react-router-dom";
import FilmList from "./FilmList";

/***
 Selle komponendi ülesanne on filtreerida filmid vastavalt päevadele ja kutsun välja varem loodud komponendi, mis teeb saadud filmidest listi
 ***/
const FilteredFilms = ({ films }) => {
    const { paev} = useParams();

    const [filtreeritud, setFiltreeritud] = useState(films);
    const handleFilter = () => {
        const filter = films.filter(film => film.toimumisPaev === paev)
        setFiltreeritud(filter);
    };
    useEffect(() => {
        handleFilter();
    }, [paev, films]);

    return (
        <div>
           <FilmList films={filtreeritud}></FilmList>
        </div>
    )
}

export default FilteredFilms



