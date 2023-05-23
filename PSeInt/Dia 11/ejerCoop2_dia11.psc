Algoritmo ejerCoop2_dia11
	
	definir num, cantDigitos Como Entero	
	Escribir "Ingrese un numero"
	leer num
	cantDigitos=0
	Mientras  num>0
		num = trunc(num/10)
		cantDigitos = cantDigitos + 1
	FinMientras
	Escribir cantDigitos

	
	
FinAlgoritmo
