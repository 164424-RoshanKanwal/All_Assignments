var express = require("express");
var app = express();

app.get("/", (req, res)=> {
    res.write("loginForm.html")
}
).listen(3333);