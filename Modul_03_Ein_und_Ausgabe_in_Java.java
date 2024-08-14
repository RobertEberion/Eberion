package Modul_03_Ein_und_Ausgabe_in_Java;

import java.util.Scanner;

public class Modul_03_Ein_und_Ausgabe_in_Java {

	public static void main(String[] args) {
		//Die Ausgabe auf der Konsole---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		String einString = "Ich bin ein variabler String";
		int zahl = 7;
		
		System.out.println("Ich bin eine Stringkonstante");
	//	String = Klasse
		
		System.out.print(4); //print ohne Zeilenumbruch
		System.out.println(einString); //println mit Zeilenumbruch
		
		System.out.println(zahl);		//Mit Variable
		System.out.println("Ich bin irgendetwas" + " " + 4); //Verkettung
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Die Eingabe über die Konsole--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Scanner wird importiert, siehe oben java.util.Scanner
		
		Scanner sc = new Scanner(System.in);
		
		int zahl2;
		System.out.print("Bitte gib eine Zahl ein: ");
		zahl2 = sc.nextInt();
		
		System.out.println("Der Inhalt der Variable ist " + zahl2);
		
		float zahl3;
		System.out.print("Bitte gib eine Zahl ein: "); //In der Console ist die Zahl mit , einzugeben z.B. 3,5, da diese deutsch ist. Beim Coden mit . wie z.B. 3.5
		zahl3 = sc.nextFloat();
		
		System.out.println("Der Inhalt der Variable ist " + zahl3);
		
	}

}
