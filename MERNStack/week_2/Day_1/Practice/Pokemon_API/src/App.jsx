import { useState } from 'react'
import './App.css'

function App() {
  const [fetchPokemons, setFetchPokemons] = useState([])
  const fetchAPI = () => {
    fetch("https://pokeapi.co/api/v2/pokemon/")
      .then(response => {
        console.log("RESPONSE :", response);
        return response.json()
      })
      .then(response => {
        console.log("FETCH API RESPONSE AS JSON : ", response)
        setFetchPokemons(response.results)
      })
      .catch(error => console.log("FETCH API ERROR :", error))
  }
  const handleClick = (apiCall,stateVariable, setStateVariable) => {
    console.log(stateVariable);
    if(stateVariable.length !== 0){
      setStateVariable([])
    } else{
      apiCall()
    }
  }
  return (
    <>
      <button onClick={() => handleClick(fetchAPI, fetchPokemons, setFetchPokemons)}>Fetch Pokemon</button>
      <fieldset>
        {fetchPokemons.map(pokemon => (
          <ul key={pokemon.name}>
            <li>{pokemon.name}</li>
          </ul>
        ))}
      </fieldset>
    </>
  )
}

export default App
