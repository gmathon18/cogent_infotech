import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({

  providedIn: 'root'
})
export class UserService {

  private baseUrl = "http://localhost:8080/api/user";

  constructor(private http: HttpClient) {

  }

  getUsers(): Observable<User[]> {

    return this.http.get<User[]>(`${this.baseUrl}`);
  }

  createUser(user: User): Observable<User[]> {

    return this.http.post<User[]>(`${this.baseUrl}`, user);
  }

  editUser(user: User): Observable<User[]> {

    return this.http.put<User[]>(`${this.baseUrl}/${user.id}`, user);
  }

  deleteUser(id: number): Observable<any> {

    return this.http.delete<User>((`${this.baseUrl}/id=${id}`));
  }


}

