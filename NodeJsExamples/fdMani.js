var fs = require('fs');

fs.unlinkSync('Hello/write.txt');
fs.rmdirSync('Hello');

fs.mkdir('Hello', function(){
    fs.writeFileSync('Hello/write.txt' , "Kya hua");
    });


