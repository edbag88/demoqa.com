package com.demoqa.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.visible;

public class CheckBoxPageTest extends TestBase {
    @Disabled
    @Test
    void CheckForCheckBoxes() {
        openPage("/checkbox");
        checkBoxPage.clickCheckBox(checkBoxPage.homeButton)
                .clickCheckBox(checkBoxPage.documentsButton)
                .clickCheckBox(checkBoxPage.officeButton)
                .clickCheckBox(checkBoxPage.publicCheckBox)
                .publicCheckBox.shouldBe(visible);
    }
}
