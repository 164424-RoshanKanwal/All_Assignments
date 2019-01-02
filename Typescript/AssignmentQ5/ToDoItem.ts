import { ToDoItemInterface } from "./ToDoItemInterface";


export class ToDoItem implements ToDoItemInterface{
    title: string;   
    status: boolean = false;
    updatedAt: Date = new Date();

    constructor(title ?: string, updatedAt ?: Date) {
       this.title=title;
       this.updatedAt= updatedAt;
    }

    
    

    toggleStatus() {
        
        if(this.status == true){
            this.status = false;
        }
        else{
            this.status = true;
        }
        }
}



let todoItem : ToDoItem = new ToDoItem("Buy eggs", new Date());
todoItem.toggleStatus();
console.log(todoItem.status);
console.log(todoItem.title+ " " + todoItem.updatedAt);




