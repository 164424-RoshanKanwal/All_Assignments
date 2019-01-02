"use strict";
exports.__esModule = true;
var ToDoItem = /** @class */ (function () {
    function ToDoItem(title, updatedAt) {
        this.status = false;
        this.updatedAt = new Date();
        this.title = title;
        this.updatedAt = updatedAt;
    }
    ToDoItem.prototype.toggleStatus = function () {
        if (this.status == true) {
            this.status = false;
        }
        else {
            this.status = true;
        }
    };
    return ToDoItem;
}());
exports.ToDoItem = ToDoItem;
var todoItem = new ToDoItem("Buy eggs", new Date());
todoItem.toggleStatus();
console.log(todoItem.status);
console.log(todoItem.title + " " + todoItem.updatedAt);
