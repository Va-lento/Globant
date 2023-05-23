////Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
////La variable A, debe terminar con el valor de la variable B.

SubProceso cambioDeVariable(a Por Referencia, b Por Referencia)
	Definir c Como Entero
	c = a
	a = b
	b = c
FinSubProceso

Algoritmo ejer1_dia15
	definir a, b Como Real
	leer a, b
	cambioDeVariable(a,b)
	Escribir "A= " a, " y B = " b
	
FinAlgoritmo
