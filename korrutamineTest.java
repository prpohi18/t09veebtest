package Testid;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;

public class korrutamineTest {
    @Test
    public void korrutamineTest(){
        open("http://www.tlu.ee/~daisyp/korrutamine.html");
        $("#nr1").setValue("10");
        $("#nr2").setValue("10");
        $("#ansbtn").click();
        System.out.println($("#vastus").getText());
    }
}
