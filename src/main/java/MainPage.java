import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage (WebDriver driver) {
        this.driver = driver;
    }

    private By friendslink = By.xpath("//span[@class='left_label inl_bl'][contains(text(),'Друзья')]");
    private By myPage = By.xpath("//span[contains(text(),'Моя Страница')]");
    private By friendsCounter = By.xpath("//div[@class='counts_module']//a[1]");

    // переход в раздел Друзья
    public void friendsClick() {
        driver.findElement(friendslink).click();
    }

    // смотрит количество друзей
    public int getNumber() {
        return Integer.parseInt(driver.findElement(friendsCounter).getText());
    }
}
