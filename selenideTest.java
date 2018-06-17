package kaur.veebitest;



import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;


public class selenideTest {
    @Test
    public void korrutamineTest(){
        open("http://iot.knowbase.ee/veebitest.html");
        $("#nr1").setValue("12");
        $("#nr2").setValue("13");
        $("#ansbtn").click();
        System.out.println($("#vastus").getText());
    }
}
