# Event Platform: Database Design

## Tables

### students
- id (PK)
- name
- email (unique)
- phone
- college
- branch

### events
- id (PK)
- title
- description
- event_date
- event_time
- venue
- seat_limit

### registrations
- id (PK)
- student_id (FK -> students.id)
- event_id (FK -> events.id)
- registered_at
- attending (yes/no)
- UNIQUE (student_id, event_id)

## Decisions
- **College aur branch alag columns:** taaki baad mein "sirf ECE ke students" jaisa filter ho sake. Ek column mein ek hi cheez.
- **Email unique:** ek hi student do baar students table mein na bane.
- **Date aur time alag columns:** abhi simple rakha hai, kyunki date se filter karna aasan hai. Zaroorat pade toh baad mein merge kar sakte hain.
- **seat_limit events mein:** Google Forms mein ye nahi tha, isi se seats full hone par registration band kar payenge.
- **UNIQUE (student_id, event_id):** ek student ek event mein sirf ek baar register ho sake. Code mein bug ho tab bhi database duplicate reject kar dega.
- **registrations alag table:** ek student kai events mein ja sakta hai aur ek event mein kai students, isliye beech mein junction table.