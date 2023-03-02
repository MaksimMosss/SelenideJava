package com.selenide.ui;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ButtonsBoxPage {
    public static ButtonsBoxPage open() {
        Selenide.open("/buttons");
        return new ButtonsBoxPage();
    }

   public ButtonsBoxPage doubleClick () {
       $(By.xpath(("//button [@id='doubleClickBtn']"))).doubleClick();
       return this;
   }
   public ButtonsBoxPage rightClick() {
       $(By.xpath("(//button [@id='rightClickBtn'])")).contextClick();
       return this;
   }

   public ButtonsBoxPage click() {
        $(By.xpath("(//button[@id='bU8x6'])")).click();
        return this;
   }
}
