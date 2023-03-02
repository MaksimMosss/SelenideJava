package com.selenide.ui.test;

import com.selenide.ui.CheckBoxPage;
import com.selenide.ui.ButtonsBoxPage;
import com.selenide.ui.LinksPage;
import com.selenide.ui.WebTablesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

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

    }
    @Test
    public void buttonsBoxAndCLick() throws InterruptedException {
        ButtonsBoxPage.open().doubleClick().rightClick().click();
        Thread.sleep(Long.parseLong("2000"));
        }

    @Test
    public void webTablesPage() throws InterruptedException {
        WebTablesPage.open().click().registration().firstName("Dima").lastName("Frolov").email("123@gmail.com").age("23").salary("10000").department("QA engineer").clickSumbitBatton().search().click();
        Thread.sleep(Long.parseLong("2000"));
    }

    @Test
    public void LinksPage() throws InterruptedException {
        LinksPage.open().Home().Home1().Created().noContent().moved().badRequest();
        Thread.sleep(Long.parseLong("2000"));
    }
}
