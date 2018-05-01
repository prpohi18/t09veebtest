package ee.tlu.kodasma.veebtest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class Veebtest {
    @Test
    public void avamine() {
        open("http://localhost:5555/~kodakevi/2018/progepohi/t09veebtest/veebtest/src/test/java/ee/tlu/kodasma/veebtest/Veebtest.html");
        $("h1").shouldHave(text("Arvutused"));
        assertEquals("+", $("#liida").getAttribute("innerHTML"));
        assertEquals("-", $("#lahuta").getAttribute("innerHTML"));
        assertEquals("*", $("#korruta").getAttribute("innerHTML"));
        assertEquals("/", $("#jaga").getAttribute("innerHTML"));
    }
    
    @Test
    public void summa() {
        open("http://localhost:5555/~kodakevi/2018/progepohi/t09veebtest/veebtest/src/test/java/ee/tlu/kodasma/veebtest/Veebtest.html");
        $("#num1").setValue("6");
        $("#num2").setValue("3");
        $("#liida").click();
        assertEquals("9", $("#result").getAttribute("innerHTML"));
    }
    
    @Test
    public void vahe() {
        open("http://localhost:5555/~kodakevi/2018/progepohi/t09veebtest/veebtest/src/test/java/ee/tlu/kodasma/veebtest/Veebtest.html");
        $("#num1").setValue("6");
        $("#num2").setValue("3");
        $("#lahuta").click();
        assertEquals("3", $("#result").getAttribute("innerHTML"));
    }
    
    @Test
    public void korrutis() {
        open("http://localhost:5555/~kodakevi/2018/progepohi/t09veebtest/veebtest/src/test/java/ee/tlu/kodasma/veebtest/Veebtest.html");
        $("#num1").setValue("6");
        $("#num2").setValue("3");
        $("#korruta").click();
        assertEquals("18", $("#result").getAttribute("innerHTML"));
    }
    
    @Test
    public void jagatis() {
        open("http://localhost:5555/~kodakevi/2018/progepohi/t09veebtest/veebtest/src/test/java/ee/tlu/kodasma/veebtest/Veebtest.html");
        $("#num1").setValue("6");
        $("#num2").setValue("3");
        $("#jaga").click();
        assertEquals("2", $("#result").getAttribute("innerHTML"));
    }
}
