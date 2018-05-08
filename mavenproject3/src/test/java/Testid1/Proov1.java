package Testid1;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class Proov1 {
    
    public Proov1(){
        
    }
    
    @Test
    public void pindalaLeidmine1(){
        open("http://www.tlu.ee/~valerivv/Risttahukas.html");
        $("#a").setValue("2");
        $("#b").setValue("3");
        $("#c").setValue("4");
        $("#submit").click();
        $("#vastus").shouldHave(text("52"));
    }
    
    @Test
    public void pindalaLeidmine2(){
        open("http://www.tlu.ee/~valerivv/Risttahukas.html");
        $("#a").setValue("1");
        $("#b").setValue("6");
        $("#c").setValue("4");
        $("#submit").click();
        $("#vastus").shouldHave(text("68"));
    }
}
