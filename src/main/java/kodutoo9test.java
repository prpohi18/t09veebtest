import static com.codeborne.selenide.Selenide.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class kodutoo9test {
    public static void main(String[] args){
        open("http://www.tlu.ee/~kerttamm/prpohi/tund9/kodutood/kodutoo9.html");
        System.out.println("\nKorrapärase silindri ruumala kalkulaatori TEST\n");
        //r, h values insertion
        $("#raadius").setValue("3");
        $("#korgus").setValue("4");
        $("#nupp1").click();
        String vastus1=$("#vastus1").getValue();

        boolean vastus1answer = false;
        boolean vastus2answer = false;
        
        System.out.println("Lähteandmed:");
        System.out.println("r = 3");
        System.out.println("h = 4");
        //vastus1 value test
        if(vastus1.equals("113.09733552923255")){
            vastus1answer = true;
            System.out.println("Oodatav tulemus: 113.09733552923255");
            System.out.println("Saadud tulemus: "+vastus1);
            System.out.println("Tulemus ÕIGE\n");
        }else{
            System.out.println("Oodatav tulemus: 113.09733552923255");
            System.out.println("Saadud tulemus: "+vastus1);
            System.out.println("Tulemus VALE\n");
        }   
        //a value insertion
        System.out.println("Korrapärase tetraeedri ruumala kalkulaatori TEST\n");
        $("#kylg").setValue("5");
        $("#nupp2").click();
        String vastus2=$("#vastus2").getValue();
        
        System.out.println("Lähteandmed:");
        System.out.println("a = 5");
        //vastus2 value test
        if(vastus2.equals("14.731391274719742")){
            vastus2answer = true;
            System.out.println("Oodatav tulemus: 14.731391274719742");
            System.out.println("Saadud tulemus: "+vastus2);
            System.out.println("Tulemus ÕIGE\n");
        }else{
            System.out.println("Oodatav tulemus: 14.731391274719742");
            System.out.println("Saadud tulemus: "+vastus2);
            System.out.println("Tulemus VALE\n");
        }   
        
            Date date = new Date();
    System.out.println("Test käivitati: "+date);
    
    String fail = "src/main/java/testiraport.txt";
    
    try{
        PrintWriter pw=new PrintWriter(new FileWriter(fail));
	pw.println("Test käivitati: "+date+"\n");
        
        pw.println("Korrapärase silindri ruumala kalkulaatori TEST\n");
        //test 1 print booleans check
        pw.println("Lähteandmed:");
        pw.println("r = 3");
        pw.println("h = 4\n");
        if(vastus1answer == true){
            pw.println("Oodatav tulemus: 113.09733552923255");
            pw.println("Saadud tulemus: "+vastus1);
            pw.println("Tulemus ÕIGE\n");
        }
        if(vastus1answer == false){
            pw.println("Oodatav tulemus: 113.09733552923255");
            pw.println("Saadud tulemus: "+vastus1);
            pw.println("Tulemus VALE\n");
        }
        
        pw.println("Korrapärase tetraeedri ruumala kalkulaatori TEST\n"); 
        //test 2 print booleans check        
        pw.println("Lähteandmed:");
        pw.println("a = 5\n");
        if(vastus2answer == true){ 
            pw.println("Oodatav tulemus: 14.731391274719742");
            pw.println("Saadud tulemus: "+vastus2);
            pw.println("Tulemus ÕIGE\n");
        }
        if(vastus2answer == false){
            pw.println("Oodatav tulemus: 14.731391274719742");
            pw.println("Saadud tulemus: "+vastus2);
            pw.println("Tulemus VALE\n");
        }
        pw.close();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }   
}