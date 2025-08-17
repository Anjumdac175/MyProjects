// 2.Create four html files addition.html, substraction.html, multiplication.html, division.html  and perform the airthmatic calculation on express server

const express = require("express")
const app = express();
const fs = require("fs");

app.get("/addition.html", function (req, res) {
    fs.readFile("addition.html", (err, data) => {
        if (err) {
            res.send("file not found");
        } else {
            res.send(data.toString());
        }
    })
})
app.get("/substraction.html", function (req, res) {
    fs.readFile("substraction.html", (err, data) => {
        if (err) {
            res.send("file not found");
        } else {
            res.send(data.toString());
        }
    })
})

app.get("/multiplication.html", function (req, res) {
    fs.readFile("multiplication.html", (err, data) => {
        if (err) {
            res.send("file not found");
        } else {
            res.send(data.toString());
        }
    })

})
app.get("/division.html", function (req, res) {
    fs.readFile("division.html", (err, data) => {
        if (err) {
            res.send("file not found");
        } else {
            res.send(data.toString());
        }
    })
})

app.listen(2000, function () {
    console.log("Server running is 2000")
})