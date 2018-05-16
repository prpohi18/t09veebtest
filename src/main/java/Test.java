import static com.codeborne.selenide.Selenide.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Test{
	public static void main(String[] args){
		open("http://www.greeny.cs.tlu.ee/~rootkris/kasulik/kodutoo09.html");
		System.out.println("Täisnurkse kolmnurga pindala arvutamise test");
		$("#kaatet").setValue("5");
		$("#k6rgus").setValue("6");
		$("#button").click();
		String vastus=$("#vastus").getValue();
		
		boolean vastusanswer = false;
		
		System.out.println("Andmed");
		System.out.println("kaatet = 5");
		System.out.println("k6rgus = 6");
		
		if(vastus.equals(15)){
			vastusanswer = true;
			System.out.println("Eeldatav tulemus: 15");
			System.out.println("Saadud tulemus: "+vastus);
			System.out.println("Õige tulemus!");
		}else{
			System.out.println("Eeldatav tulemus: 15");
			System.out.println("Saadud tulemus: "+vastus);
			System.out.println("Vale tulemus");
		}
	String fail = "src/main/java/raport.txt";
	try{
		PrintWriter pw=new PrintWriter(new FileWriter(fail));
		
		pw.println("Kolmnurga pindala arvutamise test");
		pw.println("Andmed");
		pw.println("kaatet = 5");
		pw.println("k6rgus = 6");
		if(vastusanswer == true){
			pw.println("Eeldatav tulemus: 15");
			pw.println("Saadud tulemus: "+vastus);
			pw.println("Õige tulemus");
		}
		if(vastusanswer == false){
			pw.println("Eeldatav tulemus: 15");
			pw.println("Saadud tulemus: "+vastus);
			pw.println("Vale tulemus");
		}
		pw.close();
		} catch(Exception ex){
			ex.printStackTrace();
		}	
	}
}