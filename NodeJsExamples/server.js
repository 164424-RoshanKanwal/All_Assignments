const http =require('http');
const localhost = '127.0.0.1';
const port = '3333';
const server = http.createServer((req, res) => {
    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/plain');
    res.end("Success, i'm listening from port: " + port);
  });
  
  server.listen(port, localhost, () => {
    console.log(`Server running at http://${localhost}:${port}/`);
  });