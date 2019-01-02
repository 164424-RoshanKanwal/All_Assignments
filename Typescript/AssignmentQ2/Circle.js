"use strict";
exports.__esModule = true;
var Circle = /** @class */ (function () {
    function Circle(radius) {
        this.pi = 3.1416;
        this.radius = radius;
    }
    Circle.prototype.area = function () {
        return this.pi * this.radius * this.radius;
    };
    Circle.prototype.toString = function () {
        return "The area of circle with radius " + this.radius + " is " + this.area();
    };
    return Circle;
}());
var circle = new Circle(10);
console.log(circle.area());
console.log(circle.toString());
