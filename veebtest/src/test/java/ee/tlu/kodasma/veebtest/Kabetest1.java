package ee.tlu.kodasma.veebtest;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Kabetest1 {
    @Test
    public void avamine() {
        open("http://greeny.cs.tlu.ee/~kodakevi/2018/progepohi/kabe1.html");
        $("h1").shouldHave(text("Kabe"));
        assertEquals("tume", $("#tabel1").$$("tr").get(0).$$("td").get(1).getAttribute("class"));
        assertEquals("", $("#tabel1").$$("tr").get(0).$$("td").get(0).getAttribute("class"));
        $("#tabel1").$$("tr").get(7).$$("td").get(0).shouldHave(text("v"));
        $("#tabel1").$$("tr").get(0).$$("td").get(1).shouldHave(text("m"));
        assertEquals("k01", $("#tabel1").$$("tr").get(0).$$("td").get(1).getAttribute("id"));
    }
    @Test
    public void liikumine() {
        open("http://greeny.cs.tlu.ee/~kodakevi/2018/progepohi/kabe1.html");
        $("#tabel1").$$("tr").get(5).$$("td").get(0).shouldHave(text("v"));
        $("#tabel1").$$("tr").get(4).$$("td").get(1).shouldHave(text(""));
        $("#k50").click();
        $("#k41").click();
        $("#k50").shouldHave(text(""));
        $("#k41").shouldHave(text("v"));
        $("#k52").click();
        $("#k34").click();
        $("#teated").shouldHave(text("Lubamatu käik!"));
        $("#k52").shouldHave(text("v"));
        $("#k34").shouldHave(text(""));
    }
}
