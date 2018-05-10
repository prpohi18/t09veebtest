package Testid;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class ChromeTest {
    
   protected WebDriver driver;
   
   @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
    }
    
   @Test
   public void test(){
       System.setProperty("webdriver.chrome.driver", "C:\\Program files\\chromedriver.exe");
       System.setProperty("selenide.browser", "Chrome");
       open("file:///C:/Users/user/Desktop/ruut.html");
       $("#kuvaVastus").click();
       $("#vastus").shouldHave(text("Väli on tühi"));
       $("#kast").setValue("5").pressEnter();
       $("#vastus").shouldHave(text("25"));
   } 
   }

/*

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.181 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0


*/