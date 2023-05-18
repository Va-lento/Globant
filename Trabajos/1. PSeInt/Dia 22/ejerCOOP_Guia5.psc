Algoritmo ejerCOOP_Guia5
	
	definir matrizP, matrizResultante, palabraIng como cadena
	definir k Como Entero
	Dimension matrizP[9,12]
	Dimension matrizResultante[9,12]
	
	llenadoMatriz(matrizP)
	
	para k=0 hasta 8
		Escribir "Ingrese la palabra de la fila " k+1
		leer palabraIng
		palabraIng = Mayusculas(palabraIng)
		agregarPalabra(matrizP, palabraIng, k)
	FinPara
	mostrarrMatriz2D(matrizP)
	
FinAlgoritmo

///////////////////////////////

SubProceso llenadoMatriz(matrizP)
	definir i,j Como Entero
	para i=0 hasta 7
		para j=0 hasta 10
			matrizP[i,j] = "*"
		FinPara
	FinPara
FinSubProceso

///////////////////////////////

SubProceso mostrarrMatriz2D(matriz)
	definir i, j Como Entero
	para i=0 hasta 7
		para j=0 hasta 10
			Escribir Sin Saltar matriz[i,j]
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso
///////////////////////////////

SubProceso agregarPalabra(matrizP, palabraIng, i)
	definir j, long Como Entero
	long= Longitud(palabraIng)
	para j=0 hasta long-1
		matrizP[i,j] = Subcadena(palabraIng, j, j)
	FinPara
FinSubProceso

///////////////////////////////

SubProceso buscarR()
	
	
FinSubProceso

///////////////////////////////