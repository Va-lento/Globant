////Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
////tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
////

Algoritmo ejer6_dia22
	definir matriz, cuadrado Como Entero
	definir magiaFilas, magiaColumnas, magiaOno Como Logico
	
	Hacer
		Escribir "Ingrese el valor de la matriz cuadrada de orden maximo 10: "
		leer cuadrado
	Mientras Que cuadrado>10
	
	Dimension matriz[cuadrado, cuadrado]
	llenadoMatriz(matriz, cuadrado)
	
	magiaFilas = sumarFilas(matriz, cuadrado)
	magiaColumnas = sumarColumnas(matriz, cuadrado)
	magiaOno = magiaFilas y magiaColumnas
	
	Escribir magiaOno
	
FinAlgoritmo

SubProceso  llenadoMatriz(matriz, cuadrado)
	definir i, j como entero
	para i=0 hasta cuadrado-1
		para j=0 hasta cuadrado-1
			Escribir "Ingrese un valor"
			leer matriz[i, j]
		FinPara
	FinPara
FinSubProceso

funcion sumatoria = sumarFilas(matriz, cuadrado)
	definir i, j, k, sumaAConseguir, sumar como entero
	Definir sumatoria Como Logico
	sumaAConseguir = 0	
	sumar = 0	
	sumatoria = Verdadero
	
	para j=0 hasta cuadrado-1
		sumaAConseguir = sumaAConseguir + matriz[0,j]
	FinPara
	
	sumaAConseguir = sumaAConseguir*cuadrado
	para i=0 hasta cuadrado-1
		para k=0 hasta cuadrado-1
			sumar = sumar + matriz[i, k]
		FinPara
	FinPara
	si sumar==sumaAConseguir
		sumatoria = Verdadero
	sino 
		sumatoria = falso
	FinSi
FinFuncion

funcion sumatoria2 = sumarColumnas(matriz, cuadrado)
	definir i, j, k, sumaAConseguir, sumar como entero
	Definir sumatoria2 Como Logico
	sumaAConseguir = 0	
	sumar = 0	
	sumatoria2 = Verdadero
	para j=0 hasta cuadrado-1
		sumaAConseguir = sumaAConseguir + matriz[j,0]
	FinPara
	sumaAConseguir = sumaAConseguir*cuadrado
	para i=0 hasta cuadrado-1
		para k=0 hasta cuadrado-1
			sumar = sumar + matriz[i, k]
		FinPara
	FinPara
	si sumar==sumaAConseguir
		sumatoria2 = Verdadero
	sino 
		sumatoria2 = falso
	FinSi
FinFuncion