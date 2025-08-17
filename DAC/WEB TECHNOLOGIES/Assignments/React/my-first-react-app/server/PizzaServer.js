const express = require("express");
const cors = require("cors");
const app = express();
const port = 8000;

app.use(cors());
app.use(express.json());

let orders = [];

app.get('/api/place',(req,res) => {
    res.json(orders);
});

app.post('/api/place',(req,res) => {
    const porder = req.body;
    orders.push(porder);
    res.send(201).json({message:"Data Recieved succesfully", porder});
});

app.delete('/api/place/:index',(req,res) =>{
    const index = parseInt(req.params.index);
    if(index >= 0 && index < orders.length){
        orders.splice(index,1);
        res.json({message:"Order Deleted.."});
    }else{
        res.status(400).json({error:"Error while deleting order"});
    }
});

app.put('/api/place/:index',(req,res) =>{
    const index = parseInt(req.params.index);
    if(index >= 0 && index < orders.length){
        orders[index] = req.body;
        res.json({message:"Order edited Successfully", order:orders[index]});
    }else{
        res.status(400).json({error:"Invalid order id"});
    }
});

app.listen(port, () =>{
    console.log(`Server is running at http://localhost${port}`);
});