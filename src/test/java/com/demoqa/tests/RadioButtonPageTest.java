package com.demoqa.tests;

import org.junit.jupiter.api.Test;

public class RadioButtonPageTest extends TestBase {

    @Test
    public void checkRadioButtonYes() {
        openPage("/radio-button");
        pageRadio.clickRadioButton(pageRadio.ButtonYes)
                .checkRadioText("Yes");

    }

    @Test
    public void checkRadioButton(){
        openPage("/radio-button");
        pageRadio.clickRadioButton(pageRadio.ButtonImpressive)
                .checkRadioText("Impressive");
    }
}
