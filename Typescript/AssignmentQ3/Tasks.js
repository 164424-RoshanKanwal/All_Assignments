var Tasks = /** @class */ (function () {
    function Tasks() {
        this.tasks = [];
    }
    Tasks.prototype.addTask = function (task) {
        this.tasks.push(task);
        console.log("Task " + task + " inserted into today's tasks");
        console.log("Number of Tasks: " + this.tasks.length);
    };
    Tasks.prototype.removeTask = function (task) {
        var status = "No such task is available";
        for (var index = 0; index < this.tasks.length; index++) {
            if (task == this.tasks[index]) {
                this.tasks.splice(index, 1);
                status = "Successfully Deleted";
                console.log("Task " + task + " removed into today's tasks");
                break;
            }
        }
        console.log("Number of Tasks: " + this.tasks.length);
        return status;
    };
    Tasks.prototype.listAll = function () {
        console.log("All Tasks includes:");
        for (var index = 0; index < this.tasks.length; index++) {
            console.log(this.tasks[index]);
        }
    };
    return Tasks;
}());
var t = new Tasks();
t.addTask("Buy clothes");
t.addTask("Buy Eggs");
t.removeTask("Buy Eggs");
t.addTask("Call Roshan");
t.listAll();
