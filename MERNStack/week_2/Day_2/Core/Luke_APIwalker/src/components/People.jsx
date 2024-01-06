import React, { useEffect, useState } from "react";
import axios from "axios";
import { useParams } from "react-router-dom";



const People = () => {
    const [people, setPeople] = useState({});
    console.log(people);
    const {pep,id} = useParams()
    
    
    useEffect(() => {

    axios
    .get(`https://swapi.dev/api/${pep}/${id}`)
    .then((response) => {setPeople(response.data)})
    .catch((error) => console.log(error));
}, [pep,id]);

return (
    <fieldset>
        {/* {JSON.stringify(people)} */}
        {pep=="people"?<div>
        <h1> {people.name}</h1>
        <h2>Height:{people.height}</h2>
        <h2>Mass:{people.mass}</h2>
        <h2>Hair Color:{people.hair_color}</h2>
        <h2>Skin color:{people.skin_color}</h2>
        </div>:<div>
    <h1>{people.name}</h1>
    <h3>climate: {people.climate}</h3>
    <h3>Population: {people.population}</h3>
    <h3>terrain: {people.terrain}</h3>
    <h3> surface water : {people.surface_water}</h3>
    </div>}
        
        

    </fieldset>
);
};

export default People;