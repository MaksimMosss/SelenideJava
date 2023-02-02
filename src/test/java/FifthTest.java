package com.selenide.ui.test;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

import static com.codeborne.selenide.Selenide.*;
public class FifthTest {

    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {

        open("https://demoqa.com/alerts");
        $(By.xpath(("//button [@id='alertButton']"))).click();
        $(By.xpath(("//button [@id='timerAlertButton']"))).click();
        $(By.xpath(("//button[@id='confirmButton']"))).click();
        $(By.xpath(("//button [@id='promtButton']"))).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }

