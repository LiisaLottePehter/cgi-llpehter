import axios from "axios";

const API_URL = 'http://localhost:8080/film'

export async function getFilms(page=0, size=10){
    return await axios.get(`${API_URL}?page=${page}&size=${size}`);
}

export async function getFilm(id){
    return await axios.get(`${API_URL}/${id}`);
}

