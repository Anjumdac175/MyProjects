/* 1.Create server that handle below path:
    a)/data -> Respond "this is data"
    b)/profile -> Respond "this is profile"*/

const http = require("http")
//const fs = require("fs");

http.createServer(function (req, res) {
    if (req.url == "/data.html") {
        res.write("this is data")
        res.end();
    }
    else if (req.url == "/profile.html") {
        res.write("this is profile")
        res.end()
    }
    else {
        res.write("file not found")
        res.end()
    }
}).listen(2000, function () {
    console.log("2000 server is running");
})
































