#Modul 7: Funktionen und Namensbereiche

#--Funktionen Einführung

"""
Bessere Strukturierung des Programms
Vermeidung von redundanten Code
Bessere Wartbarkeit
Verringerung der Fehleranfälligkeit
"""



#--Funktionen definieren und aufrufen

def greetinga():  #Die Funktion greetinga wird definiert
    print("Hello World!")
    print("Python is awesome")
    print("I don't like Mondays")

greetinga()  #Die Funktion greetinga wird aufgerufen



#--Funktionen mit Parametern definieren

vorname = "Harald"
nachname = "Breuer"

def greeting2(name):  #Die Funktion greeting2 wird definiert, mit dem Parameter name
    print("Hallo " + name + "!")
    print("Python ist awesome")
    print("I don't like Mondays")

greeting2("Max") #Die Funktion greeting2 wird aufgerufen, mit dem Parameter name als String "Max"
greeting2(vorname) #Die Funktion greeting2 wird aufgerufen, mit dem Parameter name als Variable name1

def greeting3(first_name, last_name):    #Die Funktion greeting3 wird definiert, mit den Parametern first_name und last_name
    print(f"Hallo {first_name} {last_name}!")
    print("Python ist awesome")
    print("I don't like Mondays")

greeting3("Max", "Mustermann")
greeting3(last_name="Mustermann", first_name="Max")
greeting3(vorname, nachname)



#--Funktionen mit Rückgabewerten definieren und der Datentyp NoneType

def greeting4(first_name, last_name):
    print(f"Hallo {first_name} {last_name}!")
    print("Python ist awesome")
    print("I don't like Mondays")

print(greeting4("Max", "Mustermann")) #Ergebnis ist none, da kein Rückgabewert definiert ist
print(print("Hallo")) #Ergebnis ist none, da kein Rückgabewert definiert ist
print(type(print("Klaus"))) #Die Klasse ist hier NoneType, weil print keinen Rückgabewert hat

#return als Rückgabewert
def maximum(a, b): #Die Funktion maximum wird definiert, mit den Parametern a und b
    if a > b:
        return a #Wenn a größer ist als b, wird a zurückgegeben
    else:
        return b #Wenn a nicht größer ist als b, wird b zurückgegeben

result = maximum(3, 5) #Die Funktion maximum wird aufgerufen, mit den Parametern 3 und 5
print(result) #Hier wird die Funktion mit ein Rückgabewert gegeben 



#--Optionale Parameter

#Optionale Parameter müssen eine Reihenfolge haben, da sonst Fehler auftreten
#Parameter die keinen Wert zugewiesen haben, können mit einem Default-Wert definiert werden

for x in range(10): 
    print(x)
for x in range(5, 10):
    print(x)
for x in range(5, 10, 2): #Die Werte 5 und 2 sind optionale Parameter
    print(x)

def greeting(first_name, last_name="Unbekannt", academic_title=""): #academictitle ist optional, mit einem Default-Wert "", diese müssen immer am Ende stehen
    if academic_title != "":
        academic_title += " "
    print(f"Hallo {academic_title} {first_name} {last_name}!")
    print("Schön das du da bist!")

greeting("Max", "Mustermann", "Dr.")



#--Schlüsselwort Parameter

#Parameter mit Schlüsselworten können beliebig in beliebiger Reihen erstellt werden

def greetingx(first_name, last_name="Unbekannt", academic_title=""):
    if academic_title != "":
        academic_title += " "
    print(f"Hallo {academic_title} {first_name} {last_name}!")
    print("Schön das du da bist!")

greetingx(first_name="Max", last_name="Mustermann", academic_title="Dr.") 
greetingx(academic_title="Dr.", first_name="Max", last_name="Mustermann") 
#Die Parameter werden in beliebiger Reihen gesetzt, da die eingegebenen Parameter mit Schlüsselworten übereinstimmen
greetingx("Max", academic_title="Dr.", last_name="Mustermann", ) #Da "Max" nicht Optional ist braucht dieser kein Schlüsselwort



#--Einschub: Liste vs. Tupel (Veränderlich vs. unveränderlich)

"""
    - Listen sind veränderliche Datenstrukturen
    - Tupel sind unveränderliche Datenstrukturen
    Werte eines Tupels können im Vergleich zu Listen also nicht mehr im nachhinein modifiziert werden
    Tupel erzeugt eine schnellere Ausführung des Programms, als Listen
"""

list1 = [1, 2, 3, 8, 5]
print(list1)

list1[1] = 10 #Die Zahl 2 wird durch die Zahl 10 ersetzt
print(list1)

tupel1 = (1, 2, 3, 8, 5)
print(tupel1[1])
print(type(tupel1[1]))

#tupel1[1] = 10 #Fehlermeldung, da Tupel nicht veränderbar ist

tupel2 = (2)
print(tupel2) #Die Klasse ist hier int, da es nur eine Zahl ist
print(type(tupel2))

tupel2 = (2,) #Hier wird ein Tupel erzeugt, da ein Komma dahinter steht
print(tupel2)


person1 = ("Max", "Mustermann", 28)

first_name = person1[0]
last_name = person1[1]
age = person1[2]
print(first_name)
print(last_name)
print(age)

#Kürzere Form der Ausgabe
first_name, last_name, age = person1 #Die Werte werden in die Variablen first_name, last_name und age eingesetzt

#Mit Tupel kann man von einer Funktion mehrere Rückgabewerte zurückgeben lassen
def generate_password(name, age):
    # Aus übergebeben Namen und dem Alter mehrere Passwort-Kombination generieren
    return ("passwort1", "passwort2", "passwort3")

password1, password2, password3 = generate_password("Max", 28)

print(password2)



#--Beliebige Anzahl von Parametern an Funktionen übergeben

def multiply(number1, number2=1, number3=1):
    return number1 * number2 * number3

print(multiply(1, 2, 3))
print(multiply(1, 2))
print(multiply(1))

def multiply2(*numbers):
    print(numbers)

multiply2(2, 3, 4, 5, 6, 7)

def multiply3(*numbers):
    sum = 1
    for i in numbers:
        sum *= i
    return sum

print(multiply3(2, 3, 4, 5, 6, 7, 8))
print(multiply3()) #gibt 1 zurück, obwohl keine Parameter übergeben wurden wegen sum = 1

def multiply4(number1, number2,*numbers):
    sum = number1 * number2
    for i in numbers:
        sum *= i
    return sum
    
print(multiply4(2,4)) #Hier müssen die ersten 2 Parameter übergeben werden, die anderen sind beliebig



#--Reine Schlüsselwort Parameter

#end parameter
#sep parameter


print("Test", end=", ") #end ist optional, mit einem Default-Wert "" und verhindert einen Zeilenumbruch
print("Siehst du")

print("test", "siehst", "du") #Funktion ähnlich wie *numbers in def multiply4

#dex xyz(value1, value2, *values, parameter1) # ist nicht möglich, da der Parameter parameter1 nicht optional ist
#def xyz(value1, value2, *values, end="default"):

print("test", "siehst", "du", sep="-") #sep füllt die Stelle des Separators mit dem Wert, der in der Klammer steht



#--Namensbereiche (Lokale und globale Variablen)

def add(number1, number2): #In der Funktion sind die Variablen number1 und number2 lokale Variablen
    
    test = 11 #Hier wird auf die lokale Variable zugegriffen
    res = number1 + number2
    print(test) #test = 10 kann in der Funktion ausgegeben werden, da Sie eine globale Variable ist. Wird aber von test = 11 überschrieben
    return res

test = 10 #test ist eine Variable im globalen Bereich
print(add(2, 3))
add(3, 4)
print(test) #test = 10 wird hier weiterhin ausgegeben

def add2(number1, number2): 
    global test #gibt der Variable test als globale Variable aus
    test = 11 
    res = number1 + number2
    print(test)
    return res

test = 10 #test ist eine Variable im globalen Bereich
print(add2(2, 3))
add2(3, 4)
print(test) #test = 10 wird hier weiterhin ausgegeben




