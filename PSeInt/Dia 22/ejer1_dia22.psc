////Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
////los muestre por pantalla.

Algoritmo ejer1_dia22
	definir matriz, valorIng, i, j Como Entero
	Dimension matriz[3,3]
	para i=0 hasta 2
		para j = 0 hasta 2
			leer valorIng
			matriz[i, j] = valorIng
		FinPara
	FinPara
	mostrarrMatriz2D(matriz)
FinAlgoritmo

SubProceso mostrarrMatriz2D(matriz)
	definir i, j Como Entero
	para i=0 hasta 2
		para j=0 hasta 2
			Escribir Sin Saltar matriz[i,j]
		FinPara
		Escribir ""
	FinPara
FinSubProceso
