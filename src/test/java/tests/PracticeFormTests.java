package tests;

import dto.Student;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTests extends AppManager {
    @Test
    public void practiceFormPositiveTest() {
        Student student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john678@gmail.com")
                .gender("male")
                .mobile("0123456789")
                .dateOfBirth("22 April 1987").subjects("Math,Chemistry,English")
                .hobbies("sport")
                .picture("")
                .address("Street 1")
                .state("NCR")
                .city("City")
                .build();
//        HomePage homePage= new HomePage(getDriver());
//        homePage.clickBtnForms();
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForms();
        PracticeFormPage practiceFormPage =
                new PracticeFormPage(getDriver());
        practiceFormPage.typePracticeForm(student);


    }
}
