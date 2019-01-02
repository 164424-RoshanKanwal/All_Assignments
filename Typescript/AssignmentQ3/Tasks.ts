
class Tasks{


 tasks: Array<string> = [];


addTask(task : string) : void{
this.tasks.push(task);
console.log(`Task ${task} inserted into today's tasks`);
console.log("Number of Tasks: " + this.tasks.length);
}


removeTask(task : string): string {
let status: string = "No such task is available"
    for(let index = 0; index < this.tasks.length; index++){
        if(task == this.tasks[index]){
        this.tasks.splice(index, 1);
        status = "Successfully Deleted";
        console.log(`Task ${task} removed from today's tasks`);
        break;
        }
    }
    console.log("Number of Tasks: " + this.tasks.length);
    return status;
}


listAll() : void {
    console.log("All Tasks includes:")
for(let index=0; index < this.tasks.length; index++){

console.log(this.tasks[index]);

}
}
}


let t : Tasks = new Tasks();
t.addTask("Buy clothes");
t.addTask("Buy Eggs");
t.removeTask("Buy Eggs");
t.addTask("Call Roshan");
t.listAll();


