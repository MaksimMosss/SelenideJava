package com.selenide.ui.test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

import static com.codeborne.selenide.Selenide.*;
public class EtingsTest {
    @Test
    public void textBoxFilwithCorrectDataAndSumbit() {
        open("https://demoqa.com/auto-complete");
        $(By.xpath(("//div[@class='auto-complete__control css-yk16xz-control']"))).click();
        $(By.xpath(("//div[@id='autoCompleteMultiple']"))).setValue("B");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
