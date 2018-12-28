var http = require("http");
var url = require("url");
var fs = require("fs");

var server = http.createServer((req, res) => 
{
    fs.readFile("readName.txt", (err, data)=>
{
    res.statusCode = 200;
res.setHeader('Content-Type', 'text/plain');
res.end("Hello " + data);

});
//var q = url.parse(req.url, true).pathname;
//res.statusCode = 200;
//res.setHeader('Content-Type', 'text/plain');
//res.end("Hello " + q);

}).listen(4000, "127.0.0.1");