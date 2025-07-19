
# Factorial Calculator using Recursion (Java + Spring Boot)  
A web-based application that calculates the factorial of a number using recursion. It features a responsive frontend and a Java Spring Boot backend with proper edge-case handling.


Codveda Internship Project - Level 1 Task 3

---

## 🔧 Features / User Stories

* I can enter a number and get its factorial calculated.
* I can see proper validation messages for negative or invalid inputs.
* I can interact with a clean and modern UI.
* I get real-time response from the backend using API.

---

## 🖼️ Screenshots

1. **Factorial Calculator UI:**
   ![Factorial UI](https://github.com/Prajapatikapil41/FactorialCalculator/blob/main/images/Screenshot%20(152).png?raw=true)

2. **Valid Output Example:**
   ![Valid Output](https://github.com/Prajapatikapil41/FactorialCalculator/blob/main/images/Screenshot%20(150).png?raw=true)
   ![Valid Output](https://github.com/Prajapatikapil41/FactorialCalculator/blob/main/images/Screenshot%20(149).png?raw=true)

3. **Negative Number Handling:**
   ![Error Case](https://github.com/Prajapatikapil41/FactorialCalculator/blob/main/images/Screenshot%20(153).png?raw=true)

---

## 🖥️ System Design

> The application uses a Client-Server architecture:

* **Client Side:** HTML5, CSS3, JavaScript
* **Server Side:** Java, Spring Boot

```text
The frontend sends a request to the backend API, which calculates the factorial recursively and sends the result back.
```

---

## 🗂️ Project Structure

```
D:\
└── Codveda\
    └── level_1\
        └── Task_3\
            └── FactorialCalculator\
                ├── frontend\
                │   ├── index.html
                │   └── assets\
                │       ├── style.css
                │       └── script.js
                └── backend\
                    ├── src\
                    │   └── main\
                    │       └── java\
                    │           └── com\
                    │               └── example\
                    │                   └── factorial\
                    │                       ├── FactorialApplication.java
                    │                       └── FactorialController.java
                    ├── pom.xml
                    └── application.properties
```

---

## 🧰 Technology Stack

| Area      | Technology                                       |
| --------- | ------------------------------------------------ |
| Front-End | HTML5, CSS3, JavaScript                          |
| Back-End  | Java 21, Spring Boot 3.5.3, Maven                |
| Tool      | VS Code, Git, GitHub, Live Server (npm optional) |

---

## ▶️ Steps to Run Application

### ✅ Start Backend (Spring Boot):

```bash
cd D:\Codveda\level_1\Task_3\FactorialCalculator\backend
mvn spring-boot:run
```

> Default port: `8080`
> To change port:

```properties
# application.properties
server.port=8081
```

---

### ✅ Start Frontend (Live Server):

```bash
cd D:\Codveda\level_1\Task_3\FactorialCalculator\frontend
npm init -y                   # Only once
npm install live-server --save-dev
npx live-server
```

> Or open `index.html` directly in a browser
> Or use VS Code "Live Server" extension

---

## 🔍 How It Works

1. User enters a number in the frontend input.
2. JavaScript sends a GET request to `http://localhost:8080/api/factorial/{number}`.
3. Spring Boot backend calculates factorial using recursion.
4. Result is returned as plain text and displayed in the UI.

---

## 💡 Future Enhancements

* Add loading animation or spinner
* Add copy result button
* Add number limit handling (for large factorials)
* Show calculation steps visually
* Convert to React + Spring Boot REST API

---
## 👨‍💻 Author

|                                                                                                     Photo                                                                                                    | **Kapil Prajapati**                                                                                                                                                                                                                                                 |
| :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [<img src="https://avatars.githubusercontent.com/u/81869156?s=400&u=ff6de7017b51e4d96dbfb1ae39c7a459d5e13ea8&v=4" width="120" height="120" style="border-radius:50%;">](https://github.com/Prajapatikapil41) | - 🧑‍💻 **GitHub:** [Prajapatikapil41](https://github.com/Prajapatikapil41)<br> - 💼 **LinkedIn:** [Kapil LinkedIn](https://www.linkedin.com/in/kapil-prajapati-7ba4b51b7/)<br> - 📧 **Email:** [kapilprajapati0403@gmail.com](mailto:kapilprajapati0403@gmail.com) |

---
