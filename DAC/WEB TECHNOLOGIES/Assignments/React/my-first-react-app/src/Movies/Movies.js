// 4.Write react code to read movie data from user and show in table(Use different Component for table).
// Movie Fields : movieName, actor, release(date),Movie type(2d,3d,IMAX)(use checkbox), state(use select tag)
import { useState } from 'react';
import '../App.css';
import MovieTable from './MovieTable';

export default function Movies(){
    const [mname, setMname] = useState("");
    const [mactor, setMactor] = useState("");
    const [rdate, setRdate] = useState("");
    const [mstate, setState] = useState("");
    const [mtype, setMtype] = useState([]);
    const [movieList, setMovieList] = useState([]);
    const handletype = function(e) {
        if(e.target.checked){
            setMtype([...mtype, e.target.value]);
        }else{
            setMtype(mtype.filter((ele) => ele !== e.target.value));
        }
    };
    const handleSubmit = (e) => {
        e.preventDefault();
        const movieData = {mname, mactor, rdate, mtype, mstate};
        setMovieList([...movieList, movieData]);
        console.log("Movie Submitted:", movieData);
        // this is to reset the form
        setMname('');
        setMactor('');
        setRdate('');
        setMtype([]);
        setState('');
    };

    return (
        <>
            <div className="container-fluid">
                <div className="row justify-content-around m-3">
                    <div className="col-4 p-4 shadow bg-info-subtle rounded-4">
                        <form onSubmit={handleSubmit}>
                            <div className="mb-3">
                                <label className="form-label fs-5 fw-semibold">MovieName</label>
                                <input type="text" className="form-control" value={mname} onChange={(e) => {setMname(e.target.value)}} required />
                            </div>
                            <div className="mb-3">
                                <label className="form-label fs-5 fw-semibold">Actor</label>
                                <input type="text" className="form-control" value={mactor} onChange={(e) => {setMactor(e.target.value)}} required />
                            </div>
                            <div className="mb-3">
                                <label className="form-label fs-5 fw-semibold">Relase Date</label>
                                <input type="date" className="form-control" value={rdate} onChange={(e) => {setRdate(e.target.value)}} required />
                            </div>
                            <div className="mb-3">
                                <label className="form-label fs-5 fw-semibold">Movie Type</label>
                                <div className="form-check">
                                    <input className="form-check-input" type="checkbox" name="mtype" value="2D" checked={mtype.includes("2D")} onChange={handletype}/>
                                    <label className="form-check-label">2D</label>
                                </div>
                                <div className="form-check">
                                    <input className="form-check-input" type="checkbox" name="mtype" value="3D" checked={mtype.includes("3D")} onChange={handletype}/>
                                    <label className="form-check-label">3D</label>
                                </div>
                                <div className="form-check">
                                    <input className="form-check-input" type="checkbox" name="mtype" value="IMAX" checked={mtype.includes("IMAX")} onChange={handletype}/>
                                    <label className="form-check-label">IMAX</label>
                                </div>
                            </div>
                            <div className="mb-3">
                                <label className="form-label fs-5 fw-semibold">State</label>
                                <select className="form-select" name="state" value={mstate} onChange={(e) => {setState(e.target.value)}} >
                                    <option value="">--SELECT--</option>
                                    <option value="Telugu">AP</option>
                                    <option value="Bollywood">Mumbai</option>
                                    <option value="Kollywood">Karnataka</option>
                                </select>
                            </div>
                            <div className="mb-3 text-center">
                               <button className="btn btn-primary rounded-4 w-50">Add Movie</button>
                            </div>
                        </form>
                    </div>
                    {movieList.length > 0 &&
                     (<div className='col-7 shadow bg-primary-subtle p-3 rounded-3'>
                        <MovieTable movies={movieList} />
                    </div>)}
                </div>
            </div>
           </>
    );
}