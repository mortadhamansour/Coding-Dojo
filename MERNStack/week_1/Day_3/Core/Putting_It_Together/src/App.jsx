import PersonCard from './components/PersonCard';
import './App.css';

function App() {
  const persons = [
    {
      name: "Doe, Jane",
      age: 45,
      hairColor: "black"
    },
    {
      name: "Smith, John",
      age: 88,
      hairColor: "Brown"
    }
  ];

  return (
    <>
      {persons.map((p, i) => (
        <PersonCard key={i} pers={p} />
      ))}
    </>
  );
}

export default App;
