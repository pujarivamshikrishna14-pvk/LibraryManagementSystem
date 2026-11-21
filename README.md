# 📚 Library Management System

A web-based Library Management System developed using **Java, Spring Boot, Maven, and Thymeleaf**, with automated build integration using **Jenkins** and containerization using **Docker and Docker Compose**.

## 🚀 Project Overview

The Library Management System provides a web-based platform for managing library book information. It demonstrates Spring Boot application development, Maven build automation, Jenkins CI/CD integration, and Docker containerization.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java 17 | Backend development |
| Spring Boot 3.5.6 | Application framework |
| Maven | Build management |
| Spring Web | Web application |
| Thymeleaf | Frontend templates |
| HTML & CSS | User interface |
| Jenkins | CI/CD automation |
| Docker | Application containerization |
| Docker Compose | Container management and deployment |
| Git & GitHub | Version control |

## ✨ Key Features

- Library book management
- Book title and author information
- Book category management
- Spring Boot web application
- Maven build automation
- Jenkins CI/CD pipeline
- Docker image creation
- Docker container execution
- Docker Compose deployment

## 📂 Project Structure

```text
LibraryManagementSystem/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/library/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       └── service/
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       └── static/
│   │           └── css/
│   │
│   └── test/
│
├── Dockerfile
├── docker-compose.yml
├── Jenkinsfile
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites

Install the following software:

- JDK 17
- Apache Maven
- Docker Desktop
- Jenkins
- Git
- Visual Studio Code (optional)

## 💻 Run Locally

**Step 1: Clone the repository**

```bash
git clone https://github.com/pujarivamshikrishna14-pvk/LibraryManagementSystem.git
```

**Step 2: Navigate to the project**

```bash
cd LibraryManagementSystem
```

**Step 3: Build the project**

```bash
mvn clean package
```

**Step 4: Run the application**

```bash
mvn spring-boot:run
```

**Step 5: Access the application**

http://localhost:8081

## 🐳 Docker Implementation

This project supports Docker containerization.

**Step 1: Build Maven JAR**

```bash
mvn clean package
```

**Step 2: Build Docker Image**

```bash
docker build -t library-management-system:1.0 .
```

**Step 3: Run Docker Container**

```bash
docker run -d --name library-management-container -p 8082:8080 library-management-system:1.0
```

**Step 4: Verify Docker Container**

```bash
docker ps
```

**Step 5: Access the Docker Application**

http://localhost:8082

## 🐳 Docker Compose Deployment

Docker Compose is used to manage and deploy the Library Management System container.

**Step 1: Start Docker Desktop**

Make sure Docker Desktop is running.

**Step 2: Navigate to the project directory**

```bash
cd LibraryManagementSystem
```

**Step 3: Start the application using Docker Compose**

```bash
docker compose up -d
```

**Step 4: Verify container status**

```bash
docker compose ps
```

**Step 5: Access the application**

http://localhost:8082

**Step 6: View application logs**

```bash
docker compose logs
```

**Step 7: Stop the application**

```bash
docker compose down
```

## 🔄 Jenkins CI/CD Integration

Jenkins is used to automate the project build and testing process.

Pipeline workflow:

1. GitHub Repository Checkout
2. Maven Compile
3. Run JUnit Tests
4. Maven Package
5. Build Verification

Jenkins Dashboard:

http://localhost:8080

## 🌐 Application URLs

| Service | URL |
|---|---|
| Jenkins | http://localhost:8080 |
| Local Spring Boot Application | http://localhost:8081 |
| Docker Compose Application | http://localhost:8082 |

## 📦 Docker Image Details

```text
Image Name: library-management-system
Tag: 1.0
Container Name: library-management-container
Container Port: 8080
Host Port: 8082
```

## 🔗 GitHub Repository

[Library Management System - GitHub](https://github.com/pujarivamshikrishna14-pvk/LibraryManagementSystem)

## 👨‍💻 Author

Developed as a Java Full Stack and DevOps academic project.

## 📄 License

This project is developed for educational and academic purposes.
