var url = "https://u:p@www.example.com:777/a/b?c=d&e=f#g";
var parsedUrl = require('url').parse(url);
const localhost = '127.0.0.1';
//console.log(parsedUrl);
const port = 1234;
const http = require('http');
const server = http.createServer((req, res)=> {
res.statusCode = 200;
res.setHeader('Content-Type', 'text/plain');
res.write(parsedUrl);
res.end();});
server.listen(port, localhost, () => {
    console.log(`Server running at http://${localhost}:${port}/`);
  });
  
 var multipleFunctionExp = require('./multipleFunctionExp');

  console.log(multipleFunctionExp.counter(['hello', 'hello', 'rewahf', 'ryell','bay']));
//console.log(multipleFunctionExp.adder(23,45));
//console.log(multipleFunctionExp.pi(pi));
  