package ee.tlu.rihon.selenide1;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
        
public class Proov1 {
    public static void main(String[] args){
        System.out.println("Uhhuu");
        open("http://greeny.cs.tlu.ee/~noorriho/programmeerimise%20p%C3%B5hikursus/t09veebtest/");
        $("#number1").setValue("5");
        $("#number2").setValue("5");
        $("#calculatebutton").click();
        System.out.println("Vastus oli " + $("#answer").getText() + ", oodatav vastus: 25");
        
        $("#number1").setValue("0");
        $("#number2").setValue("50");
        $("#calculatebutton").click();
        System.out.println("Vastus oli " + $("#answer").getText() + ", oodatav vastus: 0");
        
        $("#number1").setValue("10");
        $("#number2").setValue("20");
        $("#calculatebutton").click();
        System.out.println("Vastus oli " + $("#answer").getText() + ", oodatav vastus: 200");
        
        
        
    }
    
}
 