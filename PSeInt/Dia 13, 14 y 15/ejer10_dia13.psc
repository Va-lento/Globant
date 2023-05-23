Algoritmo ejer10_dia13
	definir numero1, resultado Como Entero
	leer numero1
	resultado = sumarDigitos(numero1)
	Escribir resultado
	
FinAlgoritmo

funcion sumaDigitos = sumarDigitos(numeroASumar)
	definir sumaDigitos Como Entero
	sumaDigitos = trunc(numeroASumar/10) + numeroASumar mod 10
FinFuncion
	