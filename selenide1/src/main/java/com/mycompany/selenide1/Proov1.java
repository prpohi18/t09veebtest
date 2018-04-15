package com.mycompany.selenide1;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
public class Proov1 {
    public static void main(String[] args){
        open("http://www.tlu.ee/~rasmuskk/kolmnurk.html");
        $("#a").setValue("2");
        $("#b").setValue("3");
        $("#submit").click();
        System.out.println($("#ans").getText());
        
        $("#a").setValue("3");
        $("#b").setValue("2");
        $("#submit").click();
        System.out.println($("#ans").getText());
    }
}