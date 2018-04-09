import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
        
public class ruumala {
    public static void main(String[] args){
        System.out.println("Uhhuu");
        open("http://greeny.cs.tlu.ee/~roopkalm/Programmeerimise%20p%C3%B5hikursus/t09veebtest/");
        $("#pserv").setValue("5");
        $("#korgus").setValue("12");
        $("#calculatebutton").click();
        System.out.println("Vastus oli "  $("#ruumala").getText()  ", oodatav vastus: 100");
        
        $("#number1").setValue("46");
        $("#number2").setValue("50");
        $("#calculatebutton").click();
        System.out.println("Vastus oli "  $("#ruumala").getText()  ", oodatav vastus: 35266.66");
        
        $("#number1").setValue("3.53");
        $("#number2").setValue("4.8");
        $("#calculatebutton").click();
        System.out.println("Vastus oli "  $("#ruumala").getText()  ", oodatav vastus: 17.42");
        
        
        
    }
    
}