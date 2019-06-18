import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://vk.com");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typePhone("");
        loginPage.typePassword("");
        loginPage.clickButton();

        MainPage mainPage = new MainPage(driver);
        mainPage.friendsClick();

        FriendList friendList = new FriendList(driver);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");




        }

        System.out.println(friendList.countFriends());


    }
}
