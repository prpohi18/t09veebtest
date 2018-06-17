package kaur.veebitest;



import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;


public class selenideTest {
    @Test
    public void liitmine(){
        open("http://iot.knowbase.ee/veebitest.html");
        $("#nr1").setValue("2");
        $("#nr2").setValue("3");
        $("#nr3").setValue("4");
        $("#ansbtn").click();
        System.out.println($("#vastus").getText());
    }
}
