package ee.tlu.elinorr;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;
public class Testing {
    @Test
    public void Testing() {
        open("http://www.tlu.ee/~elinorr/testid.html");
        $("#kulg1").setValue("10");
        $("#kulg2").setValue("10");
        $("#kulg3").setValue("10");
        $("#answbtn").click();
        System.out.println($("#answer").getText());
    }
    
}
