var Demo = /** @class */ (function () {
    function Demo() {
        this.tasks = ["Rohsan", "kanwal"];
    }
    Demo.prototype.reTask = function (name) {
        for (var index = 0; index < this.tasks.length; index++) {
            if (name == this.tasks[index]) {
                console.log("Deleted");
            }
            else {
                console.log("Not deleted");
            }
        }
    };
    return Demo;
}());
var demo = new Demo();
demo.reTask("kanwal");
