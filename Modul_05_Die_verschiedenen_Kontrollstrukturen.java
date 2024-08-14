package Modul_05_Die_verschiedenen_Kontrollstrukturen;

import java.util.Scanner;

public class Modul_05_Die_verschiedenen_Kontrollstrukturen 
{

	public static void main(String[] args) 
	{
		//Einführung: Kontrollstrukturen	-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		/*	-	Verzweigungen und Schleifen
		 * 	-	Werkzeug zum Treffen von Entscheidungen
		 * 
		 * 	Verzweigung:	-	if Verzweigung
		 * 					-	if mit else Verzweigung
		 * 					-	Switch-Case Anweisung
		 * 
		 * 	Schleifen:		-	While Schleife (kopfgesteuerte Schleife)
		 * 					-	do-While Schleife (fußgesteuerte Schleife)
		 * 					-	for Schleife
		 */
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Die if-Verzweigung	-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		int zahl = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine Ganzzahl ein: ");
		zahl = sc.nextInt();
		
		if(zahl < 30) 	//Im runden Klammerpaar ist die Bedingung der if-Verzweigung, diese setzt sich immer aus Vergleichsoperatoren und logische Operatoren zusammen.
						//Am Ende muss immer ein Wahrheitswert rauskommen.
		{
			System.out.println("Die eingegebene Zahl ist kleiner als 30");
		}	
		//Wenn die Bedingung als Ergebnis TRUE ist, wird die Anweisung in der geschweiften Klammer ausgeführt
		//Wenn die Bedingung als Ergebnis FALSE ist, wird die geschweifte Klammer mit der Anweisung ignoriert
		
		if(zahl < 30) 	
			System.out.println("Die eingegebene Zahl ist kleiner als 30");
		//Eine if-Verzweigung mit nur einer einzigen Anweisung, ist auch ohne die geschweiften Klammerpaare möglich, ist aber nicht empfohlen!
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Die if mit else Verzweigung	-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		if(zahl < 30)	//erste Bedingung
		{
			System.out.println("Die eingegebene Zahl ist kleiner als 30");
		}
		
		else if(zahl > 30)	//zweite Bedingung, das Ergebnis der Bedingung muss hier auch TRUE sein 
		{
			System.out.println("Die eingebene Zahl ist kleiner als Zahl 30");
		}
		
		else	//Wenn die oberen Bedingungen False ergeben, wird dieses Ergebnis ausgeführt. Das Ergebnis dieser Bedingung ist FALSE
		{
			System.out.println("Die eingebene Zahl ist gleich die Zahl 30");
		}
		
		//Bevor man mit einer Verzweigung anfängt, sollte man überlegen wieviele Bedingungen man haben will.

		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Einschub: Der Bedingungsoperator als Ersatz für die if mit else Verzweigung	-----------------------------------------------------------------------------------------------------------------------------
		
		
		int a = 10;
		int b = 5;
		int max;
		
		/*
		if(a> b) {
			max = a;
		}
		else {
			max = b;
		}
		*/
		
		//Bedingungsoperator ?
		//Es ist der einzige ternäre Operator = 3 Operanten
		max = (a > b) ? a : b;
		
		//Ist die Aussage True ergibt es a, ergibt es false ist es b
		
		System.out.println(max);
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Die Switch-Case Anweisung	---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		int auswahl = 0;
		System.out.println("Bitte geben Sie die Zahl 1, 2 oder 3 ein: ");
		
		auswahl = sc.nextInt();
		
		switch(auswahl)	{ //der wert nach case muss den gleichen Wert haben wie auswahl, ansonsten wird default am Ende durchgeführt.
			case 1: System.out.println("Die Zahl 1 wurde eingegeben..."); break; //break muss da stehen sonst würde (case 2) auch durchgeführt werden.
			case 2: System.out.println("Die Zahl 2 wurde eingegeben..."); break;
			case 3: System.out.println("Die Zahl 3 wurde eingegeben..."); break;
			default: System.out.println("Die eingegebene Zahl ist nicht 1, 2 oder 3");
		}
		
		//Andere Varianten von Switch-Case Anweisungen
		//geschweifte Klammerpaaren machen dann Sinn wenn mehrere Zeilen Code in einem Case enthalten sind
		
		switch(auswahl)	{ 
		
		case 1: case 2: {
			System.out.println("Die Zahl 1 wurde eingegeben..."); break; 
			}
		
		case 3: {
			System.out.println("Die Zahl 3 wurde eingegeben..."); break;
			}
		default: {
			System.out.println("Die eingegebene Zahl ist nicht 1, 2 oder 3");
			}
		}
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Die While Schleife (kopfgesteuerte Schleife)	-------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		int x = 0;
		
		while(x < 5) //Schleifenkopf besteht aus While und eine rundes Klammerpaar mit einer Bedingung. Die Bedingung muss ein Wahrheitswert haben.
		{
			System.out.println("Das ist eine Test Ausgabe "+ x); //In der geschweiften Klammer ist die Ausführung
			x++; //Die Variable x wird um 1 erhöht.
		}
		//In diesem Fall wird die Bedingung (2 < 10) überprüft, ob diese TRUE ist. Ist dies der Fall wird die Ausführung durchgeführt.
		//Die Ausführung wird solange wiederholt bis die Bedingung FALSE ergibt.
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Die do-While Schleife	(fußgesteuerte Schleife)-------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		int y = 0;
		
		do	
		{
			System.out.println("Das ist schon wieder eine Ausgabe " + y);
			y++;
		}
		while(y < 5); //do-While-Schleife gehört am Ende nach while(y > 5) ein Semicolon ;
		
		//Hier wird erst am Ende die Bedingung überprüft
		//Bevor eine Bedingung geprüft wird, wird zuerst do und das geschweifte Klammerpaar ausgeführt.
		//Danach wird die Bedingung überprüft, wenn die Bedingung TRUE ist wird die Schleife ab do wiederholt 
		//Die Ausführung wird so oft wiederholt bis die Bedingung FALSE ergibt.
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Die for Schleife	-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//Wird oft verwendet wenn man ein Zähler benötigt.
		
		for(int i = 0; i <= 10; i++ ) //Schleifenkopf
		{
			System.out.println("Durchlauf Nr: " + i);
		}
		
		for(int i = 0; i <= 10; i = i + 3 ) //Schleifenkopf
		{
			System.out.println("Durchlauf-Nr: " + i);
		}
		
		/*Schleifenkopf:	Dieser fängt mit for an und wird in 3 Bereiche durch ein Semikolon (;) getrennt.
		 					Im erster Bereich wird eine Zählvariable initialisiert, hier mit int i = 0
							Im zweiten Bereich ist die Schleifenbedingung, die auch hier ein Wahrheitswert ergeben muss, hier mit i <= 10
							Im dritten Bereich ist ein Inkrement oder Dekrement enthalten, in diesem Fall ein Post-Inkrement, hier mit i++
							Da i++ so ist wie i = i + 1, kann man dies auch so im Schleifenkopf schreiben, oder z.B. i = i + 3
		
		Ablauf der for Schleife		
		 			1. => Erster Bereich, die Initialisierung, wird nur einmal ausgeführt 								1. => int i = 0 
					2. => Zweiter Bereich, die Bedingung, mit TRUE gehts weiter, mit FALSE erfolgt ein Abbruch			2. => i <= 10 
					3. => Die Ausführung, der Inhalt im geschweiften Klammerpaar 										3. => System.out.println("durchlauf Nr: " + i);
					4. => Dritter Bereich, Inkrement oder Dekrement														4. => i++
					2. => Zweiter Bereich																				2. => i <= 10 
					3. => Die Ausführung																				3. => System.out.println("durchlauf Nr: " + i);
					4. => Dritter Bereich																				4. => i++
					usw. bis in diesen Fall i <= 10 FALSE ergibt
		*/
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Einschub: Sichtbarkeit von Variablen	---------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//		Block = ein geschweiftes Klammerpaar
		
		for(int i = 0; i <= 10; i++ ) //Schleifenkopf
		{
			System.out.println("Durchlauf Nr: " + i);
		}
		
		//i = 10; 
		//Die Initialisierung einer Variable ist nur im eigenen Block sichtbar und wird danach zerstört, deswegen wird hier i außerhalb des for-Blocks als Fehler gemeldet
		
		{
			int i = 15;
		}
		//i = 46;
		//Hier nochmal als Beispiel mit nur einem Block { int i = 15; }, i von i = 46 ist hier wieder nicht initialisiert
		
		{
			int i = 15;
			{
				i = 46;
			}
		}
		//Ist eine Variable aber noch tiefer verschachteln, also die nicht initialisierte Variable i = 46, wird die Initialisierung sichtbar.
		//Der Grund ist, weil der Block mit i = 46, im Block mit der Initialisiserung int i = 15; verschachtelt ist.
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	}

}
