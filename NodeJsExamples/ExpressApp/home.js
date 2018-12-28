var express = require("express");
var app = express();

app.get("/home", (req, res)=> {
    res.send("Hello World");
}).listen(process.argv[2]);

console.log(process.argv[0]);
console.log(process.argv[1]);
