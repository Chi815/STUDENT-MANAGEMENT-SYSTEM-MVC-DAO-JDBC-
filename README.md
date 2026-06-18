# STUDENT-MANAGEMENT-SYSTEM-MVC-DAO-JDBC-

A console-based Java application built using **MVC Architecture**, **DAO Design Pattern**, **JDBC**, and **PostgreSQL (Neon Cloud Database)**.

---

##  Features

###  Core Features
- Add Student
- View All Students
- Search Student by ID
- Update Student
- Delete Student

###  Bonus Features
- Sort students by marks (descending)
- Search students by course

---


##  Project Architecture

- **Model** → Student class (data structure)
- **View** → Console UI
- **Controller** → Handles logic flow
- **DAO** → Database operations using JDBC
- **DB** → Neon PostgreSQL

---

##  Database Table

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100),
    email VARCHAR(100),
    course VARCHAR(50),
    marks DOUBLE PRECISION
);


##  Menu Options
1. Add Student
2. View Students
3. Search Student by ID
4. Update Student
5. Delete Student
6. Sort Students by Marks
7. Search Students by Course
8. Exit

## Sample Output
===== STUDENT MANAGEMENT SYSTEM =====

ID: 101
Name: Aarav Sharma
Email: aarav@gmail.com
Course: BCA
Marks: 85

Student added successfully.


## How to Run
Clone/Open Project
  Open the project in IntelliJ / Eclipse / VS Code.
Setup Database
  Create a database in Neon PostgreSQL
  Run the SQL table provided in the README
  Add your Neon database credentials in DBConnection.java
    jdbc:postgresql://YOUR_NEON_HOST/YOUR_DB
    username = YOUR_USERNAME
    password = YOUR_PASSWORD

Build Project
  mvn clean compile

Run Project
  mvn exec:java


#screenshots:
<img width="495" height="312" alt="2" src="https://github.com/user-attachments/assets/f75f94f0-4e9d-487a-8963-8381d7f7c759" />
<img width="861" height="591" alt="1" src="https://github.com/user-attachments/assets/d0cef429-1947-4d81-af17-983062e613c6" />
<img width="580" height="207" alt="18" src="https://github.com/user-attachments/assets/4649ce25-b07a-4c43-9134-8de0aaedfd31" />
<img width="575" height="561" alt="17" src="https://github.com/user-attachments/assets/a29917e7-5caa-421d-9780-3c4ae4690de4" />
<img width="503" height="561" alt="16" src="https://github.com/user-attachments/assets/6093cc2e-e639-4abe-84cb-d3ee5a81580b" />
<img width="588" height="560" alt="15" src="https://github.com/user-attachments/assets/35500ba9-799d-48b3-963d-2288af27b759" />
<img width="530" height="560" alt="14" src="https://github.com/user-attachments/assets/2c14b77b-fbbb-4a31-b228-aed7c32a4527" />
<img width="573" height="557" alt="13" src="https://github.com/user-attachments/assets/462bb5bd-72ed-4f3d-9047-7a4c18d00401" />
<img width="497" height="325" alt="12" src="https://github.com/user-attachments/assets/dbb9f58e-f31f-4810-9ac7-4d71ef5ce655" />
<img width="566" height="482" alt="11" src="https://github.com/user-attachments/assets/f42a3fe9-e702-4281-91c6-596b30bf4131" />
<img width="588" height="373" alt="10" src="https://github.com/user-attachments/assets/48fa89dd-d14e-4f35-bbe6-60642c8e9398" />
<img width="593" height="381" alt="9" src="https://github.com/user-attachments/assets/f0412b13-263d-4a6c-a7fa-de5228156636" />
<img width="589" height="376" alt="8" src="https://github.com/user-attachments/assets/bc8262af-7e3e-446b-a2f0-29a104092a36" />
<img width="602" height="561" alt="7" src="https://github.com/user-attachments/assets/80139697-2e0f-4574-8089-54bfd0ff6b48" />
<img width="604" height="559" alt="6" src="https://github.com/user-attachments/assets/0a0c84a5-26c6-4b83-ab23-5a754aa59542" />
<img width="601" height="561" alt="4" src="https://github.com/user-attachments/assets/ab9ee78e-5b48-454a-afdc-a7e2d41748cf" />
<img width="604" height="565" alt="3" src="https://github.com/user-attachments/assets/4c9f68e1-b5a3-410e-bd53-dfb058ee08ea" />
