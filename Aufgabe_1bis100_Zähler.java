package Modul_05_Die_verschiedenen_Kontrollstrukturen;

public class Aufgabe_1bis100_Zähler {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++)
		{
			if((i % 3 == 0) && (i % 4 == 0))
			{
				System.out.println(i + " ist durch 3 als auch durch 4 teilbar!");
			}
			else if(i % 4 == 0)
			{
				System.out.println(i + " ist durch 4 teilbar!");
			}
			else if(i % 3 == 0)
			{
				System.out.println(i + " ist durch 3 teilbar!");
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
