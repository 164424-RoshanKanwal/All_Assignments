import { ToDoItem } from "./ToDoItem";
import { ToDoItemInterface } from "./ToDoItemInterface";


export interface ToDoListInterface extends ToDoItemInterface{

    tasks : Array<ToDoItem>;
    addTask(task : ToDoItem) : void;
    removeTask(task : ToDoItem): string;
    listAll() : void;

}