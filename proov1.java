import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class proov1 {
    public static void main (String[] args) {
        String inserteNumber;
        System.out.println("[Test start]");
        open("http://greeny.cs.tlu.ee/~somemart/progepohi/kodu/t09veebtest/");
        
        inserteNumber = "123";
        $("#numberbox").setValue(inserteNumber);
        $("#calculatebutton").click();
        System.out.println(">>Response for " + inserteNumber + " was " + $("#answer").getText() + ", expected 7B");
        
        inserteNumber = "420";
        $("#numberbox").setValue(inserteNumber);
        $("#calculatebutton").click();
        System.out.println(">>Response for " + inserteNumber + " was " + $("#answer").getText() + ", expected 1A4");
        
        inserteNumber = "1337";
        $("#numberbox").setValue(inserteNumber);
        $("#calculatebutton").click();
        System.out.println(">>Response for " + inserteNumber + " was " + $("#answer").getText() + ", expected 539");
        
        System.out.println("[Test end]");
    }
}