"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Shape = void 0;
var Shape = /** @class */ (function () {
    function Shape() {
    }
    Shape.prototype.calcArea = function (height, width, shape) {
        if (shape == "triangle") {
            return height * width * 0.5;
        }
        else {
            return height * width;
        }
    };
    return Shape;
}());
exports.Shape = Shape;
var Employee = /** @class */ (function () {
    function Employee(firstName, lastName) {
        this.firstname = "";
        this.lastname = "";
        this.firstname = firstName;
        this.lastname = lastName;
    }
    Employee.prototype.showInfo = function () {
        return this.firstname + " " + this.lastname;
    };
    return Employee;
}());
var emp1 = new Employee("Bill", "Gates");
console.log(emp1.showInfo());
