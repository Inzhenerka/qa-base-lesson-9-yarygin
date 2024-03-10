import org.junit.jupiter.api.Test;

public class InzhenerkaLoginTest {
    @Test
    public void runLoginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.setUsername("admin");
        loginPage.setPassword("admin123");
        loginPage.checkLoginButtonExists();
        loginPage.login();
        loginPage.logout();
    }
}