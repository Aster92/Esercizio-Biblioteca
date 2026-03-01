import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Librarian } from '../interfaces/librarian.model';

@Injectable({
  providedIn: 'root',
})
export class LibrarianService {
  private apiUrl = 'http://localhost:8080/librarian';

  constructor(private http: HttpClient) {}

  save(librarian: Librarian): Observable<Librarian> {
    return this.http.post<Librarian>(this.apiUrl, librarian);
  }

  findAll(): Observable<Librarian[]> {
    return this.http.get<Librarian[]>(this.apiUrl);
  }

  findById(id: number): Observable<Librarian> {
    return this.http.get<Librarian>(`${this.apiUrl}/${id}`);
  }

  delete(id: number): Observable<Librarian> {
    return this.http.delete<Librarian>(`${this.apiUrl}/${id}`);
  }
}
