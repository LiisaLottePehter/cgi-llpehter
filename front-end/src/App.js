import { useEffect, useState } from 'react'
import './App.css';
import './index.css'
import Header from "./components/Header";
import Film from "./components/Film"
import axios from "axios";
import {Navigate, Route, Router, Routes} from "react-router-dom";
import FilmDetails from "./components/FilmDetails";
import FilmList from "./components/FilmList";

function App(){
    const [films, setFilms] = useState([]);

    useEffect(() => {
        async function fetchFilms() {
            try {
                const getAllFilms = await axios.get('http://localhost:8080/film');
                setFilms(getAllFilms .data);
            }catch (error){
                console.log(error);
            }
        }
        fetchFilms();
    }, []);

    const updateFilm = async () => {

    }

    return (
        <div>
            <Header/>
            <Routes>
                <Route path="/" element={<Navigate to={"/film"} />} />
                <Route path="/film" element={<FilmList films={films} />} />
                <Route path="/film/:id" element={<FilmDetails updateFilm={updateFilm}/>} />
            </Routes>
        </div>
)
    ;

}

export default App;