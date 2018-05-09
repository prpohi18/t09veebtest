package com.mycompany.selenide1;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class AppTest {
    public static void main(String[] args){
        open("http://www.tlu.ee/~daedalus/index.html");
        $("#kast1").setValue("5");
        $("#kast2").setValue("3");
        $("#korrutamineVastus").click();
        System.out.println($("#vastus").getText());
    }
}