package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeForm {
    SelenideElement firstName = $("#firstName");
    SelenideElement lastName = $x("//input[@id = 'lastName']");
    SelenideElement email = $("#userEmail");
    public SelenideElement genderFemale = $x("//label[@for= 'gender-radio-2']");
    SelenideElement mobile = $("#userNumber");
    public SelenideElement stateList = $x("//div[@id='state']");
    public SelenideElement checkBoxMusic = $x("//label[@for='hobbies-checkbox-3']");
    SelenideElement currentAddress = $x("//textarea[@placeholder='Current Address']");
    public SelenideElement textStateAndCity = $x("//label[text()='State and City']");
    public SelenideElement stateHaryana = $$(".css-11unzgr").findBy(text("Haryana"));
    public SelenideElement citiesList = $x("//div[@id='city']");
    public SelenideElement cityPanipat = $$(".css-11unzgr").findBy(text("Panipat"));
    public SelenideElement submitButton = $x("//button[@id='submit']");
    public SelenideElement closeButton = $x("//button[@id='closeLargeModal']");




    public AutomationPracticeForm setFirstName(String value){
        firstName.setValue(value);
        return this;

    }

    public AutomationPracticeForm setLastName(String value){
        lastName.setValue(value);
        return this;

    }

    public AutomationPracticeForm setEmail(String value){
        email.setValue(value);
        return this;

    }

    public AutomationPracticeForm setGender(SelenideElement element){
        element.click();
        return this;
    }

    public AutomationPracticeForm setMobile(String value){
        mobile.setValue(value);
        return this;

    }

    public AutomationPracticeForm setDateOfBirthDatapicker(String month, String year, String result){
        $x("//input[@id = 'dateOfBirthInput']").click();
        $x("//select[contains(@class, 'month')]").selectOption(month);
        $x("//select[contains(@class, 'year')]").selectOption(year);
        $x("//div[text()='8']").click();
        $x("//input[@id = 'dateOfBirthInput']").shouldHave(Condition.value(result));
        return this;

    }

    public AutomationPracticeForm setSubject(String value){
        $x("//input[@id='subjectsInput']").setValue(value).sendKeys(Keys.ENTER);
        return this;

    }

    public AutomationPracticeForm uploadFile(){
        $x("//input[@type='file']").uploadFromClasspath("text.txt");
        $x("//input[@type='file']").shouldHave(Condition.value("text.txt"));
        return this;
    }

    public AutomationPracticeForm setCurrentAddress(String value){
        currentAddress.setValue(value);
        return this;
    }






    //тест-кейс
    // Открыть сайт https://demoqa.com/automation-practice-form
    // Ввести имя Альфа
    // Ввести фамилию Бетта
    // ввести email
    // выбрать пол female
    // Заполнить поле  номер телефона
    // Ввести дату   рождения
    // Ввести тему    Computer Science
    // Выбрать хобби    музыка
    // вставить картинку
    // ввести текущий    адрес Ufa, Aksakova 81
    // выбрать штат
    // выбрать город
    // Нажать submit
    // ОР: Отрывается модальное окно, проверить, что данные совпадают, нажать кнопку Close

}

