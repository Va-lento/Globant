////Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
////máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
////pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
////programa pedirá el número de días que se van a introducir.

SubProceso media(max, min)
	Definir mediaTempDia como real
	mediaTempDia = (max+min)/2
	Escribir "La media es de: " mediaTempDia, "°C"
FinSubProceso

Algoritmo ejer2_dia15
	
	definir max, min, dias, i Como Real
	
	Escribir "Ingrese la cantidad de dias que quiere evaluar: "
	leer dias
	
	para i = 1 hasta dias
		Escribir "Ingrese temp. MAXIMA: "
		leer max
		Escribir "Ingrese temp. MINIMA: "
		leer min
		media(max, min)
		
	FinPara
	
FinAlgoritmo
