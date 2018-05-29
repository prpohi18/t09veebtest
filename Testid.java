import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Testid {
    
    @Test
    public void Testid() {
         open("http://localhost:5555/~jakoliis/prpohi/kodutood/t09veebtest/test.html");
         $("#a").setValue("2");
         $("#b").setValue("2");
         $("#nupp1").click();
         System.out.println($("#vastus").getText());
     }    
}