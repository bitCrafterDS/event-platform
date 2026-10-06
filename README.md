# Event Platform

A registration and management platform for college events, built with Java and Spring Boot.

## Why I'm building this

I run events at LNCT Bhopal, and registrations happen entirely on Google Forms. That causes real problems:

- Every event gets its own form, so data ends up scattered across sheets
- The same person can register multiple times
- Seat limits have to be checked by hand
- Attendance is tracked manually
- Certificates are made one by one

This project replaces that workflow with one system for events, students and registrations.

## Planned features

- Create and manage events with seat limits
- One registration per student per event (enforced at the database level)
- Registration closes automatically when seats are full
- QR code check-in
- Auto-generated certificates
- Student dashboard with event history

## Database design

Three tables: `students`, `events` and `registrations` (a junction table that links students to events, since one student can attend many events and one event has many students).

Full design and the reasoning behind each decision: [docs/design.md](docs/design.md)

## Status

- [x] Database design
- [x] Student class (Java)
- [ ] Event and Registration classes
- [ ] Console app (core logic without a framework)
- [ ] Spring Boot REST APIs
- [ ] PostgreSQL and authentication
- [ ] React frontend
- [ ] Docker and deployment

## Tech stack

Java, Spring Boot, PostgreSQL, React, Docker (planned)

## Author

Deepanshu, [@bitCrafterDS](https://github.com/bitCrafterDS)