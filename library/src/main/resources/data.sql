-- Publishers
INSERT INTO publishers (id, name) VALUES (1, 'Mondadori');
INSERT INTO publishers (id, name) VALUES (2, 'Einaudi');
INSERT INTO publishers (id, name) VALUES (3, 'Feltrinelli');
INSERT INTO publishers (id, name) VALUES (4, 'Rizzoli');
INSERT INTO publishers (id, name) VALUES (5, 'Adelphi');
INSERT INTO publishers (id, name) VALUES (6, 'Bompiani');
INSERT INTO publishers (id, name) VALUES (7, 'Garzanti');
INSERT INTO publishers (id, name) VALUES (8, 'Laterza');

-- Authors
INSERT INTO authors (id, name, surname) VALUES (1, 'Umberto', 'Eco');
INSERT INTO authors (id, name, surname) VALUES (2, 'Italo', 'Calvino');
INSERT INTO authors (id, name, surname) VALUES (3, 'Elena', 'Ferrante');
INSERT INTO authors (id, name, surname) VALUES (4, 'Alessandro', 'Baricco');
INSERT INTO authors (id, name, surname) VALUES (5, 'Giorgio', 'Bassani');
INSERT INTO authors (id, name, surname) VALUES (6, 'Dino', 'Buzzati');
INSERT INTO authors (id, name, surname) VALUES (7, 'Carlo', 'Levi');
INSERT INTO authors (id, name, surname) VALUES (8, 'Natalia', 'Ginzburg');
INSERT INTO authors (id, name, surname) VALUES (9, 'Leonardo', 'Sciascia');
INSERT INTO authors (id, name, surname) VALUES (10, 'Pier Paolo', 'Pasolini');
INSERT INTO authors (id, name, surname) VALUES (11, 'Alberto', 'Moravia');
INSERT INTO authors (id, name, surname) VALUES (12, 'Cesare', 'Pavese');

-- Books
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (1, 'Il Nome della Rosa', '1980-01-01', 1, '978-8804668003');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (2, 'Se una notte d inverno un viaggiatore', '1979-01-01', 2, '978-8806220385');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (3, 'L amica geniale', '2011-01-01', 3, '978-8834974494');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (4, 'Oceano Mare', '1993-01-01', 1, '978-8804668010');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (5, 'Il Giardino dei Finzi-Contini', '1962-01-01', 2, '978-8806220001');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (6, 'Il Deserto dei Tartari', '1940-01-01', 4, '978-8817110001');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (7, 'Cristo si e fermato a Eboli', '1945-01-01', 2, '978-8806220002');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (8, 'Lessico famigliare', '1963-01-01', 2, '978-8806220003');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (9, 'Il giorno della civetta', '1961-01-01', 5, '978-8845900001');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (10, 'Ragazzi di vita', '1955-01-01', 6, '978-8845200001');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (11, 'Gli indifferenti', '1929-01-01', 6, '978-8845200002');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (12, 'La luna e i falo', '1950-01-01', 2, '978-8806220004');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (13, 'Foucault s Pendulum', '1988-01-01', 1, '978-8804668004');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (14, 'Le cosmicomiche', '1965-01-01', 2, '978-8806220386');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (15, 'Storia nuova', '2012-01-01', 3, '978-8834974495');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (16, 'Novecento', '1994-01-01', 7, '978-8811000001');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (17, 'Cinque storie ferraresi', '1956-01-01', 2, '978-8806220005');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (18, 'Un amore', '1963-01-01', 4, '978-8817110002');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (19, 'A ciascuno il suo', '1966-01-01', 5, '978-8845900002');
INSERT INTO books (id, title, publication_date, publisher_id, isbn) VALUES (20, 'Una vita violenta', '1959-01-01', 6, '978-8845200003');

-- Book - Authors (tabella intermedia)
INSERT INTO book_authors (book_id, author_id) VALUES (1, 1);
INSERT INTO book_authors (book_id, author_id) VALUES (2, 2);
INSERT INTO book_authors (book_id, author_id) VALUES (3, 3);
INSERT INTO book_authors (book_id, author_id) VALUES (4, 4);
INSERT INTO book_authors (book_id, author_id) VALUES (5, 5);
INSERT INTO book_authors (book_id, author_id) VALUES (6, 6);
INSERT INTO book_authors (book_id, author_id) VALUES (7, 7);
INSERT INTO book_authors (book_id, author_id) VALUES (8, 8);
INSERT INTO book_authors (book_id, author_id) VALUES (9, 9);
INSERT INTO book_authors (book_id, author_id) VALUES (10, 10);
INSERT INTO book_authors (book_id, author_id) VALUES (11, 11);
INSERT INTO book_authors (book_id, author_id) VALUES (12, 12);
INSERT INTO book_authors (book_id, author_id) VALUES (13, 1);
INSERT INTO book_authors (book_id, author_id) VALUES (14, 2);
INSERT INTO book_authors (book_id, author_id) VALUES (15, 3);
INSERT INTO book_authors (book_id, author_id) VALUES (16, 4);
INSERT INTO book_authors (book_id, author_id) VALUES (17, 5);
INSERT INTO book_authors (book_id, author_id) VALUES (18, 6);
INSERT INTO book_authors (book_id, author_id) VALUES (19, 9);
INSERT INTO book_authors (book_id, author_id) VALUES (20, 10);

-- Libraries
INSERT INTO libraries (id, name, address, city, province, state) VALUES (1, 'Biblioteca Centrale', 'Via Roma 1', 'Milano', 'MI', 'Italia');
INSERT INTO libraries (id, name, address, city, province, state) VALUES (2, 'Biblioteca Nazionale', 'Via Nazionale 5', 'Roma', 'RM', 'Italia');
INSERT INTO libraries (id, name, address, city, province, state) VALUES (3, 'Biblioteca Comunale', 'Via Garibaldi 12', 'Napoli', 'NA', 'Italia');
INSERT INTO libraries (id, name, address, city, province, state) VALUES (4, 'Biblioteca Civica', 'Via Mazzini 3', 'Torino', 'TO', 'Italia');
INSERT INTO libraries (id, name, address, city, province, state) VALUES (5, 'Biblioteca Provinciale', 'Via Cavour 8', 'Firenze', 'FI', 'Italia');

-- Library - Books (tabella intermedia)
INSERT INTO library_books (library_id, book_id) VALUES (1, 1);
INSERT INTO library_books (library_id, book_id) VALUES (1, 2);
INSERT INTO library_books (library_id, book_id) VALUES (1, 5);
INSERT INTO library_books (library_id, book_id) VALUES (1, 13);
INSERT INTO library_books (library_id, book_id) VALUES (1, 14);
INSERT INTO library_books (library_id, book_id) VALUES (2, 3);
INSERT INTO library_books (library_id, book_id) VALUES (2, 4);
INSERT INTO library_books (library_id, book_id) VALUES (2, 9);
INSERT INTO library_books (library_id, book_id) VALUES (2, 19);
INSERT INTO library_books (library_id, book_id) VALUES (3, 6);
INSERT INTO library_books (library_id, book_id) VALUES (3, 7);
INSERT INTO library_books (library_id, book_id) VALUES (3, 10);
INSERT INTO library_books (library_id, book_id) VALUES (3, 20);
INSERT INTO library_books (library_id, book_id) VALUES (4, 8);
INSERT INTO library_books (library_id, book_id) VALUES (4, 11);
INSERT INTO library_books (library_id, book_id) VALUES (4, 16);
INSERT INTO library_books (library_id, book_id) VALUES (4, 18);
INSERT INTO library_books (library_id, book_id) VALUES (5, 12);
INSERT INTO library_books (library_id, book_id) VALUES (5, 15);
INSERT INTO library_books (library_id, book_id) VALUES (5, 17);

-- Librarians
INSERT INTO librarians (id, name, surname, address, city, province, email, library_id, hiring_date) VALUES (1, 'Marco', 'Rossi', 'Via Verdi 3', 'Milano', 'MI', 'marco.rossi@biblioteca.it', 1, '2020-01-15');
INSERT INTO librarians (id, name, surname, address, city, province, email, library_id, hiring_date) VALUES (2, 'Laura', 'Bianchi', 'Via Manzoni 7', 'Roma', 'RM', 'laura.bianchi@biblioteca.it', 2, '2019-06-01');
INSERT INTO librarians (id, name, surname, address, city, province, email, library_id, hiring_date) VALUES (3, 'Giovanni', 'Russo', 'Via Toledo 15', 'Napoli', 'NA', 'giovanni.russo@biblioteca.it', 3, '2021-03-10');
INSERT INTO librarians (id, name, surname, address, city, province, email, library_id, hiring_date) VALUES (4, 'Sofia', 'Esposito', 'Via Po 22', 'Torino', 'TO', 'sofia.esposito@biblioteca.it', 4, '2018-09-01');
INSERT INTO librarians (id, name, surname, address, city, province, email, library_id, hiring_date) VALUES (5, 'Chiara', 'Ricci', 'Via dei Servi 4', 'Firenze', 'FI', 'chiara.ricci@biblioteca.it', 5, '2022-01-20');
INSERT INTO librarians (id, name, surname, address, city, province, email, library_id, hiring_date) VALUES (6, 'Antonio', 'Conti', 'Via Dante 9', 'Milano', 'MI', 'antonio.conti@biblioteca.it', 1, '2017-05-15');
INSERT INTO librarians (id, name, surname, address, city, province, email, library_id, hiring_date) VALUES (7, 'Federica', 'Gallo', 'Via Appia 33', 'Roma', 'RM', 'federica.gallo@biblioteca.it', 2, '2023-02-01');

-- Members
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (1, 'Giuseppe', 'Verdi', 'Via Dante 10', 'Milano', 'MI', 'giuseppe.verdi@email.it', '2023-01-10', 0, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (2, 'Anna', 'Ferrari', 'Via Leopardi 4', 'Roma', 'RM', 'anna.ferrari@email.it', '2022-05-20', 2, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (3, 'Luca', 'Marino', 'Via Foscolo 8', 'Milano', 'MI', 'luca.marino@email.it', '2021-11-30', 3, true);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (4, 'Sara', 'Romano', 'Via Caracciolo 5', 'Napoli', 'NA', 'sara.romano@email.it', '2023-03-15', 0, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (5, 'Paolo', 'Colombo', 'Corso Francia 18', 'Torino', 'TO', 'paolo.colombo@email.it', '2022-07-01', 1, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (6, 'Martina', 'Rizzo', 'Via Panzani 2', 'Firenze', 'FI', 'martina.rizzo@email.it', '2021-04-20', 0, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (7, 'Davide', 'Greco', 'Via Torino 44', 'Milano', 'MI', 'davide.greco@email.it', '2020-12-05', 0, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (8, 'Valentina', 'Bruno', 'Via Nomentana 67', 'Roma', 'RM', 'valentina.bruno@email.it', '2023-06-10', 0, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (9, 'Francesco', 'De Luca', 'Via Toledo 3', 'Napoli', 'NA', 'francesco.deluca@email.it', '2022-02-14', 2, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (10, 'Giulia', 'Mancini', 'Via Roma 55', 'Torino', 'TO', 'giulia.mancini@email.it', '2021-08-30', 0, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (11, 'Roberto', 'Lombardi', 'Lungarno Corsini 6', 'Firenze', 'FI', 'roberto.lombardi@email.it', '2020-10-10', 1, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (12, 'Alessia', 'Barbieri', 'Via Solferino 12', 'Milano', 'MI', 'alessia.barbieri@email.it', '2023-09-01', 0, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (13, 'Matteo', 'Fontana', 'Via Condotti 8', 'Roma', 'RM', 'matteo.fontana@email.it', '2022-11-20', 0, false);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (14, 'Elisa', 'Santoro', 'Via Posillipo 14', 'Napoli', 'NA', 'elisa.santoro@email.it', '2021-06-15', 3, true);
INSERT INTO members (id, name, surname, address, city, province, email, registration_date, warnings, blocked) VALUES (15, 'Simone', 'Marini', 'Via Garibaldi 19', 'Torino', 'TO', 'simone.marini@email.it', '2020-03-25', 0, false);

-- Loans
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (1, 1, 1, '2024-01-10', '2024-01-25', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (2, 2, 2, '2024-02-01', '2024-02-15', true);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (3, 3, 3, '2024-03-05', '2024-03-20', true);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (4, 4, 4, '2024-01-15', '2024-01-30', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (5, 5, 5, '2024-02-10', '2024-02-25', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (6, 6, 6, '2024-03-01', '2024-03-16', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (7, 7, 7, '2024-01-20', '2024-02-04', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (8, 8, 8, '2024-02-15', '2024-03-01', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (9, 9, 9, '2024-03-10', '2024-03-25', true);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (10, 10, 10, '2024-01-05', '2024-01-20', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (11, 11, 11, '2024-02-20', '2024-03-06', true);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (12, 12, 12, '2024-03-15', '2024-03-30', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (13, 13, 13, '2024-01-25', '2024-02-09', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (14, 14, 14, '2024-02-05', '2024-02-20', true);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (15, 15, 15, '2024-03-20', '2024-04-04', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (16, 1, 16, '2024-04-01', '2024-04-16', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (17, 2, 17, '2024-04-05', '2024-04-20', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (18, 4, 18, '2024-04-10', '2024-04-25', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (19, 5, 19, '2024-04-15', '2024-04-30', true);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (20, 6, 20, '2024-04-20', '2024-05-05', false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (21, 1, 3, '2024-05-01', null, false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (22, 4, 6, '2024-05-05', null, false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (23, 7, 9, '2024-05-10', null, false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (24, 10, 12, '2024-05-15', null, false);
INSERT INTO loans (id, member_id, book_id, loan_date, loan_returned_date, is_damaged) VALUES (25, 13, 15, '2024-05-20', null, false);
