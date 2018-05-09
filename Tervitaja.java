
package com.mycompany.veebtest;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;
import java.io.PrintStream;
import java.util.Iterator;
import org.openqa.selenium.By;

public class Tervitaja {
    public static void main(String[] arg) throws Exception{
        
     
        open("http://greeny.cs.tlu.ee:40301/arvutamine.html");
        $("#kast1").setValue("10");
        $("#kast2").setValue("5");
        $("#korrutus").click();
        System.out.println($("#vastus").getAttribute("innerText"));
        $("#kast3").setValue("10");
        $("#kast4").setValue("5");
        $("#jagatis").click();
        System.out.println($("#vastus").getAttribute("innerText"));
        
   
        Thread.sleep(5000);
    }
}
