import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { PublisherService } from '../services/publisher-service';
import { Publisher } from '../interfaces/publisher.model';

@Component({
  selector: 'app-publisher',
  standalone: true,
  templateUrl: './publisher.html',
  styleUrl: './publisher.css',
})
export class Publishers implements OnInit {
  publishers: Publisher[] = [];

  constructor(
    private publisherService: PublisherService,
    private cdr: ChangeDetectorRef,
  ) {}

  ngOnInit(): void {
    this.loadPublishers();
  }

  loadPublishers(): void {
    this.publisherService.findAll().subscribe({
      next: (data) => {
        this.publishers = data;
        this.cdr.detectChanges();
      },
      error: (err) => console.error(err),
    });
  }
}
