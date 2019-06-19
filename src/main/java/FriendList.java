import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FriendList {

    private static WebDriver driver;

    public FriendList(WebDriver driver) {

        this.driver = driver;
    }

    private By friendsName = By.xpath("//div[@class='friends_field friends_field_title']");

    // количество друзей на странице
    public int countFriends() {
        int size = driver.findElements(friendsName).size();
        return size;
    }

    // скролл до конца страницы
    public void scrollTillEnd() {
        try {
            int lastCount = countFriends();
            while (true) {
                JavascriptExecutor js = ((JavascriptExecutor) driver);
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                Thread.sleep(5000);
                int newCount = countFriends();
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                if (newCount == lastCount) {
                    break;
                }
                lastCount = newCount;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // количество друзей в списке
    public int getFriendsNameList() {
        List<WebElement> friendsNameList = driver.findElements(friendsName);
        int friendsList = friendsNameList.size();
        return friendsList;

        //         for (WebElement nameList : friendsNameList) {
//            String friendName = nameList.getText();
//            System.out.println(friendName);
        }
}
