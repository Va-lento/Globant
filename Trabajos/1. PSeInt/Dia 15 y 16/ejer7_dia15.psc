////Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
////comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario
////al comenzar. Ejemplo: si se ingresa el n�mero 3:

SubProceso escalera(largoEscalera)
	definir i,j Como Entero
	Para i = 1 hasta largoEscalera
		para j = 1 hasta i
			Escribir Sin Saltar j
		FinPara
		Escribir  ""
	FinPara
	
FinSubProceso

Algoritmo ejer7_dia15
	
	definir largoEscalera Como Entero
	Escribir "Ingrese el alrgo de la escalera: "
	leer largoEscalera
	escalera(largoEscalera)
	
FinAlgoritmo
