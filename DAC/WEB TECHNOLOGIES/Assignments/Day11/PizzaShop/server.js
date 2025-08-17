const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');
const app = express();
const PORT = 3000;

let orders = [];

app.use(bodyParser.json());
app.use(express.static(path.join(__dirname, 'public')));

app.post('/submit-order', (req, res) => {
  orders.push(req.body);
  res.json({ message: 'Order stored successfully' });
});

app.get('/get-orders', (req, res) => {
  res.json(orders);
});

app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});
