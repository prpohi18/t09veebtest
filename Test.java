package com.yourcompany.webtest;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import org.openqa.selenium.By;

public class Test{
	public static void main(String[] args){
		String a;
		String b;
		String c;
		System.out.println("[Test]");
		open("http://greeny.cs.tlu.ee/~kaserola/programmeerimise_pohikursus/tund9/t09veebtest/arvutusleht.html");

		a="3";
		b="4";
		c="10";
		$("#a").setValue(a);
		$("#b").setValue(b);
		$("#c").setValue(c);
		$("#button").click();
		System.out.println("Vastus on: " + $("#vastus").getText());

	}
}

/*

[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.656s
[INFO] Finished at: Mon May 28 15:15:15 EEST 2018
[INFO] Final Memory: 11M/243M
[INFO] -------------------------
*/