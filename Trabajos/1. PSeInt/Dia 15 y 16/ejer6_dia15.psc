//// Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//// letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
//// Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.

SubProceso  rango_abecedario(letra)
	definir auxiliar Como Caracter
	auxiliar<- Minusculas(letra)
	
	si auxiliar<"m" o auxiliar>"t" Entonces
		mostrar "No pertenece al rango entre m y t"
	SiNo
		mostrar "Esta en el rango entre la m y t"
	FinSi
	
FinSubProceso


Algoritmo ejer6_dia15
	
	definir letra Como Caracter
	leer letra
	
	rango_abecedario(letra)
	
	
FinAlgoritmo