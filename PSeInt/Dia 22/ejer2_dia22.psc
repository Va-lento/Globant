////Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
////usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
////coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
////caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.

Algoritmo ejer2_dia22
	
	definir matriz, i, j, valor_a_buscar Como Entero
	
	Dimension matriz[5,5]
	para i=0 hasta 4
		para j=0 hasta 4
			matriz[i,j] = aleatorio(0,9)
		FinPara
	FinPara
	
	Escribir "Ingrese el valor (de 0 a 9) que desea buscar en la matriz: "
	leer valor_a_buscar
	
	para i=0 hasta 4
		para j=0 hasta 4
			si matriz[i,j] == valor_a_buscar
				Escribir "El valor se encuentra en la posicion: [" i+1,", " j+1 "]"
			FinSi
		FinPara
	FinPara
	
	Escribir ""
	mostrarrMatriz2D(matriz)
	Escribir ""
	
FinAlgoritmo

SubProceso mostrarrMatriz2D(matriz)
	definir i, j Como Entero
	
	para i=0 hasta 4
		para j=0 hasta 4
			Escribir Sin Saltar matriz[i,j]
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso