import { Library } from "./library.model";

export interface Librarian {
  id: number;
  name: string;
  surname: string;
  address: string;
  city: string;
  province: string;
  email: string;
  library: Library;
  hiringDate: Date;
  dischargeDate: Date;
}