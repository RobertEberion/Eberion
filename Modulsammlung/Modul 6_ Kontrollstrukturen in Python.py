#Modul 6 Kontrollstrukturen in Python

#--die If Anweisung

number = int(input("Zahl eingeben: "))

if number < 10:
    print("Die eingegebene Zahl ist kleiner als 10....")



#--Die if-Anweisung in kKombination mit elif-Zweigen und dem else-Zweig

number = int(input("Zahl eingeben: "))

if number < 10:
    print("Die eingegebene Zahl ist kleiner als 10....")

else:
    print("Die eingegebene Zahl ist 10 oder größer als 10....")



#--Die if-Anweisung in Kombination mit elif-Zweigen und dem else-Zweig

number = int(input("Zahl eingeben: "))

if number == 1:
    print("Die eingegebene Zahl ist die 1")

elif number == 2:
    print("Die eingegebene Zahl ist die 2")

elif number == 3:
    print("Die eingegebene Zahl ist die 3")

else:
    print("Die eingegebene Zahl ist 0 oder größer als 3....")



#--bedingte Ausdrücke

bill = 10

tip = float(input("Rechnung: " + str(bill) + " Euro, wie viel Trinkgeld möchten Sie geben: "))

if tip < bill * 0.1:
    print("Vielen Dank...")
else:
    print("Wow, vielen lieben Dank! Sehr großzügig!")

# A if Bedingung else B
print("Vielen Dank!") if tip < bill * 0.1 else print("Wow, vielen lieben Dank! Sehr großzügig!")



#--Die while-Schleife

counter = 7
while counter < 10:
    print ("Das ist eine Ausgabe...")
    counter += 1



#--Die Schlüsselwörter break und continue

#break
#Springt aus der innersten umgebenden Schleife (hinter die gesamte Schleifenanweisung)

#continue
#Springt zum Anfang der innersten umgebenden Schleife (zur Kopfzeile der Schleife)


password = "passwort123"
user_input = ""
counter = 0

#Variante 1
while user_input != password:
    if counter == 3:
        break  #break beendet die Schleife
    user_input = input("Bitte geben Sie das Passwort ein: ")
    counter += 1

print("Das Passwort ist korrekt!")

#Variante 2
while user_input != password and counter < 3:
    user_input = input("Bitte geben Sie das Passwort ein: ")
    counter += 1

print("Das Passwort ist korrekt! oder zu oft falsch eingegeben")

#Variante 3

while True:
    name = input("Bitte Nutzernamen eingeben: ")
    if name != "testUser":
        continue
    if user_input == password:
        break

print("testUser wurde erfolgreiche eingeloggt!")



#--Eine while-Schleife mit einem else-Zweig kombinieren

password = "passwort123"
user_input = ""
counter = 0

while user_input != password:
    if counter == 3:
        break  #break beendet die Schleife
    user_input = input("Bitte geben Sie das Passwort ein: ")
    counter += 1
else:
    print("Das Passwort wurde korrekt eingegeben")

