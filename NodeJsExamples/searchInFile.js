var fs = require('fs');
var count =0 ;
var array = fs.readFileSync("write.txt").toString().split(" ");
for(var index = 0 ; index < array.length; index++){
    console.log(array[index]);
for(var innerIndex = i +1; innerIndex < array.length; innerIndex++){

    if(array[index]==array[innerIndex]){
        count++;

    }

}
    //console.log(array[index]);
}
