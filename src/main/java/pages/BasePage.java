package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {
    static WebDriver driver;

    public void setDriver(WebDriver wd) {
        driver = wd;
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void scrollActions() {
        Actions actions = new Actions(driver);
        for (int i = 0; i < 10; i++) {
            actions.scrollByAmount(0, 500).perform();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean isTextElementPresent
            (WebElement element, String text) {
        return element.getText().contains(text);
    }
}
