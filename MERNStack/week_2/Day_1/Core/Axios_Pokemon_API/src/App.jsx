import { useState } from 'react'
import './App.css'
import axios from 'axios';

function App() {
  const [axiosPokemon, setAxiosPokemon] = useState([])
  const axiosAPI = () => {
    axios.get("https://pokeapi.co/api/v2/pokemon/")
    .then(response => {
      console.log("AXIOS RESPONSE :", response)
      setAxiosPokemon(response.data.results)
    })
    .catch(error=> console.log("AXIOS ERROR:", error))
  }
  return (
    <>
        <button onClick={axiosAPI}>Fetch Pokemon</button>
      <fieldset>
        {axiosPokemon.map(pokemon => (
          <ul key={pokemon.name}>
            <li>{pokemon.name}</li>
          </ul>
        ))}
      </fieldset>
    </>
  )
}

export default App
