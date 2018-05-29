package com.example.demo;

import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RakendusTest {
    @Test
    public void CalculatorTest(){
        open("http://localhost:8080/index.html");

        $("#box").setValue("5");
        $("#square").click();
        $("#answer").shouldHave(text("25"));

        $("#box1").setValue("5");
        $("#box2").setValue("3");
        $("#multiply").click();
        $("#vastus1").shouldHave(text("15"));


    }

}