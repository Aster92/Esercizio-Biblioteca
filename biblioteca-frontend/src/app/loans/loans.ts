import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Loan } from '../interfaces/loan.model';
import { LoanService } from '../services/loan-service';

@Component({
  selector: 'app-loans',
  standalone: true,
  templateUrl: './loans.html',
  styleUrl: './loans.css',
})
export class Loans implements OnInit {
  loans: Loan[] = [];

  constructor(
    private loanService: LoanService,
    private cdr: ChangeDetectorRef,
  ) {}

  ngOnInit(): void {
    this.loadLoans();
  }

  loadLoans(): void {
    this.loanService.findAll().subscribe({
      next: (data) => {
        this.loans = data;
        this.cdr.detectChanges();
      },
      error: (err) => console.error(err),
    });
  }
}
