/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veebtestkodune;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
public class VeebTest {
   public VeebTest(){}
   @Test
   public void avamine(){
       open("http://greeny.cs.tlu.ee/~triiteet/veebtest/veebtest.html");
       $("h1").shouldHave(text("Arvutus"));
       assertEquals("+", $("#add").getAttribute("innerHTML"));
       assertEquals("-", $("#subtract").getAttribute("innerHTML"));
       assertEquals("*", $("#multiply").getAttribute("innerHTML"));
       assertEquals("/", $("#divide").getAttribute("innerHTML"));
   }
   @Test
   public void summa(){
      open("http://greeny.cs.tlu.ee/~triiteet/veebtest/veebtest.html");
      $("#num1").setValue("10");
      $("#num2").setValue("2");
      $("#add").click();
      assertEquals("12", $("#result").getAttribute("innerHTML"));
   }
   @Test
   public void vahe(){
      open("http://greeny.cs.tlu.ee/~triiteet/veebtest/veebtest.html");
      $("#num1").setValue("10");
      $("#num2").setValue("2");
      $("#subtract").click();
      assertEquals("8", $("#result").getAttribute("innerHTML"));
   }
   @Test
   public void korrutis(){
      open("http://greeny.cs.tlu.ee/~triiteet/veebtest/veebtest.html");
      $("#num1").setValue("10");
      $("#num2").setValue("2");
      $("#multiply").click();
      assertEquals("20", $("#result").getAttribute("innerHTML"));
   }
   @Test
   public void jagatis(){
      open("http://greeny.cs.tlu.ee/~triiteet/veebtest/veebtest.html");
      $("#num1").setValue("10");
      $("#num2").setValue("2");
      $("#divide").click();
      assertEquals("5", $("#result").getAttribute("innerHTML"));
   }
   @Test
   public void jagatisnull(){
      open("http://greeny.cs.tlu.ee/~triiteet/veebtest/veebtest.html");
      $("#num1").setValue("10");
      $("#num2").setValue("0");
      $("#divide").click();
      assertEquals("Infinity", $("#result").getAttribute("innerHTML"));
   }
}
/*
Results :

Tests run: 6, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
*/