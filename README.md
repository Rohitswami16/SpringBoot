# Spring Boot Development with Spring Tool Suite (STS)

Spring Tool Suite (STS) is an IDE based on Eclipse, designed specifically for **Spring Boot** development. It offers powerful features such as **Spring Boot Dashboard, Live Reload, DevTools, and Debugging tools** to enhance productivity.

## 📌 Prerequisites
- **Java Development Kit (JDK 17+)** – [Download](https://adoptium.net/)
- **Spring Tool Suite (STS 4)** – [Download](https://spring.io/tools)
- **Maven (Bundled with STS)**

---

## 🚀 Setting Up STS

### 1️⃣ **Download & Install STS**
1. Go to the official STS website: [Spring Tool Suite](https://spring.io/tools)
2. Download the latest version for **Windows/macOS/Linux**.
3. Extract the ZIP file and open **SpringToolSuite4.exe** (Windows) or the STS folder (Mac/Linux).

---

### 2️⃣ **Create a New Spring Boot Project**
#### ✅ Using STS Project Wizard:
1. Open STS and go to **File → New → Spring Starter Project**.
2. Enter project details (**Name, Group ID, Artifact ID, Java Version**).
3. Choose dependencies (**Spring Web, JPA, Thymeleaf, Lombok, etc.**).
4. Click **Finish** – STS will generate the project structure.

#### ✅ Using Spring Initializr (Recommended):
1. Open STS and go to **File → New → Spring Starter Project**.
2. Select **Use Spring Initializr**.
3. Enter project details:
   - **Group:** `com.example`
   - **Artifact:** `MySpringApp`
   - **Packaging:** `Jar`
   - **Java Version:** 17+
4. Click **Next**, select dependencies, and click **Finish**.
5. STS will download and configure the project.

---

### 3️⃣ **Run Your Spring Boot Application**
1. Open `MySpringAppApplication.java` inside `src/main/java/com/example`.
2. Click on **Run → Run As → Spring Boot App**.
3. Alternatively, right-click the file and select **Run As → Spring Boot App**.
4. You should see an output similar to:
   ```sh
   Tomcat started on port 8080
   Started MySpringAppApplication in X seconds
   ```
5. Open a browser and visit `http://localhost:8080/`.

---

### 4️⃣ **Using STS Features**
✅ **Spring Boot Dashboard** – Manage running Spring Boot apps easily.  
✅ **Live Reload** – Auto-refresh browser on code changes.  
✅ **Spring Boot DevTools** – Faster development with auto-restart.  
✅ **Spring Boot Actuator** – Monitor application health.

---

### 5️⃣ **Debugging in STS**
1. Set breakpoints in your code.
2. Right-click the project → **Debug As → Spring Boot App**.
3. Use the **Debug Perspective** in STS for step-by-step execution.

---

### 6️⃣ **Build & Package Your Application**
To generate a JAR file:
```sh
mvn clean package
```
Find the JAR in the `target/` folder and run it:
```sh
java -jar target/MySpringApp-0.0.1-SNAPSHOT.jar
```

---

## 🛠️ **Troubleshooting**
- **STS not detecting Java?** Ensure JDK is installed and configured in `Preferences → Java → Installed JREs`.
- **Port 8080 already in use?** Change it in `application.properties`:
  ```properties
  server.port=8081
  ```

---

## 📜 **License**
This project is open-source and available under the [MIT License](LICENSE).

---

## ⭐ **Show Your Support**
If you found this helpful, please **star ⭐ the repository**!

Happy Coding! 🚀

