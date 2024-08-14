package Modul_06_Methoden;

import java.util.Scanner;

public class Aufgabe_ausgedachte_Zahl_erraten 
{

	public static void main(String[] args) 
	{
		
		int startNumber = 500;
		int Number = 250;
		int choice = 0;
		boolean breakout = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hallo, bitte denke dir eine Zahl zwischen 1 und 1000 aus. Ich werde versuchen diese mit deinen Hinweisen herauszufinden.");
		
		while(breakout == true)
		{
			System.out.println("Ist die Zahl genau " + startNumber + ", drücke [1]");
			System.out.println("Ist die Zahl größer als " + startNumber + ", drücke [2]");
			System.out.println("Ist die Zahl kleiner als " + startNumber + ", drücke [3]");
			choice = sc.nextInt();
		
			switch(choice)
			{
				case 1:
				{
					System.out.println("Yay, deine Zahl ist " + startNumber + "!");
					breakout = false; 
					break;
				}
				case 2:
				{
					startNumber = startNumber + Number; 
					System.out.println("Ist dine Zahl größer oder kleiner als " + startNumber);
					if(Number > 1)
					Number = Number/2;
					break;
				} 
				case 3: 
				{
					startNumber = startNumber - Number; 
					System.out.println("Ist deine Zahl größer oder kleiner als " + startNumber + "?");
					
					if(Number > 1)
					Number = Number/2;
					break;
				} 
			}
				
		}
	}

}
