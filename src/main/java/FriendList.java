import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FriendList {

    private WebDriver driver;

    public FriendList(WebDriver driver) {
        this.driver = driver;
    }

    private By friendsName = By.xpath("//div[@class='friends_field friends_field_title']");


    public int countFriends() {
        int size = driver.findElements(friendsName).size();
        return size;
    }



}
