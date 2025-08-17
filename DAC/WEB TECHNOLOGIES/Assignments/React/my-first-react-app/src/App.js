
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import App1 from './App1';
import App2 from './App2';
import App3 from './App3';
import App4 from './App4';
import Calculator from './Calculator';
import Fruits from './fruits/Fruits';
import Movies from './Movies/Movies';
import Fruit from './ContextInReact/Fruit';
//import Movie from './ContextInReact/MovieList/Movie';
import Movie from './MovieServer/Movie'
//import OrderForm from './PizzaShop/OrderForm'
import Order from './PizzashopServer/Order'

function App() {
  return (
    
    // <BrowserRouter>
    //   <Routes>
     
    //     <Route path='/app1' element={<App1 />} />
    //     <Route path='/app2' element={<App2 />} />
    //     <Route path='/app3' element={<App3 />} />
    //     <Route path='/app4' element={<App4 />} />
    //   </Routes>
    // </BrowserRouter>

    // <Calculator/>
    // <Fruits /> // from src-fruits
    // <Fruit /> //from ContextInReact - fruits
    // <Movies /> // from src-Movies
    //  <Movie /> //from ContextInReact - Moives
    // <Movie /> //from MovieServer - Moives
    //  <OrderForm /> //from PizzaShop- OrderForm
     <Order /> //from PizzaShop- OrderForm
  );
}

export default App;