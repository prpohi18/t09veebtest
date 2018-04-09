/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kodutestid;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

/**
 *
 * @author if17
 */
public class Veebitestid {
    public static void main(String[] args){
      //https://kivimare-t06veeb1.herokuapp.com/arvutusleht.html
      /*System.out.println("Kuku!!");
      open("http://www.tlu.ee/");
      $(By.name("search-string")).setValue("dti");
      $("#search-submit").click();
      //Püüdke leida otsingu esimene vaste ning kuvage see Java aknasse
      System.out.println($("ol.results").getText());
      open("http://greeny.cs.tlu.ee/~jaagup/2018/prpohi/naited/esmaspaev/09veebtest/html/arvutus1.html");
      $("#kast1").setValue("4");
      $("#kast2").setValue("6");
      $("#nupp1").click();
      System.out.println($("#vastus").getText());*/
      
      open("https://kivimare-t06veeb1.herokuapp.com/arvutusleht.html");
      $("#arv1").setValue("8");
      $("#arv2").setValue("100");
      $("#calculate").click();
      $("#vastus").shouldHave(text("126.66666666666666")); 
      
      $("#arv1").setValue("-5");
      $("#arv2").setValue("-40");
      $("#calculate").click();
      $("#vastus").shouldHave(text("0.0"));
    }
}
