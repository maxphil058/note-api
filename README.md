# 📝 Note API - Spring Boot Project

This is a simple RESTful API built with **Spring Boot** that lets you 
create, read, update, and delete (CRUD) notes. It's a perfect beginner 
project to practice Java backend development and REST API design.

---

## 🚀 Features

- Create a note
- Get all notes
- Get a note by ID
- Update a note
- Delete a note
- H2 in-memory database (no setup needed)
- CORS enabled for frontend testing (e.g., React)

---

## ⚙️ Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 📂 Project Structure

noteapi/
├── src/main/java
│ ├── controller/
│ ├── service/
│ ├── model/
│ └── repository/
├── src/main/resources
│ └── application.properties
├── .gitignore
├── README.md
└── pom.xml


---

## 🧪 API Endpoints

| Method | Endpoint           | Description         |
|--------|--------------------|---------------------|
| GET    | `/noteapi/v1`      | Get all notes       |
| GET    | `/noteapi/v1/{id}` | Get note by ID      |
| POST   | `/noteapi/v1`      | Create a new note   |
| PUT    | `/noteapi/v1/{id}` | Update a note       |
| DELETE | `/noteapi/v1/{id}` | Delete a note       |

---

## 🛠️ How to Run the App Locally

### Prerequisites:
- Java installed
- Maven installed
- Internet (to download dependencies)

### Steps:

1. Clone the repo:
   ```bash
   git clone https://github.com/yourusername/noteapi.git
