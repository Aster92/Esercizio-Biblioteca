import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Loan } from '../interfaces/loan.model';

@Injectable({
  providedIn: 'root',
})
export class LoanService {
  private apiUrl = 'http://localhost:8080/loan';

  constructor(private http: HttpClient) {}

  saveNewLoan(loan: Loan): Observable<string> {
    return this.http.post(`${this.apiUrl}`, loan, { responseType: 'text' });
  }

  saveLoanReturn(loan: Loan): Observable<string> {
    return this.http.post(`${this.apiUrl}/return`, loan, { responseType: 'text' });
  }

  findAll(): Observable<Loan[]> {
    return this.http.get<Loan[]>(this.apiUrl);
  }

  findById(id: number): Observable<Loan> {
    return this.http.get<Loan>(`${this.apiUrl}/${id}`);
  }

  delete(id: number): Observable<Loan> {
    return this.http.delete<Loan>(`${this.apiUrl}/${id}`);
  }
}
