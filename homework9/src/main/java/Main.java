import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
public class Main {
    @Test
    public void ConverteTest(){
        open("http://localhost:8888/main.html");

        $("#ruble-convert-button").click();

        $("#euro-convert-button").click();

        $("#ruble").setValue("1000");
        $("#ruble-convert-button").click();
        $("#result").shouldHave(text("10"));

        $("#euro").setValue("1000");
        $("#euro-convert-button").click();
        $("#result2").shouldHave(text("73820.00"));


    }
}
