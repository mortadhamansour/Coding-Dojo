import {
  Routes, Route
} from 'react-router-dom'
import Home from './components/Home'
import Variable from './components/Variable'
import './App.css'

function App() {
  return (
    <>
    <Routes>
      <Route path='/home' element={<Home />} />
      <Route path='/:variable' element= {<Variable />} />
      <Route path='/:variable/:color1/:color2' element= {<Variable />} />
    </Routes>
    </>
  )
}

export default App
