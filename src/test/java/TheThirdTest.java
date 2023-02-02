package com.selenide.ui.test;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

import static com.codeborne.selenide.Selenide.*;

public class TheThirdTest {
    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {
    open("https://demoqa.com/links");
    $(By.xpath(("//a[@id='simpleLink']"))).click();
    open("https://demoqa.com/links");
    $(By.xpath(("//a[@id='dynamicLink']"))).click();
    closeWindow();
    open("https://demoqa.com/links");
    $(By.xpath(("//a[@id='created']"))).click();
    $(By.xpath(("//a[@id='no-content']"))).click();
    $(By.xpath(("//a[@id='moved']"))).click();
    $(By.xpath(("//a[@id='bad-request']"))).click();
    $(By.xpath(("//a[@id='unauthorized']"))).click();
    $(By.xpath(("//a[@id='forbidden']"))).click();
    $(By.xpath(("//a[@id='invalid-url']"))).click();

        try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
