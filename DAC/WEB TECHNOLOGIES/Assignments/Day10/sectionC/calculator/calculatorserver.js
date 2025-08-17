const express = require("express");
const app = express();
const port = 3000;

app.use(express.json());

 const path = require("path")

app.use(express.static(path.join(__dirname, 'public')));
app.get('/',(req,res) => {
        res.sendFile(path.join(__dirname, 'public', 'index.html'));
});

app.post('/calculate',(req, res) => {
    const {num1, num2, operation} = req.body;

    //validate inputs
    if(num1 === undefined || num2 ===undefined || !operation ){
        return res.status(400).json({error : 'Missing inputs'});
    }

    const a = parseFloat(num1);
    const b = parseFloat(num2);

    if(isNaN(a) || isNaN(b)){
        return res.status(400).json({error : 'Invalid Numbers'});
    }

    let result;
    switch (operation) {
        case 'Addition':
            result =  a + b;
            break;
        case 'Subtract':
            result = a - b;
            break;
        case 'Multiply':
            result = a * b;
            break;
        case 'divide':
            if(b === 0){
                return res.status(400).json({error : 'Divide by Zero'});
            }
            result = a / b;
            break;
        case 'Modulus':
            if(b === 0){
                return res.status(400).json({error : 'Divide by Zero'});
            }
            result = a % b;
            break;
    
        default:
            return res.status(400).json({error : 'Invalid Operation'});
    }

    res.json({result});
});

app.listen(port, () => {
    console.log(`Server is running at http://localhost:${port}`);
});
