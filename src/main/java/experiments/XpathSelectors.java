package experiments;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelectors
{
    WebDriver driver = new ChromeDriver();
    @Test
    public void xpathSelectorsTest()
    {
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        pause(3000);

        WebElement btnForms = driver.findElement(By.
                xpath("//div[@class='category-cards']/a[2]"));
        btnForms.click();
        pause(3000);
        //hideAd();

        WebElement btnElements = driver.findElement(By.
                xpath("//span[@class='group-header']"));
        btnElements.click();
        pause(3000);

        WebElement btnTextBox = driver.findElement(By.
                xpath("//a[@href='/text-box']"));
        btnTextBox.click();
        pause(3000);

        WebElement inputFullName = driver.findElement(By.
                xpath("//form/div/div[2]/input"));
        inputFullName.sendKeys("Monkey");
        pause(3000);

        WebElement inputEmail = driver.findElement(By.
                xpath("//form/div[2]//input"));
        inputEmail.sendKeys("monkey123@fghjdh.kl");
        pause(3000);

        WebElement textareaCurrAdd = driver.findElement(By.
                xpath("//*[text()='Current Address']/../..//textarea"));
        textareaCurrAdd.sendKeys("Monkey street 1");
        pause(3000);

        WebElement textareaPerAdd = driver.findElement(By.
                xpath("//*[@id='permanentAddress-wrapper']//textarea"));
        textareaPerAdd.sendKeys("Monkey avenue 5");
        pause(3000);
        hideFooter();

        WebElement btnSubmit = driver.findElement(By.
                xpath("//button[text()='Submit']"));
        btnSubmit.click();

        WebElement output = driver.findElement(By.
                xpath("//*[@id='output']"));
        System.out.println(output.getText());
        pause(3000);
        driver.quit();

    }

    public void pause(int time)
    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void hideFooter()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");

    }
}
