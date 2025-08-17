// 1.Complete fruit code with Context(use my component structure)
import { useState } from "react";
import '../App.css';
import FruitList from "./FruitList";
import FruitContext from "./FruitContext";

export default function Fruit(){
    const [fruit, setFruit] = useState("");
    const [fruitList, setFruitList] = useState([]);
    const addfruit = () => {
        setFruitList([...fruitList,fruit]);
        setFruit("");
    };


    return (
        <FruitContext.Provider value={{fruitList}}>
            <div className="container custom-font">
                <div className="row justify-content-center m-4 gap-2">
                    <div className="col-3 p-4 shadow bg-success-subtle rounded-4">
                        <input className="form-control mb-3" type="text" value={fruit} onChange={(e) => {setFruit(e.target.value)}} placeholder="Enter Fruit Name" required />
                       <center><button className="btn btn-primary w-50 rounded-5" onClick={addfruit}>Add Fruit</button></center> 
                    </div>
                    <FruitList/>
                </div>
            </div>
        </FruitContext.Provider>
    );
}