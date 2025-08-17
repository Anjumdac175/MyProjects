import { useState } from "react";
import OrderList from "./OrderList";
import PizzaContext from "./PizzaContext";

export default function OrderForm(){
    const [cname, setCname] = useState("");
    const [ptype, setPtype] = useState("");
    const [top, setTop] = useState([]);
    const [instr, setIntstr] = useState("");
    const [order, setOrder] = useState([]);
    const [errors, setErrors] = useState({});

    const handleChange = function(e){
        if(e.target.checked){
            setTop([...top,e.target.value]);
        }else{
            setTop(top.filter((ele) => ele !== e.target.value));
        }
    };

    const validateForm = () =>{
        const newErrors = {};

        if(cname.length < 5){
            newErrors.cname = "Name should be More than 5 Letters";
        }
        if(!ptype){
            newErrors.ptype = "Select Type of Pizza";
        }

        if(top.length === 0){
            newErrors.top = "please select atleast one topping";
        }

        if(ptype === "Tomato Sauce" && top.includes("Supreme")){
            newErrors.top = "Cannot choose Supreme Topping with Tomato Sauce Pizza";
        }

        if(instr.trim().split(" ").length < 5){
            newErrors.top = "Instructions should contain more than 5 words";
        }

       setErrors(newErrors);
       return Object.keys(newErrors).length === 0;


    };
    const handleSubmit = (e) => {
        e.preventDefault();
        if(!validateForm()) return;
        const pizzadata = {cname,ptype,top,instr};
        setOrder([...order,pizzadata]);
        console.log("Order Submitted",pizzadata);
        //reset
        setCname("");
        setPtype("");
        setTop([]);
        setIntstr("");
    };

    const deleteOrder = (index) => {
        setOrder(order.filter((order,i) => i !== index));
    };

    return (
        <PizzaContext.Provider value={{order, deleteOrder}}>
            <div className="container">
                <div className="row justify-content-between m-5">
                    <div className="col-4 shadow bg-primary-subtle rounded-4 p-4">
                        <form onSubmit={handleSubmit}>
                            <div className="mb-3">
                                <label className="form-label">Name:</label>
                                <input type="text" className="form-control" value={cname} onChange={(e) => {setCname(e.target.value)}} placeholder="Enter Customer Name" required />
                                {errors.cname && <div className="fs-7 text-danger">{errors.cname}</div>}
                            </div>
                            <div className="mb-3">
                                <label className="form-label">Pizza Type</label>
                                <select name="pizzatype" className="form-select" value={ptype} onChange={(e) => {setPtype(e.target.value)}}>
                                    <option value="">--select--</option>
                                    <option value="Margherita"> Margherita</option>
                                    <option value="Tomato Sauce">Tomato Sauce</option>
                                    <option value="Tomato Sauce">Supreme</option>
                                </select>
                                {errors.ptype && <div className="text-danger">{errors.ptype}</div>}
                            </div>
                            <div className="mb-3">
                                <label htmlFor="" className="form-label">Toppings</label>
                                <div className="form-check form-check-inline">
                                    <input type="checkbox" name="top" value="Cheese" checked={top.includes("Cheese")} onChange={handleChange} />
                                    <label htmlFor="Cheese" className="form-check-label"> Cheese</label>
                                </div>
                                <div className="form-check-inline">
                                    <input type="checkbox" name="top" value="Olives" checked={top.includes("Olives")} onChange={handleChange} />
                                    <label htmlFor="Olives" className="form-check-label">Olives</label>
                                </div>
                                <div className="form-check-inline">
                                    <input type="checkbox" name="top" value="Supreme"  checked={top.includes("Supreme")} onChange={handleChange} />
                                    <label htmlFor="Supreme" className="form-check-label">Supreme</label>
                                </div>
                                {errors.top && <div className="text-danger">{errors.top}</div>}
                            </div>
                            <div className="mb-3">
                                <label className="form-label">Delivery Instructions</label>
                                <textarea name="instruct" className="form-control" value={instr} onChange={(e) => {setIntstr(e.target.value)}} rows="3">

                                </textarea>
                            {errors.instr && <div className="text-danger">{errors.instr}</div>}
                            </div>
                            <div className="text-center">
                                <button className="btn btn-primary">Place Order</button>
                            </div>
                        </form>
                    </div>
                    <OrderList />
                </div>
            </div>       
        </PizzaContext.Provider>
    );
}