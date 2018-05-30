package com.mycompany.mavenproject2;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
public class Proov1 {
    public static void main(String[] args){
        /*open("http://www.tlu.ee/");
        $(By.name("search-string")).setValue("dti");
        $("#search-submit").click();
        
        System.out.println($("ol.results").getText());*/
        open("http://greeny.cs.tlu.ee/~sulgdenn/2018/Programmeerimise%20p%C3%B5hikursus/repod/t09veebtest/arvutus.html");
        $("#box1").setValue("3");
        $("#box2").setValue("4");
        $("#box3").setValue("5");
        $("#submitButton").click();
        System.out.println($("#diskriminant").getText());
    }
}