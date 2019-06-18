import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By phoneField = By.xpath("//input[@id='index_email']");
    private By passwordField = By.xpath("//input[@id='index_pass']");
    private By enterButton = By.xpath("//button[@id='index_login_button']");

    // ввод телефона
    public void typePhone (String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    // ввод пароля
    public void typePassword (String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // клик по кнопке
    public void clickButton() {
        driver.findElement(enterButton).click();
    }
}


