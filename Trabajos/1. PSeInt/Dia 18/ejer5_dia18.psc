//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
//m�s grande del vector.

Algoritmo ejer5_dia18
	Definir vector, n Como Entero	
	Escribir "Ingrese tama�o de vector"
	leer n
	Dimension vector[n]
	llenarVector(vector, n)
	Escribir "el valor mayor es " mayor(vector,n)
FinAlgoritmo


SubProceso llenarVector(vector Por Referencia, n)
	Definir i Como Entero
	Para i<-0 hasta n-1
		Escribir "Ingrese un n�mero"
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