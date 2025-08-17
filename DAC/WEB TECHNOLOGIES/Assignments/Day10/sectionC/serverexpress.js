// Use Express:
// 1.Create server that handle below path:
// 	a)/data -> Respond "this is data"
// 	b)/profile -> Respond "this is profile"

const express = require("express")
const app = express()

app.get("/data.html", function (req, res) {
    res.send("This is DATA")

})
app.get("/profile.html", function (req, res) {
    res.send("this is PROFILE")
})

app.listen(2000, function () {
    console.log("Server running is 2000")
})