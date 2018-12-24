var fs = require('fs');


var writeInFile = function(data){
    var date = new Date();
    console.log(date.getDay());
    fs.writeFileSync('write'+date.getDay()+'.txt', data);}


    writeInFile("Hello every one Something diff hello");
    console.log("done");