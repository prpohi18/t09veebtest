import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Proov1 {
    public static void main (String[] args){
        String a;
        String b;
        String c;
        System.out.println("[Test]");
        open("file:///C:/Users/Veli-LAPTOP/Desktop/index.html");
        
        a = "1";
        b = "-8";
        c = "15";
        $("#a").setValue(a);
        $("#b").setValue(b);
        $("#c").setValue(c);
        $("#btn1").click();
        System.out.println("!!!Vastus on  " + $("#vastus").getText() + ", õige vastus on 5 ja 3");
        
        a = "5";
        b = "9";
        c = "4";
        $("#a").setValue(a);
        $("#b").setValue(b);
        $("#c").setValue(c);
        $("#btn1").click();
        System.out.println("!!!Vastus on  " + $("#vastus").getText() + ", õige vastus on -20 ja -25");
    }
}
