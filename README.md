# University Management System (UMS)

The **University Management System** is a desktop-based Java application developed to manage university operations effectively. It provides features to handle student, teacher, and exam details, along with marks, fee structures, and other administrative tasks.

---

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [File Structure](#file-structure)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

---

## Project Overview

This project is designed to simplify the management of universities by automating administrative tasks. The application is built using **Java Swing** for the user interface and **JDBC** for database interactions.

---

## Features

- **Student Management**:
  - Add, update, and delete student details.
  - View detailed student information.

- **Teacher Management**:
  - Add, update, and delete teacher details.
  - View detailed teacher information.

- **Examination Details**:
  - Manage exam schedules and results.

- **Marks Management**:
  - Enter and display student marks.

- **Fee Structure**:
  - Manage and view student fee details.

- **Authentication**:
  - Login system to restrict unauthorized access.

- **Other Features**:
  - Splash screen for initial loading.
  - Navigation menus for smooth interaction.

---

## Technologies Used

- **Java**: Core language for developing the application.
- **Java Swing**: For creating the user interface.
- **JDBC (Java Database Connectivity)**: For connecting to and interacting with the database.
- **MySQL**: As the database for storing data.

---

## File Structure

| **File Name**           | **Description**                              |
|--------------------------|----------------------------------------------|
| `main_class.java`        | Entry point of the application.              |
| `Login.java`             | Manages the user login functionality.        |
| `Splash.java`            | Displays the splash screen during startup.   |
| `AddStudent.java`        | Handles adding student details.              |
| `UpdateStudent.java`     | Manages updating student details.            |
| `StudentDetails.java`    | Displays student details.                    |
| `AddFaculty.java`        | Handles adding teacher details.              |
| `UpdateTeacher.java`     | Manages updating teacher details.            |
| `TeacherDetails.java`    | Displays teacher details.                    |
| `EnterMarks.java`        | Facilitates entering student marks.          |
| `Marks.java`             | Displays student marks.                      |
| `ExaminationDetails.java`| Manages examination details.                 |
| `feeStructure.java`      | Handles student fee management.              |
| `About.java`             | Displays information about the application.  |
| `Conn.java`              | Contains database connection logic.          |
| `JFrame.java`            | Base class for all UI components.            |

---

## Setup and Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/UniversityManagementSystem.git
   cd UniversityManagementSystem
