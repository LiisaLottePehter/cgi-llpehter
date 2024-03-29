import React from "react";
import {Link} from "react-router-dom";
import Film from "./Film";
/**Saab sisendiks filmid ja teeb need presenteeritavale kujule **/
const FilmList = ({ films }) => {
    return (
        <div>
            {films.length > 0 ? (
                films.map(film => (
                    <div key={film.id}>
                        <Link to={`/film/${film.toimumisPaev}/${film.id}`}>
                            <Film film={film}/>
                        </Link>
                    </div>
                ))
            ) : (
                <p>Loading..</p>
            )}
        </div>
    );
};

export default FilmList;