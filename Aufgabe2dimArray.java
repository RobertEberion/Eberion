package Modul_07_Arrays_Felder;

import java.util.Scanner;

public class Aufgabe2dimArray {

	public static void main(String[] args) {

		int[][] array2D = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		System.out.println("Du wirst jetzt 9 Zahlen mit einem ganzzahligen Wert von 1 bis 3 eingeben.");
		
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				
				do {
                    System.out.print("Gib die Zahl für Position (" + (i + 1) + ", " + (j + 1) + ") ein: ");
                    input = sc.nextInt();
                    
                    if (input < 1 || input > 3) {
                        System.out.println("Bitte gib NUR eine ganze Zahl zwischen 1 und 3 ein!");
                    }
                    
                } while (input < 1 || input > 3);
                
				array2D[i][j] = input;
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Die Zahlenreihenfolge stimmt überein, dann soll er folgendes mitteilen:
		
		for (int i = 0; i < array2D.length; i++) {
			if (array2D[i][0] == array2D[i][1] && array2D[i][0] == array2D[i][2]) {
				System.out.println("Die " + (i+1) + ". Zeile hat nur die Zahl " + array2D[i][0]);
			}
		}
		
	}

}
