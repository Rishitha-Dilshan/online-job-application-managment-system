# Online Job Application Platform

## Introduction

This is an online job application platform built using Spring Boot, designed to facilitate job applications, company management, and job review functionalities.

## Features

- **Company Management**: Allows users to create, update, and delete company profiles.
- **Job Listings**: Enables companies to post job openings, view applicants, and manage job listings.
- **Job Reviews**: Provides a platform for users to review and rate job experiences, associated with specific job listings.

## Quick Start

1. Clone the repository
2. Open the project in your IDE: IntelliJ IDEA (recommended) or Eclipse
3. If you are using IntelliJ IDEA, make sure the IDE opens project as Maven and recognizes the project as a Spring Boot project.
4. Configure the database connection in application.properties file.(check the Database section below for more info)
5. Run the project (by running the main method in MyjobappApplication.java)
6. Open http://localhost:8080/ in your browser!

## Database

1. Install Docker and Run Docker Desktop:
Install Docker Desktop if you haven't already.
Run Docker Desktop to ensure Docker is up and running.

2. Run Docker Compose:
In the project directory, run the following command to start the PostgreSQL database container:
docker-compose up

3. Check Docker Container Status:
Verify that the PostgreSQL container is running by executing:
docker ps

4. Access PGAdmin Tool:
Open your web browser and navigate to http://localhost:8888/.

5. Log in to PGAdmin using the provided username and password.
Connect to PostgreSQL Database:
In PGAdmin, navigate to the "Servers" section and click "Add Server".

6. Enter the following details:

  * Name: Provide a name for the server.
  * Host name/address: Use localhost.
  * Port: Use the default PostgreSQL port, 5432.

  * Username: Enter the username for the PostgreSQL database.
  * Password: Enter the password for the PostgreSQL database.

7. Click "Save" to connect to the PostgreSQL database.

  * Configure Database Connection in application.properties:
  * In your project, locate the application.properties file.
  * Update the database connection details with the information you used to connect to PostgreSQL in PGAdmin.


## Endpoints

* http://localhost:8080/jobs
* http://localhost:8080/companies
* http://localhost:8080/companies/{id}/reviews
* http://localhost:8080/companies/{id}/reviews
* http://localhost:8080/companies/{id}/reviews
* http://localhost:8080/companies/{id}/reviews/{id}
* http://localhost:8080/jobs/{id}
* http://localhost:8080/companies/{id}

