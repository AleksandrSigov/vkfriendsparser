import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;

    public MainPage (WebDriver driver) {
        this.driver = driver;
    }

    private By friendslink = By.xpath("//span[@class='left_label inl_bl'][contains(text(),'Друзья')]");

    public void friendsClick() {
        driver.findElement(friendslink).click();
    }
}
