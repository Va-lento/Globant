////Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
////encontrando la manera de que la frase se muestre de manera continua en la matriz.

Algoritmo ejer5_dia22
	definir matriz, palabraIng como cadena
	Dimension matriz[3,3]
	
	hacer
		Escribir "Ingrese una palabra de 9 caracteres como maximo: "
		leer palabraIng
		si Longitud(palabraIng)>9
			Escribir "La palabra excede los 9 caracteres"
			Escribir ""
		FinSi
	Mientras Que Longitud(palabraIng)>9
	guardarPalabra(matriz, palabraIng)
	mostrarrMatrizCuadrada(matriz)
FinAlgoritmo

SubProceso guardarPalabra(matriz, palabraIng)
	definir i, j, letraInd Como Entero
	letraInd = 0
	para i = 0 hasta 2
		para j=0 hasta 2
			matriz[i,j] = Subcadena(palabraIng, letraInd, letraInd)
			letraInd = letraInd+1
		FinPara
	FinPara
	
FinSubProceso

SubProceso mostrarrMatrizCuadrada(matriz)
	
	definir i, j Como Entero
	
	para i=0 hasta 2
		para j=0 hasta 2
			Escribir Sin Saltar matriz[i,j]
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso	