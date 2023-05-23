////Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
////un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
////subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
////los resultados por pantalla.

Algoritmo ejer3_dia22
	definir matriz, filas, columnas, i, j como enteros
	definir suma Como Entero
	
	Escribir "Ingrese el total de filas que quiere en su matriz: "
	leer filas
	Escribir "Ingrese el total de columnas que quiere en su matriz: "
	leer columnas
	
	Dimension matriz[filas, columnas]
	llenarMatrizRandom(matriz, filas, columnas)
	
	suma = sumarVdeMatriz(matriz, filas, columnas)
	
	Escribir ""
	mostrarrMatriz2D(matriz, filas, columnas)
	Escribir ""
	Escribir "El total es: " suma
	
FinAlgoritmo

Funcion total <- sumarVdeMatriz(matriz, filas, columnas)
	definir i, j, total Como Entero
	total = 0
	para i = 0 hasta filas-1
		para j=0 hasta columnas-1
			total = total + matriz[i,j]
		FinPara
	FinPara
FinFuncion

SubProceso llenarMatrizRandom(matriz, filas, columnas)
	definir i, j como entero
	para i=0 hasta filas-1
		para j=0 hasta columnas-1
			matriz[i,j] = Aleatorio(0,9)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarrMatriz2D(matriz, filas, columnas)
	definir i, j Como Entero
	
	para i=0 hasta filas-1
		para j=0 hasta columnas-1
			Escribir Sin Saltar matriz[i,j]
		FinPara
		Escribir ""
	FinPara
FinSubProceso