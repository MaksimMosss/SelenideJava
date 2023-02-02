package com.selenide.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class TenTest {
    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {
        open("https://demoqa.com/progress-bar");
        $(By.xpath(("//button[@id='startStopButton']"))).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
