import { Routes } from '@angular/router';
import { Libraries } from './libraries/libraries';
import { Authors } from './authors/authors';
import { Publishers } from './publisher/publisher';
import { Members } from './members/members';
import { Loans } from './loans/loans';
import { Librarians } from './librarians/librarians';
import { Books } from './books/books';

export const routes: Routes = [
  { path: 'libraries', component: Libraries },
  { path: 'authors', component: Authors },
  { path: 'books', component: Books },
  { path: 'librarians', component: Librarians },
  { path: 'loans', component: Loans },
  { path: 'members', component: Members },
  { path: 'publishers', component: Publishers },
  { path: '', redirectTo: '/libraries', pathMatch: 'full' }
];
