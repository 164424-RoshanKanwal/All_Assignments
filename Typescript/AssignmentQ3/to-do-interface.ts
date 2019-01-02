export interface ITodo{

    tasks : Array<string>;
    addTask(task : string) : void;
    removeTask(task : string): string;
    listAll() : void;

}