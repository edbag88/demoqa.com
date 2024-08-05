package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AutomationPracticeForm {
    SelenideElement firstName = $("#firstName");
    SelenideElement lastName = $x("//input[@id = 'lastName']");
    SelenideElement email = $("#userEmail");
    SelenideElement gender= $x("//label[@for= 'gender-radio-2']");
    SelenideElement mobile = $("#userNumber");
    SelenideElement dateOfBirth = $x("//input[@id = 'dateOfBirthInput']");
    SelenideElement subjects = $x("//input[@id = 'subjectsInput']"); //label[contains(text(), 'Subjects')];
    SelenideElement hobbies;
    SelenideElement currentAddress;
    SelenideElement selectState;

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
    // ОР: Отрывается модальное окно, данные совпадают, нажать кнопку Close

}

