////Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
////principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
////subproceso para imprimir la matriz.

Algoritmo ejer4_dia22
	
	definir cuadrado, i, j, matriz Como Entero
	
	Escribir "Ingrese la dimension de la matriz cuadrada que desee"
	leer cuadrado
	
	dimension matriz[cuadrado, cuadrado]
	
	rellenarMatrizCuadradaCon0Diagonal(matriz, cuadrado)
	mostrarrMatrizCuadrada(matriz, cuadrado)
	
FinAlgoritmo

SubProceso rellenarMatrizCuadradaCon0Diagonal(matriz, cuadrado)
	
	definir i, j Como Entero

    para i=0 hasta cuadrado-1
		para j=0 hasta cuadrado-1
			si i==j
				matriz[i,j] = 0
			SiNo
				matriz[i,j] = aleatorio(1,9)
			FinSi
		FinPara
	FinPara
	
FinSubProceso

SubProceso mostrarrMatrizCuadrada(matriz, cuadrado)
	
	definir i, j Como Entero
	
	para i=0 hasta cuadrado-1
		para j=0 hasta cuadrado-1
			Escribir Sin Saltar matriz[i,j]
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso	