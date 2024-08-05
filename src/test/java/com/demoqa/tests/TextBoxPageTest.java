package com.demoqa.tests;

import org.junit.jupiter.api.Test;


public class TextBoxPageTest extends TestBase {

    @Test
    public void fillFormTest() {
        openPage("/text-box");
        textBoxPage.setFullname("Robert")
                .setEmail("test@mail.ru")
                .setCurrentAddress("Ufa, Lenina street, 10")
                .scrollTo("//label[@id='permanentAddress-label']");
                textBoxPage.setPermanentAddress("Ufa, Aksakova street, 81")
                .clickSubmitButton()
                .checkResultFormTextBox("Robert", "test@mail.ru",
                        "Ufa, Lenina street, 10", "Ufa, Aksakova street, 81");

    }
}
