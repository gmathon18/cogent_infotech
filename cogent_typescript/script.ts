export class Shape {

  calcArea(height: number, width: number, shape?: string) {

    if (shape == "triangle") {
      return height * width * 0.5;
    } else {
      return height * width;
    }
  }
}



class Employee {
  firstname: string = "";
  lastname: string = "";

  constructor(firstName: string, lastName: string) {
    this.firstname = firstName;
    this.lastname = lastName;
  }
  showInfo(): string {
    return this.firstname + " " + this.lastname
  }
}
let emp1 = new Employee("Bill", "Gates");
console.log(emp1.showInfo());

