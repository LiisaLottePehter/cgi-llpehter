import React from "react";
import { Link } from "react-router-dom";
import Film from "./Film";

const FilmList = ({ films }) => {
    return (
        <div>
            {films.length > 0 ? (
                films.map(film => (
                    <div key={film.id}>
                        <Link to={`/film/${film.id}`}>
                            <Film film={film} />
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