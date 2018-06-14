import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class AppTest {
    public static void main(String[] args){
		open("http://www.tlu.ee/~aljarand/prog/t09veebtest/kdr.html");
		$("#kills").setValue("14");
		$("#deaths").setValue("2");
		$("#submit").click();
		$("#output").shouldHave(text("7.5")); 
		$("#comment").shouldHave(text("Oled hea laskur!"));
      
		$("#kills").setValue("2");
		$("#deaths").setValue("10");
		$("#submit").click();
		$("#output").shouldHave(text("0.2")); 
		$("#comment").shouldHave(text("Pead veel harjutama!"));
    }
}