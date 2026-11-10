# Online Examination System

## 📌 Project Description
The Online Examination System is a web-based application developed using Java Spring Boot and MySQL. It allows students to register, log in, and access the examination page. The application manages student information and login verification through database integration.

## 🛠️ Technologies Used
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Thymeleaf
- HTML, CSS, JavaScript
- MySQL
- Maven

## ✨ Features
- Student Registration
- Student Login
- Login Credential Verification
- Examination Page Access
- MySQL Database Integration

## 📂 Project Structure
```text
Online_Examination_System/
├── src/
│   └── main/
│       ├── java/
│       │   └── Controller/
│       │   └── Entity/
│       │   └── Repository/
│       └── resources/
│           ├── templates/
│           └── application.properties
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites
- Java JDK 17 or later
- MySQL Server
- Maven
- IntelliJ IDEA / Eclipse / VS Code

**Note:** Check the Maven compiler configuration in `pom.xml`. It currently specifies Java 25 as the source and target, so either use JDK 25 or change both values to 17 to build with JDK 17.

## 🚀 How to Run the Project

### Step 1: Clone the Repository
Open your terminal and execute:

```bash
git clone https://github.com/YOUR_USERNAME/Online_Examination_System.git
```

### Step 2: Navigate to Project Folder
```bash
cd Online_Examination_System
```

### Step 3: Create MySQL Database
Open MySQL and execute:

```sql
CREATE DATABASE online_examination_system;
```

### Step 4: Configure Database
Open `src/main/resources/application.properties` and update your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/online_examination_system
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace the username and password with your MySQL credentials.

### Step 5: Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

On Windows, you can also use:

```bash
mvnw.cmd spring-boot:run
```

### Step 6: Open in Browser

```text
http://localhost:8080/index
```

## 👨‍💻 Author
**Tatimatla Venkata Krishna**

Java Full Stack Developer | MCA Student

## 📄 License
This project is developed for educational and learning purposes.
