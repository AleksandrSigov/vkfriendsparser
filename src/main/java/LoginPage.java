import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.applet.Main;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // поле ввода телефона (логина)
    private By phoneField = By.xpath("//input[@id='index_email']");

    public MainPage typePhone(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }

    // поле ввода пароля
    private By passwordField = By.xpath("//input[@id='index_pass']");

    public MainPage typePassword (String password){
        driver.findElement(phoneField).sendKeys(password);
    }

    // кнопка Войти
    private By enterButton = By.xpath("//button[@id='index_login_button']");

    public MainPage clickEnterButton(){
        driver.findElement(enterButton).click();
        return new MainPage(driver);
    }

    // авторизация

    public MainPage signup (String phone, String password){
        this.typePhone(phone);
        this.typePassword(password);
        this.clickEnterButton();
    }
}


