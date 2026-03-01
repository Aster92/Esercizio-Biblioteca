import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { MemberService } from '../services/member-service';
import { Member } from '../interfaces/member.model';

@Component({
  selector: 'app-members',
  standalone: true,
  templateUrl: './members.html',
  styleUrl: './members.css',
})
export class Members implements OnInit {
  members: Member[] = [];

  constructor(
    private memberService: MemberService,
    private cdr: ChangeDetectorRef,
  ) {}

  ngOnInit(): void {
    this.loadMembers();
  }

  loadMembers(): void {
    this.memberService.findAll().subscribe({
      next: (data) => {
        this.members = data;
        this.cdr.detectChanges();
      },
      error: (err) => console.error(err),
    });
  }
}
