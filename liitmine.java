import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;

public class liitmineTest {
    @Test
    public void liitmineTest(){
        open("http://www.tlu.ee/~kurmo14/korrutamine.html");
        $("#nr1").setValue("6");
        $("#nr2").setValue("3");
        $("#ansbtn").click();
        System.out.println($("#vastus").getText());
    }
}
