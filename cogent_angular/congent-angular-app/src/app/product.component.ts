import { Component } from "@angular/core"

@Component({
  selector: 'product',
  templateUrl: './product.component.html'
})

export class ProductComponent {

  productNo: number = 1001;
  productName: string = "HP Laptop";
  productPrice: number = 500;
  ImageUrl: string = "https://assets.hermes.com/is/image/hermesproduct/h-embroidered-t-shirt--072025HA01-worn-5-0-0-800-800_g.jpg"

  name: string = "Gyanendra Singh";

  message() {
    alert("Did you click me");
  }
}
