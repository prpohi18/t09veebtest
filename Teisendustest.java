package ee.tlu.ttaevik.veebtest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;

public class Teisendustest {
    @Test
    public void TeisendusTest(){
        open("http://www.tlu.ee/~ttaevik/teisendus.html");
        
        $("#celsiusbtn").click();
        $("#vastus").shouldHave(text("32"));
        
        $("#kelvinbtn").click();
        $("#vastus").shouldHave(text("-273.15"));
        
        $("#celsius").setValue("10");
        $("#celsiusbtn").click();
        $("#vastus").shouldHave(text("50"));
        
        $("#kelvin").setValue("1");
        $("#kelvinbtn").click();
        $("#vastus").shouldHave(text("-272.15"));
        
        
        /*
        Results :

        Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

        */
        
    }
}