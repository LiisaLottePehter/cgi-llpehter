import React from "react";
import {Link} from "react-router-dom";

const Film = ({ film }) => {
    return (
        <Link to={`/film`} className='post'>
            <div className='post_header'>
                <img src={ film.pilt } alt= { film.name } />
                <p>{film.name}</p>
            </div>
        </Link>
    )
}
