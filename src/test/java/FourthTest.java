package com.selenide.ui.test;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

import static com.codeborne.selenide.Selenide.*;

public class FourthTest {
    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {
        open("https://demoqa.com/automation-practice-form");
        $(By.xpath("//input [@id='firstName']")).setValue("Maksim");
        $(By.xpath(("//input[@id='lastName']"))).setValue("Mosiichuk");
        $(By.xpath(("//input [@id='userEmail']"))).setValue("m.mosss@gmail.com");
        $(By.xpath(("//input [@id='userNumber']"))).setValue("0966422661");
        $(By.xpath(("//input [@id='dateOfBirthInput']"))).click();
        $(By.xpath(("//select[@class='react-datepicker__year-select']"))).click();
        $(By.xpath(("//option[@value='2001']"))).click();
        $(By.xpath(("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']"))).doubleClick();
        $(By.xpath(("//div[@class='react-datepicker__day react-datepicker__day--009']"))).click();
        $(By.xpath(("//input [@id='uploadPicture']"))).doubleClick();
        $(By.xpath(("//textarea[@id='currentAddress']"))).setValue("Kiev.Ukraine");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
