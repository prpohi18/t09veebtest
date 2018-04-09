import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.By;
public class Proov1 {
    public static void main(String[] args){       
        open("http://www.tlu.ee/~julimai/progepohi/Ristkylik.html");
        $("#kylg1").setValue("4");
        $("#kylg2").setValue("10");
        $("#nupp1").click();
        System.out.println($("#vastus").getText());
    }
}

