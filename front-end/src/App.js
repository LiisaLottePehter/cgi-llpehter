import { useEffect, useState } from 'react'
import './App.css';
import './index.css'
import Header from "./components/Header";
import Film from "./components/Film"
import axios from "axios";

function App(){
    const [films, setFilms] = useState([]);
    useEffect(() => {
        async function fetchFilms() {
            try {
                const response = await axios.get('http://localhost:8080/film');
                setFilms(response.data);
            }catch (error){
                console.log(error);
            }
        }
        fetchFilms();
    }, []);

    return (
        <div>
            <Header />
            <div>
                {films.map(film => (
                    <div key={film.id}>
                        <div className="post">
                            <img src={film.pilt} alt={film.name}/>
                            <header>{film.name}</header>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    );

}
