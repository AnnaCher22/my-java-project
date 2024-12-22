import org.example.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testGreet() {
        App app = new App();
        Assertions.assertEquals("Hello, John!", app.greet("John"));
    }
}