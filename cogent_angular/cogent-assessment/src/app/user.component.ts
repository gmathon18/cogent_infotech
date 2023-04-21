import { Component, OnInit } from "@angular/core";
import { User } from "./user";

import { UserService } from "./UserService";

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html'
})

export class UserComponent implements OnInit {

  users: User[];
  model: User;
  showForm: boolean = false;
  constructor(private userService: UserService) {

    this.users = [];
    this.model = new User("", 0, "");
  }

  ngOnInit(): void {
    this.userService.getUsers().subscribe((data: User[]) => {
      console.log(data);
      this.users = data;
    });
  }

  listUser() {
    this.userService.getUsers().subscribe(users => {
      this.users = users;
    })
  }

  addUser(loginform: any): void {
    const newUser = new User(loginform.value.name, loginform.value.age, loginform.value.salary);
    this.userService.createUser(newUser).subscribe();
    window.location.reload();

  }

  editUser(user: User) {
    this.userService.editUser(user).subscribe();
  }

  delete(id: number) {
    this.userService.deleteUser(id).subscribe();
    window.location.reload();

  }

  editForm() {
    this.showForm = !this.showForm;
  }
}
