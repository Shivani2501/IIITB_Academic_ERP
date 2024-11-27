import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Login from "./Components/Login";
import Dashboard from "./Components/Dashboard";
import PlacedStats from "./Components/PlacedStats";
import FilterStudents from "./Components/FilterStudents";
import "bootstrap/dist/css/bootstrap.min.css";
function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/stats" element={<PlacedStats />} />
        <Route path="/filter" element={<FilterStudents />} />
      </Routes>
    </Router>
  );
}

export default App;
