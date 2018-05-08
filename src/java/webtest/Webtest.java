package webtest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;


class Webtest {
    public static void main(String[] args) {
        open("http://localhost:63342/t09veebtest1/webtest/web.html?_ijt=o41tcvkmimhj29m8vuau09ol6m");
        $("#n1").setValue("9");
        $("#n2").setValue("1");
        $("#button").click();
        System.out.println("Vastus oli " + $("#answer").getText() + ", oodatav vastus: 9");

        $("#n1").setValue("5");
        $("#n2").setValue("5");
        $("#button").click();
        System.out.println("Vastus oli " + $("#answer").getText() + ", oodatav vastus: 25");

        $("#n1").setValue("100");
        $("#n2").setValue("5");
        $("#button").click();
        System.out.println("Vastus oli " + $("#answer").getText() + ", oodatav vastus: 500");
    }
}