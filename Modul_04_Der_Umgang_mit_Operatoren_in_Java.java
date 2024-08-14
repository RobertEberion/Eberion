package Modul_04_Der_Umgang_mit_Operatoren_in_Java;

public class Modul_04_Der_Umgang_mit_Operatoren_in_Java 
{

	public static void main(String[] args) 
	{
//	Einführung: Operatoren	------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
	//	verbinden Variablen und Konstanten (fester Wert) zu Ausdrücken
									
	/*	unäre Operatoren: 	1 Operand		Betrifft eine Variable oder Konstante
	 * 	Bsp:	Vorzeichenoperator: -a
	 *			Postinkrement: a++
	 *			Negation: !a
	 * 	binäre Operatoren:	2 Operanden		Betrifft zwei Variablen oder Konstanten
	 * 	Bsp:	Addition:  a + b
	 *			logischer Vergleich: a ==  b
	 * 	ternäre Operatoren:	3 Operanden		Betriftt drei Variablen oder Konstanten
	 * 	Bsp:	Bedingungsoperator ?
	 *			max = (a > b) ? a : b;
	 */
	
	//	jeder Operator besitzt eine "Priorität"
	//	somit entsteht eine Art Rangfolge unter den Operatoren
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	Der Zuweisungsoperator =	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
	int ergebnis1 = 12; //Einzelne Zahl ist eine Konstante
	
	int ergebnis2 = 12 + 7; //Zahlen mit einem Operator (hier +) ist ein Ausdruck z.B. 12 + 7 oder (12+4) * 2
	
	int ergebnis3 = (12+4) * 2; //Operant wird von Rechts nach Links zugewiesen, heißt der Ausdruck (12+4) * 2 wird der Variable ergebnis3 zugewiesen
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	Die kombinierten Zuweisungsoperatoren	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	int variable1 = 3;
	int variable2 = 3;
	int variable3 = 3;
	
	variable1 = variable1 + 10;
	
	variable2 += 10;			//Zuweisungsoperator = wird mit + kombiniert. 
	variable3 -= 10;			//Kombinieren lassen sich die arithmetische Operatoren wie +, -, *, /, %
	variable3 /= 10;			//variable3 = variable3 / 10;
	variable3 *= 10;			//variable3 = variable3 * 10;
	variable3 %= 10;			//variable3 = variable3 % 10;
	
	System.out.println("Inhalt Variable1: " + variable1);
	System.out.println("Inhalt Variable2: " + variable2);
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	Arithmetische Operatoren	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	/*		Operator		Beschreibung								Beispiel
	 * 
	 * 		-				Vorzeichen -								zahl = -3;
	 *		+				Vorzeichen +								zahl = 3 oder zahl = +3
	 *
	 *		+				Addition									zahl = 3 + 4;
	 *		-				Subtraktion									zahl = 3 - 4;
	 *		*				Multiplikation								zahl = 3 * 4;
	 *		/				Division									zahl = 3 / 4;
	 *
	 *		%				Modulo Operator								zahl = 32 % 3; (Ergebnis: 2)
	 *						(Rest der nach Division übrig ist)
	 *						(Geht nur mit Ganzzahlen!)
	 */				
	
	int zahl1 = 13;
	int zahl2 = 4;
	
	int ergebnis;
	
	ergebnis = zahl1 / zahl2;
	System.out.println("Ergebnis mit /: " + ergebnis);
	
	ergebnis = zahl1 % zahl2;
	System.out.println("Ergebnis mit %: " + ergebnis);
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	Der Inkrement und Dekrement Operator	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//Syntax: Die Syntax einer Programmiersprache beschreibt, welche Kombinationen von Zeichen fehlerfreie Programme der Sprache bilden.
	
	//Syntax des Inkrement Operators: ++ 	erhöht den Wert einer Einheit
	//Syntax des Dekrement Operators: --	verringert den Wert einer Einheit
	
	//Es gibt 2 Varianten für jeden Operator
	
	int a = 5;
	int b = 5;
	int c = 0;
	int d = 0;
	
	//Pre-Inkrement = ++a / Pre-Dekrement = --b
	c = ++a;
	d = --b;
	
	System.out.println("Variable a enthält: " + a);
	System.out.println("Variable b enthält: " + b);
	System.out.println();
	System.out.println("Variable c enthält: " + c);
	System.out.println("Variable d enthält: " + d);
	System.out.println();
	
	a = 5;
	b = 5;
	c = 0;
	d = 0;
	
	//Post-Inkrement = a++ / Post-Dekrement = b-- 
	c = a++;
	d = b--;
	
	System.out.println("Variable a enthält: " + a); //a +1
	System.out.println("Variable b enthält: " + b); //b -1
	System.out.println();
	System.out.println("Variable c enthält: " + c); //Variable c nimmt den Wert, was vor dem Post-Inkrement gespeichert war.
	System.out.println("Variable d enthält: " + d); //Variable c nimmt den Wert, was vor dem Post-Dekrement gespeichert war.
	System.out.println();
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	Die Vergleichsoperatoren	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	/*		Operator		Beschreibung					Beispiel
	 * 
	 * 		<				kleiner als						1 < 6 (true)	
	 * 		>				größer als						1 > 6 (false)
	 * 
	 * 		<=				kleiner als oder gleich			4 <= 4 (true)	3 <= 4 (true)
	 * 		>=				größer als oder gleich			4 >= 4 (true)	6 >= 4 (true)
	 * 
	 * 		==				gleich							4 == 4 (true) 	3 == 4 (false)
	 * 		!=				ungleich						4 != 4 (false)	3 != 4 (true)
	 */
	
	boolean wahrheitswert = 5 <= 10; //Zum testen für die Operatoren
	
	System.out.println("Wahrheitswert: "+ wahrheitswert);
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	Logische Operatoren		------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	/*		Operator		Beschreibung		Beispiel
	 * 		||				logisches ODER		(a < b) || (c == d)			Wenn eine der beiden Operatoren den Wert true geben, ist das Ergebnis true
	 * 						(kurz: OR)										Die eine Klammer ODER die andere Klammer muss true sein.
	 * 		
	 * 		&&				logisches UND		(a < b) && (c == d)			Nur wenn beide Operatoren den Wert true geben dann ist das Ergebnios true, ansonsten ist es false
	 * 						(kurz: AND)										BEIDE Klammern müssen true sein 
	 * 
	 * 		!				logisches NICHT		!b							Der nachfolgende Ausdruck wird verneint
	 * 						kurz: NOT)
	 */
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	Bitweise Operatoren		------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//Mit diesen Operatoren werden gezielt einzelne Bits geändert
	
	/*		Operator			Beschreibung						Beispiel
	 * 
	 * 		<<					Linksshift							x << 1;		x << 4;
	 * 							(alle Bits nach links schieben)
	 * 		
	 * 		>>					Rechtsshift							x >> 1;		x >> 4;
	 * 							(alle Bits nach rechts schieben)			
	 * 
	 * 		&					UND-Operator						2 & 3
	 * 							(kurz: AND)
	 * 
	 * 		|					ODER-Operator						2 | 3
	 * 							(kurz: OR)
	 * 
	 * 		^					exklusiv-Oder-Operator				2 ^ 3
	 * 							(kurz: XOR)
	 */
	
	//------------------------------------------------------------------
	//----------------------------------------------------- UND-Operator = &
			int u = 6;
			int z = u & 0xFD;
	
	/*		(6)				0000 0110	Nur die Bits die 1 untereinandner haben ergeben als Bit unten 1, der Rest wird zu 0
	 * 		& (0xFD)		1111 1101
	 * 		-------------------------
	 * 						0000 0100 => Ergebnis ist gleich 4
	 */
					
	System.out.println("Ergebnis: " + z);
	
	//--------------------------------------------------------------------
	//------------------------------------------------------ ODER-Operator = |
			u = 6;
			z = u | 0x01;

	/*		(6)				0000 0110	Die Bits die 1 haben bleiben  unten 1 und werden zusammengeführt
	 * 		& (0x01)		0000 0001
	 * 		-------------------------
	 * 						0000 0111 => Ergebnis ist gleich 7
	 */
			
	System.out.println("Ergebnis: " + z);
	
	//------------------------------------------------------------------------------
	//------------------------------------------------------- Exklusiv-ODER-Operator = ^
			u = 6;
			z = u ^ 0x0F;

	/*		(6)				0000 0110	Die Bits die 1 untereinander haben werden zu 0 invertiert
	 * 		& (0x0F)		0000 1111
	 * 		-------------------------
	 * 						0000 1001 => Ergebnis ist gleich 9
	 */
	
	System.out.println("Ergebnis: " + z);	
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	Operatoren Prioritäten (Rangfolge)	------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// 	- regelt welcher Operator Vorrang hat
	 
	/*				Rangfolge		Typ														Operatoren
					
					1				Postfix-Operatoren, Postinkrement, Postdekrement		x++, x--
					
					2				Einstellige (unäre) Operatoren, Vorzeichen				++x, --x, +x, -x, ~b, !b

					3				Multiplikation, Teilerrest								a*b, a/b, a % b
					
					4				Addition, Subtraktion									a + b, a - b
					
					5				Bitverschiebung											d << k, d >> k, d >>> k
					
					6				Vergleiche												a < b, a > b, a <= b, a >= b, s instanceof S
					
					7				Gleich, Ungleich										a == b, a != b
					
					8				UND (Bits)												b & c
					
					9				Exor (Bits)												b ^ c
					
					10				ODER (Bits)												b | c
					
					11				Logisch UND												B && C
					
					12				Logisch ODER											B || C
					
					13				Bedingungsoperator										a ? b : c
					
					14				Zuweisungen												a = b, a += 3, a -= 3, a *= 3, a /= 3, a %= 3, b &= c, 
																							b ^= c, b |= c, d <<=k, d >>= k, d >>>= k	
	 * 
	 */
	
	int n = 2;
	int ergebnis8 = ++n * 2;
	
	System.out.println(ergebnis8);

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	}

}
