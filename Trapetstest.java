import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class trapetstest {
   public static void main(String[] args){
        open("http://greeny.cs.tlu.ee/~lahtsten/Programmeerimine/kodut%c3%b6%c3%b6d/t09veebtest/src/main/java/pranglimine/trapets.html");
        $("#alus1").setValue("10");
        $("#alus2").setValue("5");
	$("#kõrgus").setValue("3");
	$("#pindalabtn").click();
        $("#vastus").shouldHave(text("22.5"));
        
    }
} 