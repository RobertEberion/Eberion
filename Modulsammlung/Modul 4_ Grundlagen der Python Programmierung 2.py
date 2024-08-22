#Modul 4: Grundlagen der Python Programmierung 2

#--Die Datentypen int, float und str

int_variable = 10

float_variable = 3.14
float_variable2 = 3e14
float_variable3 = 3.
float_variable4 = .145
float_variable5 = 10e999 #Zahl zu groß deswegen kommt inf raus, steht für infinity

print(float_variable5 * 10e999) #Beide Zahlen zu groß deswegen kommt inf raus
print(float_variable5 - 10e999) #kommt nan raus und steht für non a number

string_variable = "Hello World"
string_variable2 = 'Hello World'



#--Die Input()-Funktion

result = input("Bitte geben Sie etwas ein: ")
print(result)



#--Die type()-Funktion und Type-Casting-Funktionen

value1 = input("Bitte geben Sie die erste Zahl ein: ")
value2 = input("Bitte geben Sie die zweite Zahl ein: ")

type(value1) #type()-Funktion

int(value1) #Type-Casting-Funktion

print(float(value1) + float(value2))



#--Listen in Python

numbers = [1, 2, 3, 4, 5]
print(numbers)
print(type(numbers))

names = ['John', 'Doe', 'Jane']
print(names)

mixing_list = [1, 2, 3, 4, 5, "John", "Doe", "Jane"]
print(mixing_list)



#--Zugriff auf Listen

names = ['John', 'Doe', 'Jane', 1, 2e2, 3, 4.2, 5]
print(names)
print(names[0])
print(names[1])
print(names[-1])
print(names[-2])

names[0] = "Fritz"
print(names)

print(names[1:4]) #Start und Endpunkt was aus der Liste ausgegeben soll
print(names[:4]) #Startpunkt ist 0, deswegen muss es nicht angegeben werden
print(names[1:]) #Der Wert am Ende soll ausgegeben werden, deswegen steht kein Endpunkt dabei



#--Wichtige Basisfunktionalitäten von Listen

names = ['John', 'Doe', 'Jane', 1, 2e2, 3, 4.2, 5]

print(len(names))   #Die len-Funktion gibt die Anzahl der Elemente an

names.append('Fritz')   #Mit der append-Funktion kann man neue Elemente am Ende in die Liste einfügen
print(names)

names.insert(1,"marie") #Mit der insert-Funktion kann man an bestimmten Stellen der Liste Elemente hinzufügen
print(names)

names.pop() #Mit der pop-Funktion kann man das letzte Element der Liste entfernen
print(names)

names.remove(1) #Mit der remove-Funktion wird das erste Element mit dem Wert 1 entfernt
print(names)

