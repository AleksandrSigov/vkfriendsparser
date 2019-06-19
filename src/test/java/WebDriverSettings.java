import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        LoginPage loginPage;
        MainPage mainPage;
        FriendList friendList;
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}