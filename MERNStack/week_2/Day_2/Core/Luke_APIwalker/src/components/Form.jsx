import React from 'react'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const Form = () => {
  const[ peopleId,setPeopleId]= useState();

  const[ select,setSelect]= useState("people");

  function handleAddrTypeChange(e) {

    setSelect(e.target.value);}

  const navigate= useNavigate();


  const handleSubmit=(e)=>{

    e.preventDefault();

    navigate("/"+select+"/"+ peopleId);
  };
  return (
  <div>
    <h1>{peopleId}</h1>
  <form onSubmit={handleSubmit}>
    <div>
    <label>id:</label>
    <input type="number" onChange={(e)=>{ setPeopleId(e.target.value)}} className='form-control' />
    </div>
    <div>
      <label >search for:</label>
      <select onChange={handleAddrTypeChange} className='form-control'>
        <option value="people">people</option>
        <option value="planets">planets</option>
      </select>
    </div>
    <button className='btn btn-primary'> search</button>

  </form>
  </div>
  )
}

export default Form