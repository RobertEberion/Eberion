"""
AUFGABE 1 
In dieser Aufgabe gilt es ein Programm zu schreiben, mit welchem du Personen erfassen kannst.
Hierzu soll zunächst der Vorname des Nutzers abgefragt und eingelesen werden. 
Daraufhin sollen dann im Anschluss auch noch der Nachname und das Alter des Nutzers abgefragt und eingelesen werden.
Sobald alle drei Werte eingelesen wurden, soll der komplette Name samt Alter übersichtlich auf der Konsole ausgegeben werden.
"""

"""
AUFGABE 2
Mal angenommen wir haben innerhalb unseres Programms folgenden Code gegeben:

first_names = ['John', 'Doe', 'Jane']
last_names = ['Wick', 'Dawson, 'Jackson']

Deine Aufgabe ist es nun, dieses Programm dahingehend zu erweitern, 
dass der Nutzer dazu aufgefordert wird, den Wert 0 einzugeben, 
falls er den Namen von Max Mustermann ausgeben lassen möchte.
Falls er den Namen von Fritz Huber ausgeben lassen möchte, 
soll der Nutzer hingegen den Wert 1 eingeben und falls er den Namen Anna Neumann ausgeben lassen möchte, 
soll er den Wert 2 eingeben. 
Je nachdem wie sich der Nutzer entschieden hat, 
soll dann der entsprechende Name mithilfe der print()-Funktion 
und dem Zugriff auf die entsprechenden Listen ausgegeben werden
"""


#--Aufgabe1

first_name = input("Enter your first name: ")
last_name = input("Enter your last name: ")
age = input("Enter your age: ")

print("Du heißt " + first_name + " " + last_name + " und bist " + age +" Jahre alt")


#--Aufgabe2

first_names = ['John', 'Doe', 'Jane']
last_names = ['Wick', 'Dawson', 'Jackson']

output = int(input("Bitte 0, 1 oder 2 eingeben: "))

print("Du heißt " + first_names[output] + " " + last_names[output])
