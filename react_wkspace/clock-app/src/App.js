import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';

// Clock App
// function App() {
//   const [currentTime, setName] = useState(new Date().toLocaleTimeString());
//   const changeName = () => {
//     setName(new Date().toLocaleTimeString());
//   };

//   return (
//     <div>
//       <p>Time:  {currentTime}</p>
//       <button onClick={changeName}>Click Me </button>
//     </div>
//   );
// }

import { Routes, Route } from "react-router-dom";
i
import Home from "./components/Home";


function App() {
  return (
    <>
      <Navbar />

      <Routes >
        <Route path="/" element={<Home />} />

      </Routes>
    </>
  );
}

export default App;

