package com.demoqa.tests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormTests extends TestBase {

    @DisplayName("Проверка формы Practice Form")
    @Test
    void setPracticeForm(){
        String firstName = "Alfa";
        String lastName = "Betta";
        String email = "test@mail.ru";
        String mobile = "79174515353";
        String subject = "Computer Science";
        String currentAddress = "Lenina str 10, 3";


        openPage("/automation-practice-form");
        automationPracticeForm.setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setDateOfBirthDatapicker("July", "1988", "08 Jul 1988")
                .setGender(automationPracticeForm.genderFemale)
                .setMobile(mobile)
                .setSubject(subject);
                click(automationPracticeForm.checkBoxMusic);
                automationPracticeForm.uploadFile()
                .setCurrentAddress(currentAddress);
                scrollTo(automationPracticeForm.textStateAndCity);
                click(automationPracticeForm.stateList); // Клик по элементу, открывающему список
                click(automationPracticeForm.stateHaryana);  // Клик по нужному значению
                $x("//div[@id='state']").shouldHave(text("Haryana"));
                click(automationPracticeForm.citiesList);
                click(automationPracticeForm.cityPanipat);
                click(automationPracticeForm.submitButton);
        $(".table-responsive").shouldHave(text("Alfa Betta"), text("test@mail.ru"), text("Computer Science"));
        scrollTo(automationPracticeForm.closeButton);
        click(automationPracticeForm.closeButton);
        $x("//div[text()='Thanks for submitting the form']").shouldNotBe(visible);
    }
}
