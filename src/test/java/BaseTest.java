import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Selenide;

public class BaseTest {
    @BeforeAll
    public static void setUp() {
        Configuration.browser = "firefox";
    }
}