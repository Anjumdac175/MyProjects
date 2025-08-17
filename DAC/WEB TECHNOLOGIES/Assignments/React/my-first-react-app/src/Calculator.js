import Addition from "./Arithmetic/Addition";
import Subtraction from "./Arithmetic/Subtraction";
import Multiply from "./Arithmetic/Multiply";
import Division from "./Arithmetic/Division";
import {useState} from 'react'

export default function Calculator() {
    const[num1, setNum1] = useState('');
    const[num2, setNum2] = useState('');
    const[submit, setSubmit] = useState(false);

    const Operate = (e) => {
        e.preventDefault();
        setSubmit(true);
    };


    return (
        <>
        <div className="container">
            <div className="row justify-content-center align-items-center">
                <div className="col-4 m-5 p-4 shadow rounded-4 bg-danger-subtle">
                <h2 className="m-4">Arithmetic Calculator</h2>
                    <form onSubmit={Operate}>
                        <input className="form-control mb-4" type ="number" value={num1} onChange={(e) => setNum1(Number(e.target.value))} placeholder="Enter First Number" required />
                        <input className="form-control mb-4" type="number" value={num2} onChange={(e) => setNum2(Number(e.target.value))} placeholder="Enter SEcond Number" required />
                        <center><button type="submit" className="btn btn-primary w-50 rounded-5">Calculate</button></center>
                    </form>
                    {submit &&(
                        <div className="m-5 p-4 shadow bg-primary-subtle rounded-3">
                            <Addition num1={num1} num2={num2} />
                            <Subtraction num1={num1} num2={num2} />
                            <Multiply num1={num1} num2={num2} />
                            <Division num1={num1} num2={num2} />
                        </div> 
                    )}

                </div>
            </div>
        </div>
       
        </>
    );
}