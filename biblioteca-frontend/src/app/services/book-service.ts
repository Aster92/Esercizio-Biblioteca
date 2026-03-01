import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../interfaces/book.model';

@Injectable({
  providedIn: 'root',
})
export class BookService {
  private apiUrl = 'http://localhost:8080/book';

  constructor(private http: HttpClient) {}

  save(book: Book): Observable<Book> {
    return this.http.post<Book>(this.apiUrl, book);
  }

  findAll(): Observable<Book[]> {
    return this.http.get<Book[]>(this.apiUrl);
  }

  findById(id: number): Observable<Book> {
    return this.http.get<Book>(`${this.apiUrl}/${id}`);
  }

  delete(id: number): Observable<Book> {
    return this.http.delete<Book>(`${this.apiUrl}/${id}`);
  }
}
