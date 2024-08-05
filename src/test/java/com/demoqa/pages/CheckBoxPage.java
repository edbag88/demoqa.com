package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPage {
    public SelenideElement homeButton = $x("//span[text()='Home']/ancestor::span[@class='rct-text']//button");
    public SelenideElement documentsButton = $x("//span[text()='Documents']/ancestor::span/button");
    public SelenideElement officeButton = $x("//span[text()='Office']/ancestor::span/button");
    public SelenideElement publicCheckBox = $x("//span[text()='Public']/ancestor::label[@for='tree-node-public']/span[@class='rct-checkbox']");

    public CheckBoxPage openCheckBoxPage(String value) {
        open(value);
        return this;
    }

    public CheckBoxPage clickCheckBox(SelenideElement button) {
        button.click();
        return this;
    }

}
