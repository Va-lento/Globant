//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el valor
//más grande del vector.

Algoritmo ejer5_dia18
	Definir vector, n Como Entero	
	Escribir "Ingrese tamaño de vector"
	leer n
	Dimension vector[n]
	llenarVector(vector, n)
	Escribir "el valor mayor es " mayor(vector,n)
FinAlgoritmo


SubProceso llenarVector(vector Por Referencia, n)
	Definir i Como Entero
	Para i<-0 hasta n-1
		Escribir "Ingrese un número"
		Leer vector[i]
	FinPara
	
FinSubProceso

Funcion valorMayor <- mayor(vector,n)
	Definir i, valorMayor Como Entero
	valorMayor=vector(0)
	Para i = 0 hasta n-1 Hacer
		si vector(i) >= valorMayor Entonces
			valorMayor=vector(i)
		FinSi
		
	FinPara
Fin Funcion