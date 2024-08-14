package Modul_07_Arrays_Felder;

import java.util.Scanner;

public class AufgabeArray1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte gib die Länge deines Arrays an: ");
		int arraySize = sc.nextInt();
		
		int[] arrayOfNumbers = new int[arraySize];
		
		for(int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.println("Bitte gib den Wert für die Zahl Nr."+ (i+1));
			arrayOfNumbers[i] = sc.nextInt();
		}
		
		System.out.println("Sie haben folgende Zahlen eingegeben:");
		
		int maxNumber = 0;
		for(int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.print(arrayOfNumbers[i] + ", ");
			
			if (arrayOfNumbers[i] > maxNumber) {
				maxNumber = arrayOfNumbers[i];
			}
		}
		System.out.println();
		System.out.println("Die größte Zahl im Array ist " + maxNumber + "!");
	}

}
