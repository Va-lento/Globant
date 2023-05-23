////Realizar un procedimiento que permita realizar la divisi�n entre dos n�meros y muestre el
////cociente y el resto utilizando el m�todo de restas sucesivas.

////El m�todo de divisi�n por restas sucesivas consiste en restar el dividendo con el divisor hasta
////obtener un resultado menor que el divisor, este resultado es el residuo, y el n�mero de restas
////realizadas es el cociente. Por ejemplo: 50 / 13:
////		a50 ? b13 = 37 una resta realizada
////		37 ? 13 = 24 dos restas realizadas
////		24 ? 13 = 11 tres restas realizadas
////	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

SubProceso restaSucesiva(a,b)
	definir cociente Como Entero
	cociente = 0
	Mientras a>=b
		a = a-b
		cociente = cociente+1
	FinMientras
	Escribir "El resto es: " a, " Y el cociente es: " cociente
	
FinSubProceso

Algoritmo ejer3_dia16
	definir a,b Como Real
	Escribir "Ingrese dos valores"
	leer a,b
	restaSucesiva(a,b)
FinAlgoritmo
