

function greet(name: string, id : number = 3) : void {      //here id is optional and has a default value of 3
    console.log(`Welcome  ${name}     Your Id : ${id} `);
    alert(`Welcome  ${name}     Your Id : ${id}`);
}

console.log(process.argv);
//greet();
// greet("roshan");
// greet("Kanwal", 33);

