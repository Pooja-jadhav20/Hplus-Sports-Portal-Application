# Hplus_Sports_Portal_Application
| Internationalization | ResourceBundleMessageSource |
| UI Theming           | Spring Theme Resolver     |

## 📁 Project Structure

SpringMvcProject/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.example.controller/
│ │ │ └── com.example.model/
│ │ │ └── com.example.service/
│ │ ├── resources/
│ │ │ ├── messages.properties
│ │ │ ├── messages_hi.properties
│ │ └── webapp/
│ │ └── WEB-INF/
│ │ └── views/
│ │ └── *.jsp
├── pom.xml

bash

## 🔧 Setup Instructions

1. *Clone the repository*
   ```bash
   git clone https://github.com/your-username/spring-mvc-project.git
   cd spring-mvc-project
Import in IDE (Eclipse / IntelliJ)

Open as a Maven project.

Build the project to download dependencies.

Run the application

Deploy to Apache Tomcat (or use embedded Tomcat if configured).

Visit http://localhost:8080/spring-mvc-project/

Switch languages

Application supports multiple languages.

Change language through URL parameter or locale resolver.

Theme support

Change theme dynamically using ?theme=dark or ?theme=light.

📌 Key Learning Outcomes
Mastered Spring MVC architecture and flow

Built web forms with validation

Handled exceptions gracefully with centralized configuration

Implemented multilingual support

Used interceptors and themes for improved UX

Created simple REST APIs with Spring MVC
