var express = require("express");
var app = express();
var moment = require("moment");


app.get("/year", function(req, res) {
var age = req.param("age");
var date = moment();
console.log(date);

});
