class Demo{ 

   tasks: Array<string> = ["Rohsan","kanwal"];
    constructor() {
        
    }

reTask(name : string): void{
for(let index = 0; index < this.tasks.length; index++){
    if(name == this.tasks[index]){
        console.log("Deleted");
    }
    else{
        console.log("Not deleted");
    }
}}
}

let demo: Demo = new Demo();
demo.reTask("kanwal");
