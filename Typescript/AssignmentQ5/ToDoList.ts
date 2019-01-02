import { ToDoListInterface } from "./ToDoListInterface";
import { ToDoItem } from "./ToDoItem";
import { ToDoItemInterface } from "./ToDoItemInterface";

class ToDoList implements ToDoListInterface{
   
todoItem : ToDoItem = new ToDoItem();
todoItem.title = "";
todoItem.


 tasks: Array<ToDoItem> = [];


 addTask(task : ToDoItem) : void{
 this.tasks.push(task);
 console.log(`Task ${task} inserted into today's tasks`);
 console.log("Number of Tasks: " + this.tasks.length);
 }
 
 
 removeTask(task : ToDoItem): string {
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