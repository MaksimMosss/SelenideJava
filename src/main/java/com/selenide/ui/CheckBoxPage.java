package com.selenide.ui;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage {
    public static CheckBoxPage open() {
        Selenide.open("/text-box");
        return new CheckBoxPage();
    }

    public CheckBoxPage fillUserName(String name) {
        $(By.xpath("//input[@id='userName']")).setValue(name);
        return this;
    }

    public CheckBoxPage fillUserEmail(String email) {
        $(By.xpath("//input[@id='userEmail']")).setValue(email);
        return this;
    }

    public CheckBoxPage fillCurrentAddress (String addressCurrent) {
        $(By.xpath("//textarea[@id='currentAddress']")).setValue(addressCurrent);
        return this;
    }

    public CheckBoxPage fillPermanetAddress (String parmentAddress) {
        $(By.xpath(("//textarea[@id='permanentAddress']"))).setValue(parmentAddress);
        return this;
    }

    public CheckBoxPage fillForm (String name, String email, String addressCurrent, String parmentAddress) {
        return fillUserName(name).fillUserEmail(email).fillCurrentAddress(addressCurrent).fillPermanetAddress(parmentAddress);
    }

    public CheckBoxPage clickSumbitBatton() {
        $(By.xpath(("//button[@id='submit']"))).click();
        return this;
    }

    public String getResponsText () {
        return $(By.xpath(("//div[@id='output']"))).getText();
    }

}



