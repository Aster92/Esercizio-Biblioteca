Esercizio-Biblioteca
A full stack library management application built as a personal practice project.
Tech Stack

Backend - Java 21, Spring Boot, Spring Data JPA, Maven
Frontend - Angular, TypeScript, HTML, CSS
Database - H2 (embedded, runs in-memory)

Features

REST API for managing library resources (books, authors, loans)
In-memory H2 database - no external setup required
Angular frontend for browsing and displaying data

Getting Started
Requirements

Java 21 or higher
Maven 3.x
Node.js and npm (for the frontend)

Run the Backend
bashcd library
mvn spring-boot:run
The API will start on http://localhost:8080
The H2 console is available at http://localhost:8080/h2-console
Run the Frontend
bashcd biblioteca-frontend
npm install
ng serve
The frontend will start on http://localhost:4200
Project Structure
Esercizio-Biblioteca/
- library/               # Spring Boot backend
- biblioteca-frontend/   # Angular frontend
- Esercizio-database.pdf # Original exercise requirements
Notes
This is a personal practice project, built to consolidate skills in Spring Boot and Angular after professional experience as a backend Java developer.
