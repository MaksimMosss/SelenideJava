package com.selenide.ui.test;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

import static com.codeborne.selenide.Selenide.*;

public class SecondTest {
    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {
        open("https://demoqa.com/buttons");
        $(By.xpath(("//button[@id='doubleClickBtn']"))).doubleClick();
        $(By.xpath(("//button[@id='rightClickBtn']"))).contextClick();
        open("https://demoqa.com/links");
        $(By.xpath(("//a[@id='simpleLink']"))).click();
        open("https://demoqa.com/links");
        $(By.xpath(("//a[@id='dynamicLink']"))).click();
        open("https://demoqa.com/links");
        $(By.xpath(("//a[@id='created']"))).click();
        $(By.xpath(("//a[@id='no-content']"))).click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
