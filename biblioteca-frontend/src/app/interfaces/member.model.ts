import { Loan } from "./loan.model";

export interface Member {
  id: number;
  name: string;
  surname: string;
  address: string;
  city: string;
  province: string;
  email: string;
  loan: Loan[];
  warnings: number;
  blocked: boolean;
}