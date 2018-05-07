package com.mycompany.webtest;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class SeleTest {
    
    @Test
    public void esimene() {
        System.setProperty("selenide.browser", "chrome");
        open("https://springbooti-bodyfat.herokuapp.com/bodyfat.html");
        $(By.id("kast1")).setValue("90");
        $(By.id("kast2")).setValue("188");
        $(By.id("kast3")).setValue("21");
        $("#kast4").selectOption("Mees"); 
        $(By.name("arv")).click();
        $("#vastus").shouldBe(visible);
    }   
}
