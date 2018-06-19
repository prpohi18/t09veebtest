package com.mycompany.t09veebtest;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import com.codeborne.selenide.WebDriverRunner;
import com.sun.java.swing.plaf.windows.resources.windows;
import org.openqa.selenium.By;


public class veebtest {
    public static void main(String[] args){
        open("http://greeny.cs.tlu.ee/~kaugsilv/proge/kodut%c3%b6%c3%b6d/t09veebtest/nimekiri.html");
        $("#mark").setValue("Adui");
        $("#mudel").setValue("a4");
        $("#btn").click();
        $("#auto").shouldHave(text("Audi a4"));    
    }
}