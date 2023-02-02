package com.selenide.ui.test;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

import static com.codeborne.selenide.Selenide.*;

public class NineTest {
    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {
        open("https://demoqa.com/date-picker");
        $(By.xpath(("//input[@id='datePickerMonthYearInput']"))).click();
        $(By.xpath(("//select[@class='react-datepicker__month-select']"))).click();
        $(By.xpath((("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")))).doubleClick();
        $(By.xpath(("//select[@class='react-datepicker__year-select']"))).click();
        $(By.xpath(("//option[@value='2020']"))).click();
        $(By.xpath(("//select[@class='react-datepicker__year-select']"))).click();
        $(By.xpath(("//div[@class='react-datepicker__day react-datepicker__day--027']"))).click();
        $(By.xpath(("//input[@id='dateAndTimePickerInput']"))).click();
        $(By.xpath(("//input[@id='dateAndTimePickerInput']"))).click();
        $(By.xpath(("//span[@class='react-datepicker__month-read-view--down-arrow']"))).click();
        $(By.xpath(("//div[@class='react-datepicker__month-option']"))).click();
        $(By.xpath(("//span[@class='react-datepicker__year-read-view--down-arrow']"))).click();
        $(By.xpath(("//div[@class='react-datepicker__year-option']"))).click();
        SelenideElement click = $(By.xpath(("//div[@class='react-datepicker__year-option']")));


        try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
