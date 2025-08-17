const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');
const app = express();
const PORT = 3000;

let movies = []; // To store movies temporarily

app.use(bodyParser.json());
app.use(express.static(path.join(__dirname, 'public')));

// Endpoint to add movies
app.post('/add-movies', (req, res) => {
  movies = req.body; // Array of 3 movies
  res.json({ message: 'Movies stored successfully' });
});

// Endpoint to fetch movies
app.get('/get-movies', (req, res) => {
  res.json(movies);
});

app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
