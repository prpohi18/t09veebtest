import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;

public class ruumalatest {
   public ruumalatest(){}

   @Test
   public void ruumala(){
       open("file:///C:/Users/ketuo/t09veebtest/kodunet%C3%B6%C3%B69.html");
       $("h1").shouldHave(text("risttahuka ruumala"));
       
        $("#submit").click();
        $("#vastus").shouldHave(text("48"));
      
      
   }
    
}