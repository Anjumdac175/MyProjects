/*const express = require('express');
const path = require('path');
const app = express();
const port = 3000;

// json body parser

app.use(express.static(__dirname));

// get register.html page
app.get('/',(req,res) => {
    res.sendFile(path.join(__dirname,'index.html'));
});


// handle the post
app.post('/register',(req,res) => {
    console.log('Recieved:', req.body);
    res.send('register success');
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});*/


//this to navigate another page
const express = require('express');
const path = require('path');
const app = express();
const port = 3000;

// json body parser
app.use(express.json());

app.use(express.static(__dirname));

let students = [];
let nxtid = 1;

// get register.html page
app.get('/',(req,res) => {
    res.sendFile(path.join(__dirname,'index.html'));
});


// handle the post
app.post('/register',(req,res) => {
   const student = req.body;
   student.id = nxtid++;
   students.push(student);
   console.log("saved student:", student);
   res.json({id: student.id});
});

//details html page data fetch
app.get('/details',(req,res) => {
    res.sendFile(path.join(__dirname, 'details.html'));
});

app.get('/student/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const student = students.find(s => s.id === id);

    if(student){
        res.json(student);
    }else{
        res.status(400).json({error: 'Student not found'});
    }
});


app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});