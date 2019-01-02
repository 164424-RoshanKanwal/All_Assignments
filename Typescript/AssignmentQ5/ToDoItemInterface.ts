export interface ToDoItemInterface {

    title : string;
    status: boolean;
    updatedAt: Date;
    toggleStatus();
}