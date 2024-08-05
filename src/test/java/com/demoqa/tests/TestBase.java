package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.AutomationPracticeForm;
import com.demoqa.pages.CheckBoxPage;
import com.demoqa.pages.PageRadio;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Selenide.open;


public class TestBase {
    CheckBoxPage checkBoxPage = new CheckBoxPage();
    PageRadio pageRadio = new PageRadio();
    TextBoxPage textBoxPage = new TextBoxPage();
    AutomationPracticeForm automationPracticeForm = new AutomationPracticeForm();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

    }

    public void openPage(String value){
        open(value);
    }

    public void click(SelenideElement element){
        element.click();
    }

    public void scrollTo(SelenideElement element){
        element.scrollTo();
    }


}
