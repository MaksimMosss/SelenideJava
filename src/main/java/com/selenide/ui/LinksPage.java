package com.selenide.ui;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LinksPage {
    public static LinksPage open() {
        Selenide.open("/links");
        return new LinksPage();
    }

    public LinksPage Home() {
        $(By.xpath("(//a[@id='simpleLink'])")).click();
        return this;
    }

    public LinksPage Home1() {
        $(By.xpath("(//a[@id='dynamicLink'])")).click();
        return this;
    }

    public LinksPage Created() {
        $(By.xpath("(//a[@id='created'])")).click();
        return this;
    }
    public LinksPage noContent() {
        $(By.xpath("(//a[@id='no-content'])")).click();
        return this;
    }
    public LinksPage moved() {
        $(By.xpath("(//a[@id='moved'])")).click();
        return this;
    }
    public LinksPage badRequest() {
        $(By.xpath("(//a[@id='bad-request'])")).click();
        return this;
    }
}
