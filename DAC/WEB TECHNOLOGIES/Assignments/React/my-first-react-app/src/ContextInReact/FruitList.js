
import { useContext } from "react";
import FruitContext from "./FruitContext";
export default function FruitLists(){
    const {fruitList} = useContext(FruitContext);
    if(fruitList.length ===0 ) return null;
    return (
       <div className="col-3 p-4 shadow bg-primary-subtle rounded-4">
           <h3 className="fw-bold">FruitList</h3>
           <hr />
           <ol className="fs-5 fw-normal">
               {fruitList.map((list,idx) => (
                   <li key={idx}>{list}</li>
               ))}
           </ol>
       </div>
    );
   }