import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Library } from '../interfaces/library.model';

@Injectable({
  providedIn: 'root',
})
export class LibraryService {
  private apiUrl = 'http://localhost:8080/library';

  constructor(private http: HttpClient) {}

  save(library: any): Observable<Library> {
    return this.http.post<Library>(this.apiUrl, library);
  }

  findAll(): Observable<Library[]> {
    return this.http.get<Library[]>(this.apiUrl);
  }

  findById(id: number): Observable<Library> {
    return this.http.get<Library>(`${this.apiUrl}/${id}`);
  }

  delete(id: number): Observable<Library> {
    return this.http.delete<Library>(`${this.apiUrl}/${id}`);
  }
}
