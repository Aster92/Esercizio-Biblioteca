import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Author } from '../interfaces/author.model';

@Injectable({
  providedIn: 'root',
})
export class AuthorService {
  private apiUrl = 'http://localhost:8080/author';

  constructor(private http: HttpClient) {}

  save(author: Author): Observable<Author> {
    return this.http.post<Author>(this.apiUrl, author);
  }

  findAll(): Observable<Author[]> {
    return this.http.get<Author[]>(this.apiUrl);
  }

  findById(id: number): Observable<Author> {
    return this.http.get<Author>(`${this.apiUrl}/${id}`);
  }

  delete(id: number): Observable<Author> {
    return this.http.delete<Author>(`${this.apiUrl}/${id}`);
  }
}
