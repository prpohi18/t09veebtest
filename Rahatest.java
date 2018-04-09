package ee.tlu.janilv.veebtest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;

public class Rahatest {
    @Test
    public void RahaTest(){
        open("http://www.tlu.ee/~janilv/veeb1/konverter/konverter.html");
       
        
        $("#lkvon").setValue("50");
        $("#lkvonbtn").click();
        $("#vastus").shouldHave(text("59.41615"));
        
        $("#pkvon").setValue("1");
        $("#pkvonbtn").click();
        $("#vastus").shouldHave(text("0.841523"));
        
        
    }
}
