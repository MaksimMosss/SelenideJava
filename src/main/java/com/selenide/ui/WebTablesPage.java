package com.selenide.ui;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage {
    public static WebTablesPage open() {
        Selenide.open("/webtables");
        return new WebTablesPage();
    }
    public WebTablesPage click() {
        $(By.xpath("(//button[@id='addNewRecordButton'])")).click();
        return this;
    }

    public WebTablesPage registration() {
        $(By.xpath(("//input [@id='firstName']"))).click();
        return this;
    }

    public WebTablesPage firstName(String name) {
        $(By.xpath(("//input [@id='firstName']"))).setValue("Dima");
        return this;
    }

    public WebTablesPage lastName(String name) {
        $(By.xpath("(//input[@id='lastName'])")).setValue("Frolov");
        return this;
    }

    public WebTablesPage email(String email) {
        $(By.xpath("(//input [@id='userEmail'])")).setValue("123@gmail.com");
        return this;
    }

    public WebTablesPage age(String age) {
    $(By.xpath("(//input [@id='age'])")).setValue("23");
    return this;
    }

    public WebTablesPage salary(String salary) {
        $(By.xpath("(//input [@id='salary'])")).setValue("10000");
        return this;
    }

    public WebTablesPage department(String department) {
        $(By.xpath("(//input [@id='department'])")).setValue("QA engineer");
        return this;
    }

    public WebTablesPage clickSumbitBatton() {
        $(By.xpath("(//button[@id='submit'])")).click();
        return this;
    }

    public WebTablesPage search() {
        $(By.xpath("(//input [@id='searchBox'])")).setValue("Alden");
        return this;
    }

    public WebTablesPage deleteUser() {
        $(By.xpath("(//span [@id='delete-record-2'])")).click();
        return this;
    }
}
