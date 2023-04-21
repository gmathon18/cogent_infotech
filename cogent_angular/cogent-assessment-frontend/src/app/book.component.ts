import { Component, OnInit } from "@angular/core";
import { BookService } from "./BookService";
import { Book } from "./book";

@Component({
  selector: 'app-user',
  templateUrl: './book.component.html'
})

export class BookComponent implements OnInit {

  books: Book[];

  constructor(private bookService: BookService) {

    this.books = [];
  }

  ngOnInit(): void {
    this.bookService.getBooks().subscribe((data: Book[]) => {
      console.log(data);
      this.books = data;
    });
  }
}
