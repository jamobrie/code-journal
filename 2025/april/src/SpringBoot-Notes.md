# Spring Boot Notes
## 🔹 Dependency Injection
- Use `@Autowired` for automatic wiring.
- Prefer constructor injection over field injection.

```java
@Service
public class MyService {
    private final MyRepository repo;

    @Autowired
    public MyService(MyRepository repo) {
        this.repo = repo;
    }
}
