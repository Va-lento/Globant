Algoritmo ejer5_dia13
	definir num Como Entero
	definir resp Como Logico
	leer num
	resp = esPrimo(num)
	Escribir resp
	
	
	
FinAlgoritmo
funcion primo = esPrimo(nume1)
	
	definir primo Como Logico
	definir i, contador Como Entero
	contador = 0
	para i = 1 hasta nume1
		si nume1 mod i == 0 
			contador = contador + 1
		FinSi
	FinPara
	si contador == 2
		primo = Verdadero
	sino
		primo = Falso
	FinSi
FinFuncion

	