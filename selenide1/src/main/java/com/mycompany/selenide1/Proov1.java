
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class Proov1 {
    public static void main(String[] args){
        open("http://www.tlu.ee/~kogerj/kolmaskylg.html");
        $(By.name("str1")).setValue("5");
        $(By.name("str2")).setValue("3");
        $(By.name("str3")).setValue("45")
        $("#submit").click();
        System.out.println($("#vastus").getText());
    }
    
}
