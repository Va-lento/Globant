Algoritmo EjeExtra7_dia22
	definir cuadroVentas Como Entero
	Dimension cuadroVentas[6,7]
	ingresoDeDatos(cuadroVentas)
	mostrarrMatriz2D(cuadroVentas)
	
FinAlgoritmo

SubProceso ingresoDeDatos(matriz)
	definir i,j, l Como Entero
	definir totalSemana, k Como Entero
	definir totalProducto como entero
	
//	Ingreso de datos
//	para i=0 hasta 4
//		para j=0 hasta 4
//			segun i
//				0:
//					Escribir "Ingrese las ventas del producto " j+1 " en el dia lunes"
//				1:
//					Escribir "Ingrese las ventas del producto " j+1 " en el dia martes"
//				2: 
//					Escribir "Ingrese las ventas del producto " j+1 " en el dia miercoles"
//				3:
//					Escribir "Ingrese las ventas del producto " j+1 " en el dia jueves"
//				4: 
//					Escribir "Ingrese las ventas del producto " j+1 " en el dia viernes"
//			FinSegun
//			leer matriz[i,j]
//		FinPara
//	FinPara
	para i=0 hasta 4
		para j=0 hasta 4
			matriz[i, j] = Aleatorio(0,9)
		FinPara
	FinPara
	// Completo casilla total semana
	totalSemana=0
	para i=0 hasta 4
		para j=0 hasta 4
			totalSemana = totalSemana + matriz[i,j]
		FinPara
		matriz[i,5] = totalSemana
		totalSemana=0
	FinPara
	
FinSubProceso

SubProceso mostrarrMatriz2D(matriz)
	definir i, j Como Entero
	
	para i=0 hasta 4
		para j=0 hasta 5
			Escribir  matriz[i,j] sin saltar
			
		FinPara
		Escribir ""
	FinPara
FinSubProceso