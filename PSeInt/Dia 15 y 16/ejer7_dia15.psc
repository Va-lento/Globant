////Crear un programa que dibuje una escalera de números, donde cada línea de números
////comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario
////al comenzar. Ejemplo: si se ingresa el número 3:

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
