import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InzhenerkaLoginTest {
    @Test
    @DisplayName("Проверка логина")
    public void runLoginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.setUsername("admin");
        loginPage.setPassword("admin123");
        loginPage.checkLoginButtonExists();
        loginPage.login();
        loginPage.logout();
    }

    @Test
    @DisplayName("Проверка логина и имени пользователя")
        public void userLoginAndCheckName(){
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.setUsername("user");
        loginPage.setPassword("user123");
        loginPage.checkLoginButtonExists();
        loginPage.login();
        loginPage.checkNameHeaderExists();
        loginPage.logout();
        }

}