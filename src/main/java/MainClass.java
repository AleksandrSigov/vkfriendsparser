import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {

        // инициализация драйвера
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // переход на vk.com
        driver.get("http://vk.com");

        // авторизация vk
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typePhone("+");
        loginPage.typePassword("+!");
        loginPage.clickButton();

        // переход в раздел Друзья
        MainPage mainPage = new MainPage(driver);
        mainPage.friendsClick();

        // скролл до конца страницы
        FriendList friendList = new FriendList(driver);
        friendList.scrollTillEnd();

        // вывод списка в консоль
        friendList.getFriendsNameList();

        // закрытие браузера
        driver.close();
    }
}
