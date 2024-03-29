import React, {useEffect, useState} from "react";
import {getFilm} from "../api/FilmService2";
import {Link, useNavigate, useParams} from "react-router-dom";
import {postOst} from "../api/PiletidService";


/** Pileti ostmiseks loodud komponent**/
const OstaPilet = () => {
    const [piletiteArv, setPiletiteArv] = useState()
    const { id, paev } = useParams();
    const [filmName, setFilmName] = useState();

    const fetchVabadKohad = async () => {
        try {
            const {data} = await getFilm(id, paev);
            setPiletiteArv(data.vabadKohad);
            setFilmName(data.name);
        }catch (error) {
            console.log(error)
        }
    };
    useEffect( () =>{
        fetchVabadKohad();
    }, [id]);

    const navigate = useNavigate();

    const [tahetudArv, settahetudArv] = useState();
    const [ostjaNimi, setostjaNimi] = useState();

    const ostetudPilet = async (event) => {
        event.preventDefault();
        try{
            const response = await postOst(id,paev,{
                filmName: filmName,
                tahetudArv: parseInt(tahetudArv),
                ostjaNimi: ostjaNimi,
            });
            setPiletiteArv(piletiteArv-tahetudArv)
            console.log(response)
            navigate("/film")
        }catch (error){
            console.log(error);
        }
    }

    return(

        <div className='post'>
            <details_header>Vabad kohad: {piletiteArv}</details_header>
            <details_text>Mitu piletit soovid osta?</details_text>
            <input
                type="number"
                value={tahetudArv}
                onChange={(e) => settahetudArv(e.target.value)}
            />
            <details_text>Mis on sinu nimi?</details_text>
            <input
                type="text"
                value={ostjaNimi}
                onChange={(e) => setostjaNimi(e.target.value)}
            />
            <Link to="/film"><button onClick={ostetudPilet}>Osta</button></Link>
        </div>
    )
}

export default OstaPilet;