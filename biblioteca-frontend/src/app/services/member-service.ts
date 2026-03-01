import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Member } from '../interfaces/member.model';

@Injectable({
  providedIn: 'root',
})
export class MemberService {
  private apiUrl = 'http://localhost:8080/member';

  constructor(private http: HttpClient) {}

  save(member: Member): Observable<Member> {
    return this.http.post<Member>(this.apiUrl, member);
  }

  findAll(): Observable<Member[]> {
    return this.http.get<Member[]>(this.apiUrl);
  }

  findById(id: number): Observable<Member> {
    return this.http.get<Member>(`${this.apiUrl}/${id}`);
  }

  delete(id: number): Observable<Member> {
    return this.http.delete<Member>(`${this.apiUrl}/${id}`);
  }
}
