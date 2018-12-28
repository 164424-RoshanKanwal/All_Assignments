var http = require("http");
var fs = require("fs");
var url = require("url");

var server= http.createServer((req, res) => {
    
        var q = url.parse(req.url,true );
        var fileName = "." + q.pathname;
        fs.readFile(fileName, (err, data)=>{
            if(err){
                res.writeHead(404, {'Content-Type': 'text/html'});
                return res.end("404 Not Found");
            }
            res.writeHead(200, {'Content-Type': 'text/html'});
             res.write(data);
             return res.end();
        });
    }).listen(1244);

console.log("Done");