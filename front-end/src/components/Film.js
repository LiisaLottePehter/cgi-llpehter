import React from "react";
import {Link} from "react-router-dom";


const Film = ({ film }) => {
    return (
        <Link to={`/film/${film.id}`} className='post'>
            <img src={ film.pilt } alt= { film.name } />
            <header>{film.name}</header>

        </Link>
    )
}
export default Film;