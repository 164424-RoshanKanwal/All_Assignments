var http = require("http");
var fs = require("fs");

var server= http.createServer((req, res) => {
    fs.readFile("index.html", function(err, data){
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write(data);
        res.end();

    });    

}).listen(1243);

console.log("Done");