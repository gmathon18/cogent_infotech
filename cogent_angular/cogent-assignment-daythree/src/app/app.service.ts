import { Injectable } from "@angular/core";

@Injectable({
  providedIn: 'root',
})

export class AppService {
  constructor() {

  }
  getData() {
    return "random string";
  }
}
