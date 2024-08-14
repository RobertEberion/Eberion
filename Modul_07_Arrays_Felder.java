package Modul_07_Arrays_Felder;

import java.util.Scanner;

public class Modul_07_Arrays_Felder {

	public static void main(String[] args) {
	//Deklaration von Arrays	----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Beliebige viele Variablen des gleichen Datentyps werden erzeugt
		//In Arrays werden Variablen als Elemente bezeichnet
		//Die vorbestimmte Länge der Elemente müssen deklariert werden
		
		String[] nameArr = new String[50];//Deklaration, ohne festen Wert
		
		//NameArr ist der Bezeichner des Arrays, 50 gibt die vorbestimmte Menge der Elemente an
		//50 sind 50 Elemente zuerst ohne Wert
		
		int[] hausNrArr = {1, 22, 3, 34, 5, 86, 7, 18, 9};//Hier wird das Array direkt initilisiert, mit direkten Werten
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Auf die einzelnen Array Elemente zugreifen	--------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Index startet bei 0, wie in diesen Fall, somit wird der erste Wert initialisiert
		nameArr[0] = "Roger";
		//Index mit 49 ist das letzte Element dieses Arrays
		nameArr[49] = "Letzter";
		
		System.out.println(nameArr[0] + nameArr[49] + nameArr[1]);
		//nameArr[1] erhalt bei System.out.println den Wert null, da noch kein Wert für index 1 initilisiert worden ist
		
		System.out.println(hausNrArr[0] + hausNrArr[5]);
		
		hausNrArr[0] = 77;//Der Wert des Arrays kann nachträglich verändert werden
		System.out.println(hausNrArr[0]);
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Arrays und Schleifen geschickt kombinieren	--------------------------------------------------------------------------------------------------------------------------------------------------------
		
		boolean[] testArray1 = new boolean[50];
		for(int i = 8; i < 50; i++) {
			testArray1[i] = true;
		}
		//Mit einer For-Schleife werden alle 50 Elemente auf true gesetzt
		//Oder man kann einen Zähler erstellen wie unten
		
		//int[] testArray2 = new int[10];
		//for(int i = 0; i < 10; i++) 
		//{	
		//	testArray2[i] = i + 1;
		//}
		
		//for(int i = 0; i < 10; i++) {
		//	System.out.println(testArray2[i]);
		//}
		//Die 10 in i < 10 begrenzt den Durchlauf auf 10
		//Dabei muss wenn die 10 in new int[10] jetzt höher ist z.B. 12, bei i < 10 auch wieder auf 12 korrigiert werden.
		//Deswegen setzt man wie unten .length als testArray.lengh ein, und muss nicht mehr alle Werte korrigieren
		
		int[] testArray2 = new int[10];
		
		for(int i = 0; i < testArray2.length; i++) {	
			testArray2[i] = i + 1;
		}
				
		for(int i = 0; i < testArray2.length; i++) {
			System.out.println(testArray2[i]);
		}
		
		//Mit testArray3 wissen wir diesmal die Länge des Arrays nicht und da macht die automatische Anpassung mit .length noch mehr Sinn
		int arraySize;
		
		System.out.println("Bitte geben Sie die Array Länge ein: ");
		Scanner sc = new Scanner(System.in);
		arraySize = sc.nextInt();
		
		int[] testArray3 = new int[arraySize];
		
		for(int i = 0; i < testArray3.length; i++ ) {	
			testArray3[i] = i + 1;
		}
				
		for(int i = 0; i < testArray3.length; i++) {
			System.out.println(testArray3[i]);
		}
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Einschub: Speicherbereich von Arrays überschreiten	------------------------------------------------------------------------------------------------------------------------------------------------
		
//		int[] array = new int[5]; //Hier überschreitet array[5] = 10; mit der 5 den Speicherbereich, da new int[5] von 0 bis 4 geht.
//		array[5] = 10;
//		
//		for(int i = 0; i <= testArray3.length; i++) //Hier wird mit length die länge automatisiert, aber mit <= wird trotzdem der Speicherbereich überschritten
//		{	
//			testArray3[i] = i + 1;
//		}
		
		//Mit java.lang.ArrayIndexOutOfBoundsException teilt java bei den oberen Ausführungen mit, dass wir aus dem Speicherbereich des arrays sind
		//Beim programmieren sollte man aufpassen keine Speicherbereich zu überschreiten
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Array mithilfe der foreach Schleife durchlaufen	----------------------------------------------------------------------------------------------------------------------------------------------------
		
//		for(int arrayElement : array) {
//			System.out.println(arrayElement);
//		}
		//int 			= Datentyp	
		//arrayElement 	= die einzelnen Elemente/Variablen des Arrays		
		//array 		= das array das durchlaufen werden soll
		
		//Dies ist eine kompaktere Version einer for-Schleife
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Arbeiten mit mehrdimensionalen Arrays	----------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		int[][] field = new int[4][6];//[4] steht für die Zeilen, [6] steht für die Spalten
		
		/*	Zweidimsensionales Array für oben als Tabelle gezeigt
		 * 
		 * 	0										Spalten
		 * 		(0/0) (0/1)	(0/2) (0/3) (0/4) (0/5)
		 * 		(1/0) (1/1)	(1/2) (1/3) (1/4) (1/5)
		 * 		(2/0) (2/1)	(2/2) (2/3) (2/4) (2/5)
		 * 		(3/0) (3/1)	(3/2) (3/3) (3/4) (3/5)
		 * Zeilen
		 */
		
		field[1][2] = 100;//Initialsisierung eines einzelnen Werts im zweidimensionalen Array
		
		//direkte Initialisierung eines zweidimensionalen Arrays
		
		int[][] field2 = {
				{10, 20, 30, 40, 50, 60},
				{11, 21, 31, 41, 51, 61},
				{12, 22, 32, 42, 52, 62}
				};
		
		//Ausgabe auf der Console eines zweidimensionalen Arrays
		
		for(int i = 0; i < field2.length; i++) { //Mit field2.length wird die Anzahl der Zeilen ausgegeben
			for(int j = 0; j < field2[i].length; j++) { //Mit field2[i].length jeweils immer die Anzahl der Spalten für jede Zeile
				System.out.print(field2[i][j] + " ");
			}
			System.out.println(); //Für den Zeilenumbruch für die Zeilen, wenn eine Spalte durch ist
		}
		
		//	Mit field2[0].length z.B. gibt er die Anzahl der Spalten in der ersten Zeile an, 
		//	somit kann man mit field2[i].length jeweils immer die Anzahl der Spalten für jede Zeile angeben lassen
		
		//Weil es so Spaß macht, hier ein Beispiel für ein dreidimensionales Array
		int[][][] field3 = {
				{{1000, 1001}, {1010, 1011}, {1020, 1021}, {1030, 1031}, {1040, 1041}, {1050, 1051}},
				{{1100, 1101}, {1110, 1111}, {1120, 1121}, {1130, 1131}, {1140, 1141}, {1150, 1151}},
				{{1200, 1201}, {1210, 1211}, {1220, 1221}, {1230, 1231}, {1240, 1241}, {1250, 1251}}
				};
		
		for(int i = 0; i < field3.length; i++) {
			for(int j = 0; j < field3[i].length; j++) { 
				for(int k = 0; k < field3[i][j].length; k++) { 
					System.out.print(field3[i][j][k] + " ");
				};
			System.out.print("  ");	
			}
			System.out.println();
			System.out.println();
		}
		
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	}

}
