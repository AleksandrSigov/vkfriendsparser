import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // ФИО для окончания ожидания
    private By fioPage = By.xpath("//h2[text()='Александр \"pprcut\" Сигов']");
}
