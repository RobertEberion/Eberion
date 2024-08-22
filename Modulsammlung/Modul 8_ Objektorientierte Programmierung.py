#----Modul 8: Objektorientierte Programmierung----

#--Konzept der Objektorientierten Programmierung

"""
Objektorientierung ist vor allem relevant, wenn man komplexe Daten darstellen möchte. 
Mit ihr hat man die Möglichkeit eigene Datentypen nach Belieben zu kreieren.

Grobe Idee der OOP

Aus welchen Objekten setzt sich das Programm zusammen?
Objekte modellieren (eigenen Datentyp bauen)
Mit restlicher Programmmlogik die modellierten Objekte zueinander in Beziehung setzen
"""



#--Klassen und Objekte

#Klasse ist wie ein Bauplan
class Car:
  def __init__(self): # __init__ = Konstruktor
    self.car_brand = None
    self.horse_power = None
    self.color = None

car1 = Car()  #Instanzierung eines Objektes

car1.car_brand = "Audi" #Attribut ein anderen Wert zuweisen
car1.horse_power = "250"
car1.color = "Black"

print(car1.car_brand)  #print-Ausgabe des Attributs car_brand
print(car1.horse_power)
print(car1.color)

car2 = Car()  #Car() ist der Konstruktor
car2.car_brand = "BMW"
car2.horse_power = "300"
car2.color = "White"

print(car2.car_brand)
print(car2.horse_power)
print(car2.color)



#--Was hat es mit dem Parameter "self" auf sich?

print(car1) #print-Ausgabe des Objektes car1 = <__main__.Car object at 0x7fb55a970880>
print(car2) #print-Ausgabe des Objektes car2 = <__main__.Car object at 0x7fb55aa010a0>

"""
__main__ = Die Klasse Car wurde in Main definiert
Bei 0x7fb55a970880 handelt es sich um eine Speicheradresse, 
genauer gesagt um den Referenzwert eines Objekts. 
Diese Adresse dient dazu, das Objekt im Speicher zu lokalisieren.

Die Speicheradresse 0x7fb55a970880 verweist auf den Speicherbereich, in dem das Objekt "car1" gespeichert ist.
Dieser Speicherbereich stellt den physischen Platz im Arbeitsspeicher bereit, um das Objekt "car1" und seine Daten abzulegen.
Durch diesen Referenzwert kann das Programm auf das Objekt "car1" und seine Eigenschaften zugreifen.

self bezieht sich innerhalb einer Klassendefinition oder Methode auf das Objekt selbst, für das die Methode aufgerufen wird.
Über self kann die Methode auf die Attribute und Methoden des Objekts zugreifen
"""

car3 = car1
car3.horse_power = 100
#car3 hat die Werte von car1 und beide haben die gleiche Speicheradresse, 
#deswegen wird car1 auch eine horse_power von 100 haben.

print(car1.horse_power)
print(car2.horse_power)
print(car3.horse_power)



#--Methoden in Klassen

class Dogx:
  def __init__(self):
    self.name = None
    self.age = None
    self.xPosition = 5
    self.yPosition = 5
  
  def bark(self): #Methode innerhalb der Klasse
    print("Woof!")
  
  def walk(self, x, y): #Methode innerhalb der Klasse mit Parametern
    self.xPosition += x
    self.yPosition += y

  def print_position(self):
    print("Aktuelle Position: x= " + str(self.xPosition) + " | y= " + str(self.yPosition))

dog1 = Dogx()

dog1.bark() #Methode der Klasse Dog wird aufgerufen

print("Aktuelle Position von " + dog1.name + ": " + str(dog1.xPosition) + " | " + str(dog1.yPosition))
dog1.walk(2, 3) #Methode der Klasse Dog wird aufgerufen mit Parametern
print("Aktuelle Position von " + dog1.name + ": " + str(dog1.xPosition) + " | " + str(dog1.yPosition))

dog1.print_position()



#--Möglichkeiten des Konstruktors

class Dogy:
  def __init__(self, name, age): #Konstruktor mit Parametern
    self.name = name
    self.age = age
    self.xPosition = 5
    self.yPosition = 5
    return None #Das return None wird automatisch durchgeführt und muss nicht dabei beim Konstruktor angegeben werden

dog2 = Dogy("Fido", 3) #Hier müssen Parameter angegeben werden



#--Namenskonventionen

"""
1. Klassen und Methoden sollten „sprechend“ benannt werden 
2. Klassen: Starten mit Großbuchstaben. Besteht der Klassename aus mehreren Wörtern, 
   startet jedes neue Wort ebenfalls mit einem Großbuchstaben (= Pascal Case) = CarRoom
3. Variablen & Funktionen: Generell alles klein, 
   mehrere Wörter werden mit einem _ miteinander verbunden (= Sneak Case)  = car_room_door
"""


