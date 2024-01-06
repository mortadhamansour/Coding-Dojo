import axios from 'axios';
import { useParams } from 'react-router-dom'
import { useEffect,useState } from 'react';

const Planet = () => {
  const [planetId,setPlanetId]=useState([])
  const {planetid}=useParams();
  useEffect(()=>{

    axios
    .get(`https://swapi.dev/api/planets/+${planetid}`)
    .then((response) => {setPlanetId(response.data)})
    .catch((error) => console.log(error));
  })
  return (
    <div>
      <h1>{planetId.name}</h1>
      <h3>climate: {planetId.climate}</h3>
      <h3>Population: {planetId.population}</h3>
      <h3>terrain: {planetId.terrain}</h3>
      <h3> surface water : {planetId.surface_water}</h3>
    </div>
  )
}

export default Planet