package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class PageRadio {
    public SelenideElement ButtonYes = $(By.cssSelector("label[for='yesRadio']"));
    public SelenideElement ButtonImpressive = $x("//label[@for='impressiveRadio']");
    public SelenideElement checkRadioText = $x("//p[text()='You have selected ']//span");


    public PageRadio openRadioPage() {
        open("https://demoqa.com/radio-button");
        return this;
    }

    public PageRadio clickRadioButton(SelenideElement button) {
        //if (!isRadSelected) {
        button.click();
        // }
        return this;
    }

    public PageRadio checkRadioText(String value) {
        checkRadioText.shouldHave(text(value));
        System.out.println(value);
        return this;
    }
}


