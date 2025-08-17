const express = require("express");
const cors = require("cors");

const app = express();
const port = 8000;

app.use(cors());
app.use(express.json());

let mList = [];


app.get('/api/movies',(req, res) => {
    res.json(mList);
});

app.post('/api/movies',(req,res) => {
    const movie = req.body;
    if(!movie.mname || !movie.mactor || !movie.rdate){
       return res.status(400).json({error: "Missing Fields"});
    }
    mList.push(movie);
    res.status(201).json({message:"Data added Successfully", movie});
});

app.delete('/api/movies/:index', (req,res) => {
    const idx = parseInt(req.params.index);
    if(idx >= 0 && idx < mList.length){
        mList.splice(idx,1);
        res.json({message:"Movie deleted.."});
    }else{
        res.status(404).json({error:"Movie not found to delete"});
    }
});

app.listen(port, () =>{
    console.log(`Server is running at http://localhost:${port}`);
});