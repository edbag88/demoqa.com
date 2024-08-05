package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.AutomationPracticeForm;
import com.demoqa.pages.CheckBoxPage;
import com.demoqa.pages.PageRadio;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.BeforeAll;


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


}
