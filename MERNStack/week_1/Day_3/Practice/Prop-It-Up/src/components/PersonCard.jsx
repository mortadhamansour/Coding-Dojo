const PersonCard = ({pers}) => {
  return (
      <>
      <h1>{pers.name}</h1>
      <p>Age: {pers.age}</p>
      <p>Hair Color: {pers.hairColor}</p>
      </>
  )
}

export default PersonCard