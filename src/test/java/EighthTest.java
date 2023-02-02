package com.selenide.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
public class EighthTest {

    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {
        open("https://demoqa.com/auto-complete");
        $(By.xpath(("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']"))).setValue("Red, Blue");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
