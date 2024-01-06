import {
  Routes,
  Route,
  Link
} from "react-router-dom";
import './App.css';
import People from "./components/People";
import Form from "./components/Form";
import Error from "./components/Error";

function App() {
  return (
    <div className="App">
      <Form/>
      <Routes>
        <Route path='/'/>
        <Route path='/:pep/:id' element={<People/>}/>
        <Route path="*" element={<Error />} />
      </Routes>
    </div>
  );
}

export default App;