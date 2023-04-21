import { Component } from "@angular/core"

@Component({
  selector: 'coffee',
  templateUrl: './beverage.component.html'
})

export class BeverageComponent {
  bevNo: number[] = [1, 2, 3, 4, 5];
  bevName: string[] = ["Coffee", "Water", "Soda", "Gatorade", "Brew"];
  bevPrice: number[] = [2.00, 1.89, 1.99, 2.29, 2.50];
  bevDesc: string[] = ["Dunkin", "Aqua", "Sprite", "Orange", "Miller"];
  bevImg: string[] = ["src/assets/images/Screen Shot 2023-04-18 at 10.19.37 AM.png", "src/app/Screen Shot 2023-04-18 at 10.19.37 AM.png", "src/app/Screen Shot 2023-04-18 at 10.19.37 AM.png", "src/app/Screen Shot 2023-04-18 at 10.19.37 AM.png", "src/app/Screen Shot 2023-04-18 at 10.19.37 AM.png"];
  delete(index: number) {
    this.bevNo.splice(index, 1);
    this.bevName.splice(index, 1);
    this.bevPrice.splice(index, 1);
    this.bevDesc.splice(index, 1);
    this.bevImg.splice(index, 1);
  }
  update(index: number) {
    this.bevNO[number] = 
  }
  displayForm() {
    this.toDisplay =
  }
}
