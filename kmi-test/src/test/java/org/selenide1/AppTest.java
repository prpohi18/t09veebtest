import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class AppTest {
    public static void main(String[] args){
		open("http://www.tlu.ee/~niinsimo/prpohi/tund9/kodune/kmindeks.html");
		$("#height").setValue("170");
		$("#weight").setValue("60");
		$("#submit").click();
		$("#output").shouldHave(text("21")); 
		$("#comment").shouldHave(text("normaalkaalus"));
      
		$("#height").setValue("160");
		$("#weight").setValue("100");
		$("#submit").click();
		$("#output").shouldHave(text("39")); 
		$("#comment").shouldHave(text("rasvunud"));
    }
}