package ee.erikenden.t09veebtest;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class InterestCalcTest {
    @Test
    public void testInterestCalc(){
        open("http://localhost:8080/index.html");
        $(By.id("title")).shouldHave(text("Intressikalkulaator"));
        $(By.id("base")).setValue("1000");
        $(By.id("duration")).setValue("12");
        $(By.id("percent")).setValue("0.05");
        $(By.id("submit")).click();
        $(By.id("result")).shouldHave(text("1600.0"));
    }

}