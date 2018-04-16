import static com.codeborne.selenide.Selenide.*;

public class Kodune {

    public static void main(String[] args) {
        open("file:///Users/kertu/IdeaProjects/Kodune9/pyramid.html");
        $("#kast1").setValue("2");
        $("#kast2").setValue("3");
        $("#kast3").setValue("4");
        $("#nupp").click();
        System.out.println("Oodatav vastus 12 ja testi vastus: " + $("#vastus").getValue());
    }
}
