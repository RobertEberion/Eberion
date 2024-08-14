package Modul_06_Methoden;

import java.util.Scanner;

public class Modul_06_Methoden {

	public static void main(String[] args) {
		
	//Einführung: Methoden	--------------------------------------------------------------------------------------------------------------------------------------------------------- 
	//in anderen Programmiersprachen auch Funktionen genannt
		
		
		/*	Prinzip einer Methode
			Wurde erzeugt um Codes besser zu strukturieren, indem Funktionen des Programms einzeln ausgelagert werden
			Ein großes komplexes Problem wir in viele kleine Teilprobleme zerlegt
			Für ein Teilproblem gibt es dann unterschiedliche Methoden als Lösung, somit muss nicht alles auf einmal gelöst werden als komplexe Methode
		 */
	
		/*	Vorteile der Methoden:	- bessere Strukturierung des Programs
	 								- führen bereits geschriebenen Code mit nur einem Befehl erneut aus, z.B. System.out.println();
		 */
		
		
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Der Aufbau einer Methode (1)	-------------------------------------------------------------------------------------------------------------------------------------------------
	
		
		//Die Main-Methode gibt den Programmabauf vor (public static void main(String[] args)
		
		addierer();
		//Mit dieser Anweisung addierer(); rufen wir die addierer-Methode in der Main-Methode auf
		//Bezeichner der Methode und dahinter ein rundes Klammerpaar
		//Im runden Klammerpaar kommen die Übergabeparameter rein, hier wird dies aber nicht benötigt
		
		/*void: bedeutet übersetzt Leer.
		 		in diesem Typ wird nichts gespeichert, deswegen wird hier kein Übergabeparameter und kein Rückgabewert verwendet
		*/
		
		
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Variante 2: Ohne Rückgabewert, mit Übergabeparameter	-------------------------------------------------------------------------------------------------------------------------
		
		
		int zahl1 = 0;
		int zahl2 = 0;
		int ergebnis = 0;
		
		addierer2(zahl1, zahl2, ergebnis);//Im runden Klammerpaar sind die Übergabeparameter und die Reihenfolge der Variablen beachten.
		
		
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Variante 3: Mit Rückgabewert, mit Übergabeparameter	-------------------------------------------------------------------------------------------------------------------------
		
		int zahla = 0;
		int zahlb = 0;
		int ergebnisc = 0;
		
		//Hier wird aus der Methode direkt ein Rückgabewert angefordert aus zahla und zahlb, diesen beschreiben wir hier als ergebnisc
		ergebnisc = addierer3(zahla, zahlb);
		
		System.out.println("2.Das Ergebnis ist: " + ergebnisc);
		
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	}
	
	//Der Aufbau einer Methode (2) und ein Inhalt als Beispiel	---------------------------------------------------------------------------------------------------------------------
	
	//addierer-Methode, ist außerhalb der Main-Methode
	public static void addierer()
	{
		int zahl1;
		int zahl2;
		int ergebnis;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Das ist ein Programm zum addieren von zwei Ganzzahlen: ");
		
		System.out.println("Bitte geben Sie die erste Ganzzahl ein: ");
		zahl1 = sc.nextInt();
		System.out.println("Bitte geben Sie die zweite Ganzzahl ein: ");
		zahl2 = sc.nextInt();
		
		ergebnis = zahl1 + zahl2;
		
		System.out.println("Das Ergebnis ist: " + ergebnis);
	}
	
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Variante 2: Ohne Rückgabewert, mit Übergabeparameter (2) und ein Inhalt als Beispiel	-----------------------------------------------------------------------------------------
	
	//Hier werden Übergabeparameter benötigt
	public static void addierer2(int numbera, int numberb, int resultc)
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.println("2.Das ist ein Programm zum addieren von zwei Ganzzahlen: ");
		
		System.out.println("2.Bitte geben Sie die erste Ganzzahl ein: ");
		numbera = sc.nextInt();	
		System.out.println("2.Bitte geben Sie die zweite Ganzzahl ein: ");
		numberb = sc.nextInt();
			
		resultc = numbera + numberb;
			
		System.out.println("2.Das Ergebnis ist: " + resultc);
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Variante 3: Mit Rückgabewert, mit Übergabeparameter (2) und ein Inhalt als Beispiel	-----------------------------------------------------------------------------------------
	
		//Hier werden Übergabeparameter benötigt und nach static wird ein datentyp benötigt in diesen Fall int
		//Mit int in public static int geben wir den datentyp an, der zurück gegeben werden soll
		public static int addierer3(int numbera, int numberb)
		{
			Scanner sc = new Scanner(System.in);
				
			System.out.println("2.Das ist ein Programm zum addieren von zwei Ganzzahlen: ");
			
			System.out.println("2.Bitte geben Sie die erste Ganzzahl ein: ");
			numbera = sc.nextInt();	
			System.out.println("2.Bitte geben Sie die zweite Ganzzahl ein: ");
			numberb = sc.nextInt();
				
			return (numbera + numberb);
				
			
		}
		//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}
