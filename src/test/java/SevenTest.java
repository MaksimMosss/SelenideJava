package com.selenide.ui.test;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

import static com.codeborne.selenide.Selenide.*;
public class SevenTest {

    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {
        open("https://demoqa.com/accordian");
        $(By.xpath(("//div[@id='section1Heading']"))).click();
        $(By.xpath(("//div[@id='section2Heading']"))).click();
        $(By.xpath(("//div[@id='section3Heading']"))).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

