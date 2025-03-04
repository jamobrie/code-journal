# Spring Boot Notes
## 🔹 Dependency Injection
- Use `@Autowired` for automatic wiring.
- Prefer constructor injection over field injection.
4. **Push to GitHub**:

```java
@Service
public class MyService {
    private final MyRepository repo;

    @Autowired
    public MyService(MyRepository repo) {
        this.repo = repo;
    }
}



- IntelliJ **renders Markdown** for easier reading.
- Add **code snippets**, **checklists**, and **diagrams** (`Mermaid` format is supported).

---

## **📌 Step 5: Use IntelliJ Scratches for Quick Notes**
1. **Go to** `File > New Scratch File`.
2. Select **Java/Python/SQL** (whichever language you need).
3. Write down temporary ideas without creating a project.
4. When the scratch file is useful, **move it to your Markdown notes**.

---

## **📌 Step 6: Commit & Push to GitHub**
1. In **IntelliJ**, open the **Git panel** (bottom-left).
2. **Stage your changes**:
   - `git add .`
3. **Commit with a message**:

4. **Push to GitHub**:
