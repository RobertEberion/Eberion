#Sammlung

#--String

#lower()
"""
Converts a string into lower case
Wandelt einen String in Kleinbuchstaben um
"""
variable = "Hallo Welt"
optionLow = variable.lower()


#upper()
"""
Converts a string into upper case
Wandelt einen String in Großbuchstaben um
"""
optionLow = variable.upper()


#count()
""""
Returns the number of times a specified value occurs in a string
Gibt die Anzahl der Vorkommen eines angegebenen Wertes in einer Zeichenfolge zurück.
"""
a = variable.count("a" and "A")


#isdigit()
"""
Returns True if all characters in the string are digits
Gibt True zurück, wenn alle Zeichen in der Zeichenfolge Ziffern sind
"""
variable.isdigit()


#sum(1 for char in text if char in vokale)
"""
Man kann auch die Zeichenkettenindizierung verwenden, 
um Zeichenketten zu analysieren und zu manipulieren:
Analysieren einer Zeichenkette
"""
text = "Python"
vokale = "aeiou"
anzahl_vokale = sum(1 for char in text if char in vokale)
