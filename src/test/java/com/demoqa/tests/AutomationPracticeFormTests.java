package com.demoqa.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormTests extends TestBase {

    @DisplayName("Проверка формы Practice Form")
    @Test
    void setPracticeForm() throws InterruptedException {
        String firstName = "Alfa";
        String lastName = "Betta";

        String date = "2023-12-21";
        open("/automation-practice-form");
        $("#firstName").setValue(firstName);
        $x("//input[@id = 'lastName']").setValue(lastName);
        $("#userEmail").setValue("test@mail.ru");
        $x("//label[@for= 'gender-radio-2']").click();
        $("#userNumber").setValue("7917345298");
        $x("//input[@id = 'dateOfBirthInput']").click();
        $x("//select[contains(@class, 'month')]").selectOption("July");
        $x("//select[contains(@class, 'year')]").selectOption("1988");
        $x("//div[text()='8']").click();
        $x("//input[@id = 'dateOfBirthInput']").shouldHave(Condition.value("08 Jul 1988"));
        $x("//input[@id='subjectsInput']").setValue("Computer Science").sendKeys(Keys.ENTER);
        $x("//label[@for='hobbies-checkbox-3']").click();
        $x("//input[@type='file']").uploadFromClasspath("text.txt");
        $x("//input[@type='file']").shouldHave(Condition.value("text.txt"));
        $x("//textarea[@placeholder='Current Address']").setValue("jsdhfjshdjfhsdkdshfjkdhfsk");
        $x("//label[text()='State and City']").scrollTo();
        $x("//div[@id='state']").click();  // Клик по элементу, открывающему список
        $$(".css-11unzgr").findBy(text("Haryana")).click();  // Клик по нужному значению
        $x("//div[@id='state']").shouldHave(text("Haryana"));
        $x("//div[@id='city']").click();
        $$(".css-11unzgr").findBy(text("Panipat")).click();
        $x("//button[@id='submit']").click();
        $(".table-responsive").shouldHave(text("Alfa Betta"), text("test@mail.ru"), text("Computer Science"));
        $x("//button[@id='closeLargeModal']").scrollTo();
        $x("//button[@id='closeLargeModal']").click();
        $x("//div[text()='Thanks for submitting the form']").shouldNotBe(visible);
        Thread.sleep(4000);
    }
}
