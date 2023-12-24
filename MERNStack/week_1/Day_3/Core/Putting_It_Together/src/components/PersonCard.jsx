import React, { useState } from 'react';

const PersonCard = ({ pers }) => {
  const [age, setAge] = useState(pers.age);
  const handleBirthday = () => {
    setAge(age + 1);
  };

  return (
    <div className="person-card">
      <h2>{pers.name}</h2>
      <p>Age: {age}</p>
      <p>Hair Color: {pers.hairColor}</p>
      <button onClick={handleBirthday}>Happy Birthday!</button>
    </div>
  );
};

export default PersonCard;
