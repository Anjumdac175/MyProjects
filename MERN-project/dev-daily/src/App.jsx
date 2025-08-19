import { BrowserRouter, Routes, Route } from "react-router-dom";

import Navbar from "./components/common/Navbar";
import Footer from "./components/common/Footer";
import Home from "./pages/Home";

export default function App() {
  return(
    <BrowserRouter>
     <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />
        </Routes>
      <Footer/>
    </BrowserRouter>
  );
}