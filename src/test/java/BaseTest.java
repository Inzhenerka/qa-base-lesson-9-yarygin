import com.codeborne.selenide.Configuration;

public class BaseTest {
    static {
        Configuration.browser = "firefox";
    }
}