package com.yourcompany.webtest;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class webtests {
	public static void main(String[] args){
    open("http://greeny.cs.tlu.ee/~piirsten/prpohi/kodutood/t09veebtest/build/reports/tests/Calculation.html");
    $("#n1").setValue("5");
    $("#n2").setValue("3");
    $("#button").click();
    System.out.println("Vastus oli " + $("#answer").getText() + ", oodatav vastus: 15");

    $("#n1").setValue("6");
    $("#n2").setValue("9");
    $("#button").click();
    System.out.println("Vastus oli " + $("#answer").getText() + ", oodatav vastus: 54");

    $("#n1").setValue("20");
    $("#n2").setValue("25");
    $("#button").click();
    System.out.println("Vastus oli " + $("#answer").getText() + ", oodatav vastus: 500");
	}
}