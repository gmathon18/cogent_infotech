export class User {
  id: number = 0;
  name: string = "";
  age: number = 0;
  salary: string = "";

  constructor(name: string, age: number, salary: string) {

    this.name = name;
    this.age = age;
    this.salary = salary;

  }
}
