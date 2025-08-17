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
    const [isEdit, setIsEdit] = useState(false);
    const [editindex, setEditIndex] = useState(null);

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
            newErrors.instr = "Instructions should contain more than 5 words";
        }

       setErrors(newErrors);
       return Object.keys(newErrors).length === 0;


    };
    const handleSubmit = async (e) => {
        e.preventDefault();
        if(!validateForm()) return;
        const newOrder = {cname,ptype,top,instr};
        try{

            const url = isEdit ? `/api/place/${editindex}` : `/api/place`;
            const method = isEdit ? 'PUT':'POST';
            const res = await fetch(url,{
                method ,
                headers :{'Content-Type':'application/json'},
                body : JSON.stringify(newOrder),
            });
            if(res.ok){
                const updateList = await fetch('/api/place').then(r => r.json());
                setOrder(updateList);
            }else{
                console.log("Error while submitting data");
            }

        }catch(err){
            console.log("Error while sending data..");
        }

        //reset
        setCname("");
        setPtype("");
        setTop([]);
        setIntstr("");
        setIsEdit(false);
        setEditIndex(null);
    };

    // const deleteOrder = (index) => {
    //     setOrder(order.filter((order,i) => i !== index));
    // };
    const deleteOrder = async(index) =>{
        try{
            const delres = await fetch(`/api/place/${index}`,{
                method : 'DELETE',
            });

            if(delres.ok){
                const updateList = await fetch('/api/place').then(r => r.json());
                setOrder(updateList);
            }else{
                console.log("Unable to Delete..");
            }

        }catch(err){
            console.log("Error While Deleting..");
        }
    };

    const editOrder = (orderData, index) => {
        setCname(orderData.cname);
        setPtype(orderData.ptype);
        setTop(orderData.top);
        setIntstr(orderData.instr);
        setIsEdit(true);
        setEditIndex(index);
    }

    return (
        <PizzaContext.Provider value={{order, deleteOrder, editOrder}}>
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
                                    <option value="Supreme">Supreme</option>
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
                                <button className="btn btn-primary">{isEdit ? "Update Order" : "Place Order"}</button>
                            </div>
                        </form>
                    </div>
                    <OrderList />
                </div>
            </div>       
        </PizzaContext.Provider>
    );
}