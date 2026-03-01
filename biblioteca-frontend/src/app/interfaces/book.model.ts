import { Author } from "./author.model";
import { Publisher } from "./publisher.model";

export interface Book {
  id: number;
  title: string;
  publicationDate: Date;
  authors: Author[];
  publisher: Publisher;
  ISBN: string;
}