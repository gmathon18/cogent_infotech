import { Component } from '@angular/core';
import { Login } from './login';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  model: Login;
  constructor() {

    this.model = new Login('abc@gmail.com', 'password@123', true)
  }

  onSubmit(loginform: any) {

    window.alert(loginform.value.user);
    window.alert(loginform.value.password);

  }
}
