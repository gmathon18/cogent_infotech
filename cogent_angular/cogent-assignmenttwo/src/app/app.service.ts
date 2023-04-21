import { Injectable } from "@angular/core";

@Injectable({
  providedIn: 'root',
})

export class AppService {
  constructor() {

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
}
