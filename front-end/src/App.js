import { useEffect, useState } from 'react'
import './App.css';
import './index.css'
import Header from "./components/Header";
import axios from "axios";
import {Navigate, Route, Router, Routes} from "react-router-dom";
import FilmDetails from "./components/FilmDetails";
import FilmList from "./components/FilmList";
import OstaPilet from "./components/OstaPilet";
import FilteredFilms from "./components/FilteredFilms";


function App(){
    const [films, setFilms] = useState([]);

    useEffect(() => {
        async function fetchFilms() {
            try {
                const getAllFilms = await axios.get('http://localhost:8080/film');
                setFilms(getAllFilms.data);
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
                <Route path="/film/:paev" element={<FilteredFilms films={films} />}/>
                <Route path="/film/:paev/:id" element={<FilmDetails />} />
                <Route path="/film/:paev/:id/ostaPilet" element={<OstaPilet />} />
            </Routes>
        </div>
)
    ;

}

export default App;
