package com.demoqa.tests;

import org.junit.jupiter.api.Test;

public class RadioButtonPageTest extends TestBase {

    @Test
    public void checkRadioButtonYes() {
        pageRadio.openRadioPage()
                .clickRadioButton(pageRadio.ButtonYes)
                .checkRadioText("Yes");

    }

    @Test
    public void checkRadioButton() throws InterruptedException {
        pageRadio.openRadioPage()
                .clickRadioButton(pageRadio.ButtonImpressive)
                .checkRadioText("Impressive");

        Thread.sleep(4000);
    }
}
