package com.mycompany.project1;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
public class Proov1 {
    public static void main(String[] args){
        /*open("http://www.tlu.ee/");
        $(By.name("search-string")).setValue("dti");
        $("#search-submit").click();
        
        System.out.println($("ol.results").getText());*/
        open("http://www.tlu.ee/~timj/yl.html");
        $("#box1").setValue("3");
        $("#box2").setValue("4");
        $("#submitButton").click();
        System.out.println($("#vastus").getText());
    }
}
