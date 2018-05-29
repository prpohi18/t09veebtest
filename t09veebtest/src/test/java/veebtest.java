package com.mycompany.t09veebtest;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import com.codeborne.selenide.WebDriverRunner;
import com.sun.java.swing.plaf.windows.resources.windows;
import org.openqa.selenium.By;


public class veebtest {
    public static void main(String[] args){
        open("http://greeny.cs.tlu.ee/~pikseger/nimekiri.html");
        $("#kast1").setValue("Egert");
        $("#kast2").setValue("Piksar");
        $("#nupp1").click();
        $("#nimi").shouldHave(text("Egert Piksar")); 

/*        
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time: 18.095s
Finished at: Tue Apr 17 11:26:17 EEST 2018
Final Memory: 7M/155M
------------------------------------------------------------------------
*/     
    }
}
