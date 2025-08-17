// Create server that handle below path:
// a)/data -> Respond with data.html page
// b)/profile -> Respond with profile.html page
const http = require("http")
const fs = require("fs")
http.createServer(function (req, res) {
    if (req.url == "/data.html") {
        fs.readFile("data.html", function (err, data) {
            if (err) {
                res.write("Failed to open file")
            }
            else {
                res.write(data.toString());
            }
            res.end();
        })

    }
    else if (req.url == "/profile.html") {
        fs.readFile("profile.html", function (err, data) {
            if (err) {
                res.write("Failed to open file")
            }
            else {
                res.write(data.toString());
            }
            res.end();
        })
    }
    else {
        res.write("File not found");
        res.end();
    }

}).listen(3000, function () {
    console.log("server running is 3000..")
});