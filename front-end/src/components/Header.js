import React, {useEffect, useState} from "react";
import axios from "axios";
import {Link} from "react-router-dom";

/** Veebilehe päis **/
const Header = ({ }) => {

    return(
        <header className='navbar'>
            <a><Link to="/film/Esmaspäev">Esmaspäev</Link></a>|
            <a><Link to="/film/Teisipäev">Teisipäev</Link></a>|
            <a><Link to="/film/Kolmapäev">Kolmapäev</Link></a>|
            <a><Link to="/film/Neljapäev">Neljapäev</Link></a>|
            <a><Link to="/film/Reede">Reede</Link></a>|
            <a><Link to="/film/Laupäev">Laupäev</Link></a>|
            <a><Link to="/film/Pühapäev">Pühapäev</Link></a>

        </header>
    )
}

export default Header