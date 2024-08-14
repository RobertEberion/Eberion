package Modul_05_Die_verschiedenen_Kontrollstrukturen;

import java.util.Scanner;

public class Aufgabe_Taschenrechner {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		double zahl1 = 0; 
		double zahl2 = 0;
		double result = 0;
		String operator = "";
		
		boolean bool = true;
		
		while(bool == true)
		{
			System.out.println("Bitte gib deine erste Zahl ein: ");
			zahl1 = sc.nextDouble();
		
			while(bool == true)
			{
				System.out.println("Gib einen der folgenden Operatoren ein (+ - * /): ");
				operator = sc.next();
				
				if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))
				{
					bool = false;
				}
				else
				{
					System.out.println("Bitte nur + - * /");
				}
			}
			
		
			System.out.println("Bitte gib deine zweite Zahl ein: ");
			zahl2 = sc.nextDouble();
		
			switch(operator) 
			{
				case "+":
				{
					result = zahl1 + zahl2;break;	
				}
				case "-":
				{
					result = zahl1 - zahl2;break;	
				}
				case "*":
				{
					result = zahl1 * zahl2;break;
				}
				case "/":
				{
					result = zahl1 / zahl2;break;
				}
			}
		
			String replay = "";
		
			System.out.println(zahl1 + " " + operator + " " + zahl2 + " = " + result);
			System.out.println();
			System.out.println("Willst du nochmal? Dann tippe 'ja', wenn nicht, tippe etwas anderes ein.");
			
			replay = sc.next();
			
			if(replay.equals("ja"))
			{
				bool = true;
				System.out.println("Sehr schön :)");
			}
			else
			{
				bool = false;
			}
		}
		
		
	}

}
