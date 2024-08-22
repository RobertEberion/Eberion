#Modul 5: Operatoren

#--Operatoren Einführung
"""
Unäre Operatoren (1 Operand)
Binäre Operatoren (2 Operanden)
Ternäre Operatoren (3 Operanden)

Beispiele
-7: Unärer Operator
12-3: Binärer Operator
"""



#--Der Zuweisungsoperator ist =

result1 = 14            #14 -> Wert oder Konstante

result2 = 7 + 5         #7 + 5 -> Ausdruck, bestehen aus Werte und einen Operator

result3 = (12 + 3) * 2



#--Arithmetische Operatoren
"""
    Operator    Beschreibung                                    Beispiel
        -       Vorzeichen -                                    number = 3 
        +       Vorzeichen +                                    number =3 (oder number = +3) 
        +       Addition                                        number = 3 + 4 
        -       Subtraktion                                     number = 3 - 4 
        *       Multiplikation                                  number = 3 * 4 
        /       Division                                        number =12 / 4 
        %       Modulo Operator (Rest der Division)             number = 32 % 3 (Ergebnis: 2) 
        **      Exponentation                                   number = 3 ** 4 (Ausgesprochen: 3 hoch 4)
        //      Ganzzahl Division (Division ohne Rest)          number = 32 // 3 (Ergebnis 10) 
"""



#--kombinierte Zuweisungsoperatoren     +=, -=, *=, /=

variable1 = 2
variable2 = 2
variable3 = 2
variable4 = 2
variable5 = 2
variable6 = 2
variable7 = 2

variable1 -= 10
variable2 += 10
variable3 *= 10
variable4 /= 10
variable5 %= 10
variable6 //= 10
variable7 **= 10



#--Vergleichsoperatoren und der Datentyp bool
"""
        Operator            Beschreibung                Beispiel
        <                   kleiner als                 1 < 6 (True) 
        >                   größer als                  1 > 6 (False) 
        <=                  kleiner als oder gleich     4 <= 4 (True) 3 <= 4 (True)
        >=                  größer als oder gleich      4 >= 4 (True) 6 >= 4 (True)
        ==                  gleich                      4 == 4 (True) 3 == 4 (False)
        !=                  ungleich                    4 != 4 (False) und 3 !=4 (True) 
"""
"""
Der Datentyp bool
    Dient zur Darstellung von Wahrheitswerten
        True und False
    Wird primär dazu verwendet, dass Ergebnis von Vergleichen darzustellen
    True und False sind gültige Konstanten, die auch überall sonst im Code verwendet werden können
"""



#--logische Operatoren
"""
        Operator        Beschreibung        Beispiel
        or              logisches ODER      (a < b) or (c == d)
        and             logisches UND       (a < b) and (c == d)
        not             logisches NICHT     Not b 
"""



#--bitweise Operatoren
"""
        Operator        Beschreibung                                        Beispiel
        <<              Linksshift (alle Bits nach links schieben)          x << 1    x << 4 
        >>              Rechtsshift (alle Bits nach rechts schieben)        x >> 1    x >> 4 
        &               UND-Operator                                        2 & 3 
        |               ODER-Operator                                       2 | 3 
        ^               Exklusiv-ODER-Operator                              2 ^ 3 
"""
print(6 << 1)  #Dualsystem: 0000 0110
#Dualsystem: 0000 1100    wird um 1 Bit verschoben Ergebnis ist 12



#--Operatoren Prioritäten

"""
Genaue Regelung, welcher Operator Vorrang hat
https://docs.python.org/3/reference/expressions.html#operator-precedence
"""

print(3 + 2**2)

