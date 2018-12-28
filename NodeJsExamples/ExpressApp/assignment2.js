var express = require("express");
var app = express();
var moment = require("moment");


app.get("/year", function(req, res) {
var age = req.param("age");
var date = moment().year() - age;
res.end("You were born in "+ date);
});
app.listen(1234);