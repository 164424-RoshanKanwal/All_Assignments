var fs = require('fs');
fs.readFile('readMe.txt','utf8',function(err, data){
fs.writeFile('writeAgain1.txt', data);
});



