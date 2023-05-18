Algoritmo ejer3_dia13
	definir nume1, nume2 Como Entero
	definir multiplo Como Logico
	Escribir "ingrese 2 numeros"
	leer nume1, nume2
	multiplo = verificarMult(nume1, nume2)
	Escribir multiplo
	
	
FinAlgoritmo

Funcion esMultiplo <- verificarMult (num1, num2)
	definir esMultiplo Como Logico
	esMultiplo=num1 mod num2 == 0
FinFuncion
	