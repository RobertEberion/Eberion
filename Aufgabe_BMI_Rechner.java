package Modul_06_Methoden;

import java.util.Scanner;

public class Aufgabe_BMI_Rechner 
{

	public static void main(String[] args) 
	{
		//BMI-Rechner
		
		Scanner scan = new Scanner(System.in);
		
		float bodyweight = 0f;
		float bodyheight = 0f;
		float bmiZahl = 0f;
		
		System.out.print("Wieviel wiegst du? (in kg) = ");
		bodyweight = scan.nextFloat();
		
		System.out.print("Wie groß bist du? (in m) = ");
		bodyheight = scan.nextFloat();
		
		bmiZahl = bmiberechnen(bodyweight, bodyheight);
		String bmiKlasse = bmiKlassifizierung(bmiZahl);
		
		System.out.println();
		System.out.println("Mit deiner Größe von " + bodyheight + " m und einem Gewicht von " + bodyweight + " kg, hast du ein BMI von " + bmiZahl + " und hast somit " + bmiKlasse + ".");
			
	}
	
	public static float bmiberechnen (float bodyweight, float bodyheight)
	{
		float bmi = bodyweight/(bodyheight*bodyheight);
		
		bmi = (100*bmi); 
		bmi = Math.round(bmi);	//Runden mit 2 Kommastellen (Ergebnis*100 / Ergebnis runden / Ergebnis durch 100 teilen)
		bmi = bmi/100;
		
		return bmi;
		/*	Math.round
		 * 	Float wird in eine int Ganzzahl gerundet
		 * 	Double wird in eine long Ganzzahl gerundet
		 * 
		 * 	Math.floor
		 *  Rundet die Zahl mit eine Kommastelle auf
		 */
	}
	
	public static String bmiKlassifizierung (float bmiZahl)
	{
		if (bmiZahl < 18.5)
		{
			return ("Untergewicht");
		}
		else if (bmiZahl < 25.0)
		{
			return ("Normalgewicht");
		}
		else if (bmiZahl < 30.0)
		{
			return ("Übergewicht");
		}
		else if (bmiZahl < 35.0)
		{
			return ("Adipositas Grad I");
		}
		else if (bmiZahl < 40.0)
		{
			return ("Adipositas Grad II");
		}
		else if (bmiZahl >= 40.0)
		{
			return ("Adipositas Grad III");
		}
		else
		{
			return ("ungültig");
		}
	}
}
