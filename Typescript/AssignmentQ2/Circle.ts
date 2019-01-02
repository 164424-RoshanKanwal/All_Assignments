import {IShape} from './IShape'
class Circle implements IShape{

    constructor(radius : number) {
       this.radius = radius;
        
    }
    area(): number {
    return this.pi*this.radius*this.radius;
    }

    toString(): string {
        return `The area of circle with radius ${this.radius} is ${this.area()}`;
    }

    color: string;   
    private radius: number;
    readonly pi: number = 3.1416;

}
let circle: IShape = new Circle(10);
console.log(circle.area());
console.log(circle.toString());
