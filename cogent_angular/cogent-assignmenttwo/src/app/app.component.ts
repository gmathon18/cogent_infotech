import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [AppService]
})
export class AppComponent implements OnInit {

  itemholders = [] as any;
  title = "itemholder";
  showMessage = false;
  companyName = "Cogent University";
  productName = "Cricket Bat";
  productPrice = 999;

  ngOnInit(): void {

    this.itemholders = this.getItemHolder();

  }

  getItemHolder() {
    return [
      { 'id': '1', "title": 'Screw Driver', 'price': 400, 'stock': 10 },
      { 'id': '2', "title": 'Nut Volt', 'price': 300, 'stock': 100 },
      { 'id': '3', "title": 'Resistor', 'price': 50, 'stock': 200 },
      { 'id': '4', "title": 'Tractor', 'price': 60, 'stock': 300 },
      { 'id': '5', "title": 'Roller', 'price': 800, 'stock': 400 },
    ]
  }

  public dropDownValue = "";
  SetDropDownValue(drpValue: any) {
    this.dropDownValue = drpValue.target.value;
  }
}
