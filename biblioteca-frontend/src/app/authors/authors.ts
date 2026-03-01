import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { AuthorService } from '../services/author-service';
import { Author } from '../interfaces/author.model';

@Component({
  selector: 'app-authors',
  standalone: true,
  templateUrl: './authors.html',
  styleUrl: './authors.css',
})
export class Authors implements OnInit {
  authors: Author[] = [];

  constructor(
    private authorService: AuthorService,
    private cdr: ChangeDetectorRef,
  ) {}

  ngOnInit(): void {
    this.loadAuthors();
  }

  loadAuthors(): void {
    this.authorService.findAll().subscribe({
      next: (data) => {
        this.authors = data;
        this.cdr.detectChanges();
      },
      error: (err) => console.error(err),
    });
  }
}
