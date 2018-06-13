package com.mycompany.mavenproject1;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import com.codeborne.selenide.WebDriverRunner;
import com.sun.java.swing.plaf.windows.resources.windows;
import org.openqa.selenium.By;


public class WebTest {
    public static void main(String[] args){
        open("https://mrsalong.ee/kool/kt9/index.html");
        $("#arv").setValue("5");
        $("#lisaArv").click();
        $("#arv").setValue("5");
        $("#lisaArv").click();
        $("#arv").setValue("5");
        $("#lisaArv").click();
        $("#arvutaKeskmine").click();
        $("#showKeskmine").shouldHave(text("5"));
        
        ------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time: 19.280s
Finished at: Wed Apr 18 23:15:22 EEST 2018
Final Memory: 7M/155M
------------------------------------------------------------------------


    }
}
