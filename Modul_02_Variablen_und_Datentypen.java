package Modul_02_Variablen_und_Datentypen;

public class Modul_02_Variablen_und_Datentypen {

	public static void main(String[] args) 
	{
//--	Variablen-(Prinzip, Deklaration, Initialisierung, Zuweisung)	------------------------------------------------------------------------------------------------------------------------------------------------
		
		/* Variablen = Datenbehälter
		 * Variablen müssen enthalten: Datentyp und Bezeichner
		 *  
		 * ein Datentyp z.B. int
		 * (z.B. Ganzzahlen oder Kommazahlen)
		 * 
		 * und 
		 * 
		 * ein Bezeichner  z.B. jahresZahl
		 * (Name der Variable)
		 * (Dafür da, damit man nicht kryptische Zahlenkombination hat)
		 * (Soll sprechend beschriftet werden, man soll es schon als Variable erkennen was diese ist.)
		 */
		
		int 		jahresZahl		= 						1980;
	//	Datentyp	Bezeichner		Zuweisungsoperator		Wert
		
		int meinAlter = 80;		//Initiaslisierung einer Variable: 		Direkte Zuweisung eines Werts an die Variable
		
		int meinAlter2;			//Deklaration einer Variable: 			Erzeugung einer Variable
		
		meinAlter2 = 10;		//Zuweisung: 							Da man nur ein Wert für die Variable reinstellt
		
		meinAlter = 81;			//Zuweisung
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--	Primtive Datentypen - Ein Überblick 	----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		/*	Primitiver Datentyp				Größe				Wertebereich
		 * 		boolean						undefiniert			true/false
		 * 		char						16	Bit				0 							bis 	+65 535
		 * 		byte						8	Bit				-128 						bis 	+127
		 * 		short						16	Bit				-32768 						bis 	32767
		 * 		int							32	Bit				-2^31						bis		2^31 - 1
		 * 		long						64	Bit				-2^63						bis		2^63 - 1
		 * 		float						32	Bit				1.40239846E-45				bis		3.40282347E+38	
		 * 		double						64	Bit				4.94065645841246544E-324	bis		1.79769131486231570E+308
		 * 	
		 * 	Komplexer Datentyp
		 * 		String	= können mehrere Zeichen gespeichert werden
		*/
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--	Die Ganzzahl Datentypen (byte, short, int, long)	----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		byte variable1 = 127;
		short variable2 = 30000;
		int variable3 = 20300000;
		long variable4 = 2300000000000000000L;	// L oder l für long am ende der Zahl
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--	Die Fließkomma Datentypen (float, double)	------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
		float variable5 = -3.123445345435f; // f für float am Ende der Zahl
		double variable6 = 3.1234235534543; // standard ist double, deswegen kein Buchstabe am Ende
		
		double variable7 = 2; //Zeigt 2.0 an.
		
		System.out.println(variable5);
		System.out.println(variable6);
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--	Der Datentyp char (Zeichenkonstante)	----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		char letter1 = 'a'; //Kann nur ein Zeichen enthalten
		char letter2 = '*';
		char letter3 = 'C';
		
		letter3 = 'a' + 'b'; //Char ist wie eine Zahl, deswegen lassen Sie sich zusammen addieren
		
		System.out.println(letter3);
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--	Der Datentyp boolean (Wahrheitswerte)	----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		boolean zustand1 = 2 < 1; //Stimmt die Aussage? Wenn Sie stimmt ist es gleich true, ansonsten ist es gleich false
		boolean zustand2 = 2 > 1;
		
		System.out.println(zustand1);
		System.out.println(zustand2);
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--	Einschub: Die Klasse String	(Zeichenkette)	------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		String testVariable = "Das ist ein Test"; //String wird groß geschrieben, weil es ein komplexer Datentyp ist.
		char letter4 = 'd';
		
		String verketteterString = testVariable + "Hallo";
		
		System.out.println(testVariable);
		System.out.println(verketteterString);
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	}

}
