package pages;

import dto.Student;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PracticeFormPage extends BasePage{
    public PracticeFormPage(WebDriver driver){
        PageFactory.initElements(new
                AjaxElementLocatorFactory
                (driver, 10), this);
    }

    @FindBy(id = "firstName")
    WebElement inputFirstName;
    @FindBy(id = "lastName")
    WebElement inputLastName;
    @FindBy(css = "input[placeholder='name@example.com']")
    WebElement inputEmail;
    @FindBy(id = "userNumber")
    WebElement inputMobile;
    @FindBy(id = "currentAddress")
    WebElement textareaCurAdd;

    public void typePracticeForm(Student student){
        inputFirstName.sendKeys(student.getFirstName());
        inputLastName.sendKeys(student.getLastName());
        inputEmail.sendKeys(student.getEmail());
        inputMobile.sendKeys(student.getMobile());
        textareaCurAdd.sendKeys(student.getAddress());



    }

}
