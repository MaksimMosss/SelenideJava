package com.selenide.ui.test;

import com.selenide.ui.CheckBoxPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Elements extends BaseUITest {
    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {
        String name = "Maksim";
        String email = "12@gmail.com";
        String addressCurrent = "Kiev";
        String parmentAddress = "Dnipro";
        String actualText = CheckBoxPage.open().fillForm(name, email, addressCurrent, parmentAddress).clickSumbitBatton().getResponsText();
        String expectedText = "Name:" + name + "\n" +
                "Email:" + email + "\n" +
                "Current Address :" + addressCurrent + "\n" +
                "Permananet Address :" + parmentAddress;
        Assert.assertEquals(actualText, expectedText, "Виведено не правильний текст");

    waitSeconds(5);
    }
}
