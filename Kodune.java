import static com.codeborne.selenide.Selenide.*;

public class Kodune {
    public static void main(String[] args) {
        open("file:///Users/kertu/TLÜ/II/Programmeerimise_põhikursus/homework/t09/kiirus.html");
        $("#kast1").setValue("28");
        $("#kast2").setValue("7");
        $("#nupp").click();
        System.out.println("Oodatav vastus 4 ja testi vastus: " + $("#vastus").getValue());
    }
}
