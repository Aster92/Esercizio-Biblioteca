import { Book } from "./book.model";
import { Member } from "./member.model";

export interface Loan {
  id: number;
  member: Member;
  book: Book;
  loanDate: Date;
  loanReturnedDate: Date;
  isDamaged: boolean;
}