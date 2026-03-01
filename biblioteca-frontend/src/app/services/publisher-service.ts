import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Publisher } from '../interfaces/publisher.model';


@Injectable({
  providedIn: 'root',
})
export class PublisherService {
  private apiUrl = 'http://localhost:8080/publisher';

  constructor(private http: HttpClient) {}

  save(publisher: Publisher): Observable<Publisher> {
    return this.http.post<Publisher>(this.apiUrl, publisher);
  }

  findAll(): Observable<Publisher[]> {
    return this.http.get<Publisher[]>(this.apiUrl);
  }

  findById(id: number): Observable<Publisher> {
    return this.http.get<Publisher>(`${this.apiUrl}/${id}`);
  }

  delete(id: number): Observable<Publisher> {
    return this.http.delete<Publisher>(`${this.apiUrl}/${id}`);
  }
}
