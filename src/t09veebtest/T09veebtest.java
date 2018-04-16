package t09veebtest;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class T09veebtest {
    public static void main(String[] args) {
       String väärtus1;
       String väärtus2;
       System.out.println("Katse algus");
       open("http://greeny.cs.tlu.ee/~heinmark/progepohikursus/repod/t09veebtest/");
       
       väärtus1 = "65";
       väärtus2 = "181";
       $("#kast3").setValue(väärtus1);
       $("#kast4").setValue(väärtus2);
       $("#annaKmi").click();
       System.out.println("Kmi tulemus sisestustega: " + väärtus1 + ", " väärtus2 " on " + $("#kmitulemus").getText() + " ja " + $("#selgitus").getText() ".");
       
       System.out.println("Katse lõpp");
    }
}