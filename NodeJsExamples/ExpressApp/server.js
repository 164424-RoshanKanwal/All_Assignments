var express = require("express");
var app = express();


app.use(express.static("public")).listen(2343);

//app.get("/", (req, res)=> {
 //   res.send("Welcome to Birds Bounty");
//}).
console.log("Done");
