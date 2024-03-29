import axios from "axios";

const API_URL = `http://localhost:8080/film`

export async function postOst(id, paev, value){
    return await axios.post(`${API_URL}/${paev}/${id}/ostaPilet`, value)
}