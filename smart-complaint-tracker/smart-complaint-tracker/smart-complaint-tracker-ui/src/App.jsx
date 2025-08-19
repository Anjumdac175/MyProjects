import { Routes, Route } from "react-router-dom";
import Navbar from "./components/Navbar.jsx";
import Home from "./pages/Home.jsx";
import Complaints from "./pages/Complaints.jsx";
import Dashboard from "./pages/Dashboard.jsx";
import './App.css';

export default function App() {
  return (
    <section className="main">
      <Navbar />
      <main className="container py-4">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/complaints" element={<Complaints />} />
          <Route path="/dashboard" element={<Dashboard />} />
        </Routes>
      </main>
    </section>
  );
}
