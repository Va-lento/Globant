Algoritmo ejer8_dia15
	
	Definir dia, mes, anio Como Entero
	Escribir "Ingrese la fecha de la siguiente forma: día - mes - año"
	Leer dia
	Leer mes
	Leer anio
	diaAnterior(dia, mes, anio)
	imprimir "El día anterior es: ", dia,"/",mes,"/",anio
	


FinAlgoritmo

SubProceso  diaAnterior(dia por Referencia, mes Por Referencia, anio Por Referencia)
	
	si (dia==1) y (mes==1)
		dia = 31
		mes = 12
		anio = anio - 1
	SiNo
		si dia==1
			dia = 30
			mes = mes -1
			anio = anio - 1
		SiNo
			dia = dia-1
			mes=mes-1
			anio=anio
		FinSi
	FinSi
FinSubProceso