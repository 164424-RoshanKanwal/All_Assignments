import {IShape} from './IShape'
class Rectangle implements IShape{

    
    constructor(width: number, height: number) {
        
        this.width = width;
        this.height = height;
    }

    area(): number {
        return this.width*this.height;
    }
    toString(): string {
        return `The area of rectangle with width ${this.width} and height equal to ${this.height} is ${this.area()}`;;
    }
    color: string = "red";   
  
    private width: number;
    private height: number;

}

let rectangle : Rectangle = new Rectangle(10,12);
console.log(rectangle.area());
console.log(rectangle.toString());
console.log(rectangle.color);