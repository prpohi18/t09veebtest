package com.yourcompany.webtest;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
        
public class Vastus {
    public static void Vastus(String[] args){
        open("http://greeny.cs.tlu.ee/~seppcasp/programmeerimise_pohikursus/kodutood/t09veebtest/index.html");
        
		$("#esimene").setValue("2");
        $("#teine").setValue("2");
        $("#calculatebutton").click();
        System.out.println("Vastus oli " + $("#vastus").getText() + ", oodatav vastus: 4");
        
        $("#esimene").setValue("10");
        $("#teine").setValue("10");
        $("#calculatebutton").click();
        System.out.println("Vastus oli " + $("#vastus").getText() + ", oodatav vastus: 100");
        
        $("#esimene").setValue("5.5");
        $("#teine").setValue("2");
        $("#calculatebutton").click();
        System.out.println("Vastus oli " + $("#vastus").getText() + ", oodatav vastus: 11");
        
        
        
    }
    
} 