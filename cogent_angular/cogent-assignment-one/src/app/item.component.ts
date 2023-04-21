import { Component } from "@angular/core"

@Component({
  selector: 'item',
  templateUrl: './item.component.html'
})

export class ItemComponent {
  itemNo: number = 1;
  itemName: string = "Coffee";
  itemPrice: number = 2.00;
  itemDesc: string = "Dunkin";
}
