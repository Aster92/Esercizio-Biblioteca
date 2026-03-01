import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { LibraryService } from '../services/library-service';
import { Library } from '../interfaces/library.model';

@Component({
  selector: 'app-libraries',
  standalone: true,
  templateUrl: './libraries.html',
  styleUrl: './libraries.css',
})
export class Libraries implements OnInit {
  libraries: Library[] = [];

  constructor(
    private libraryService: LibraryService,
    private cdr: ChangeDetectorRef,
  ) {}

  ngOnInit(): void {
    this.loadLibraries();
  }

  loadLibraries(): void {
    this.libraryService.findAll().subscribe({
      next: (data) => {
        this.libraries = data;
        this.cdr.detectChanges();
      },
      error: (err) => console.error(err),
    });
  }
}
