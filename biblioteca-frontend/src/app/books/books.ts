import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Book } from '../interfaces/book.model';
import { BookService } from '../services/book-service';

@Component({
  selector: 'app-books',
  standalone: true,
  templateUrl: './books.html',
  styleUrl: './books.css',
})
export class Books implements OnInit {
  books: Book[] = [];

  constructor(
    private bookService: BookService,
    private cdr: ChangeDetectorRef,
  ) {}

  ngOnInit(): void {
    this.loadBooks();
  }

  loadBooks(): void {
    this.bookService.findAll().subscribe({
      next: (data) => {
        this.books = data;
        this.cdr.detectChanges();
      },
      error: (err) => console.error(err),
    });
  }
}
