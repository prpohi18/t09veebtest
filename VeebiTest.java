package VeebiTest;

import static com.codeborne.selenide.Condition.text;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;

public class VeebiTest {
    
    public VeebiTest() {
    }
  
    @Test
    public void keskmiseLeidmine() {
        open("http://localhost:5555/~ojavgret/Programmeerimine/kodutoo9.html");
        //open("http://greeny.cs.tlu.ee/~ojavgret/Programmeerimine/kodutoo9.html");
        $("#pikkus").setValue("165");
        $("#uusPikkus").click();
        $("#pikkus").setValue("172");
        $("#uusPikkus").click();
        $("#pikkus").setValue("185");
        $("#uusPikkus").click();
        $("#sisPikkused").shouldHave(text("165"));
        $("#sisPikkused").shouldHave(text("172"));
        $("#sisPikkused").shouldHave(text("185"));
        $("#arvuta").click();
        $("#arvutus").shouldHave(text("174"));  
    }
/*Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
*/
}