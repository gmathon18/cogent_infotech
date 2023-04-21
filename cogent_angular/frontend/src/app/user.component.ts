import { Component, OnInit } from "@angular/core";
import { UserService } from "./UserService";
import { User } from "./user";

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html'

})
export class UserComponent implements OnInit {

  users: User[];

  constructor(private userService: UserService) {

    this.users = [];
  }

  ngOnInit(): void {

    this.userService.getUsers().subscribe((data: User[]) => {
      console.log(data);
      this.users = data;
    });
  }
}
