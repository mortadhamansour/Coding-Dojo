import { Routes, Route, Navigate } from "react-router-dom";
import './App.css';
import HomePage from "./components/HomePage";
import Create from "./components/Create";
import OneProduct from "./components/OneProduct";
import Update from "./components/Update";

function App() {
  return (
    <div className="App">
    <Routes>
      <Route path= '/' element= {<Navigate to= {'/product'}/>}/>
      <Route path="/product" element ={<Create/>}/>
      <Route path="/product" element ={<HomePage/>}/>
      <Route path="/product/:id" element ={<OneProduct/>}/>
      <Route path="/product/:id/update" element ={<Update/>}/>
      <Route path="*" element={<HomePage/>}/>
    </Routes>
    
    </div>
  );
}

export default App;