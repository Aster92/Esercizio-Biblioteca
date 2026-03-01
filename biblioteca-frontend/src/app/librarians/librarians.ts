import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { LibrarianService } from '../services/librarian-service';
import { Librarian } from '../interfaces/librarian.model';

@Component({
  selector: 'app-librarians',
  standalone: true,
  templateUrl: './librarians.html',
  styleUrl: './librarians.css',
})
export class Librarians implements OnInit {
  librarians: Librarian[] = [];

  constructor(
    private librarianService: LibrarianService,
    private cdr: ChangeDetectorRef,
  ) {}

  ngOnInit(): void {
    this.loadLibrarians();
  }

  loadLibrarians(): void {
    this.librarianService.findAll().subscribe({
      next: (data) => {
        this.librarians = data;
        this.cdr.detectChanges();
      },
      error: (err) => console.error(err),
    });
  }
}
