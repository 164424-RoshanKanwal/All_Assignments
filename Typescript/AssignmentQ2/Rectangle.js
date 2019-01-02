"use strict";
exports.__esModule = true;
var Rectangle = /** @class */ (function () {
    function Rectangle(width, height) {
        this.color = "red";
        this.width = width;
        this.height = height;
    }
    Rectangle.prototype.area = function () {
        return this.width * this.height;
    };
    Rectangle.prototype.toString = function () {
        return "The area of rectangle with width " + this.width + " and height equal to " + this.height + " is " + this.area();
        ;
    };
    return Rectangle;
}());
var rectangle = new Rectangle(10, 12);
console.log(rectangle.area());
console.log(rectangle.toString());
console.log(rectangle.color);
