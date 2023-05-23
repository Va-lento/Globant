Algoritmo Guia5_Ej7
	Definir dim, v1, v2 Como Entero
	Escribir "Ingrese la cantidad de posiciones en el vector"
	Leer dim
	
	Dimension v1[dim]
	Dimension v2[dim]
	
	llenarVector(v1,dim)
	llenarVector(v2,dim)
	
	mostrarVector(v1,dim)
	Escribir ""
	Escribir ""
	mostrarVector(v2,dim)
	Escribir ""
	Escribir ""
	Escribir "Es " compararVector(v1,v2,dim) " que los vectores son identicos"
FinAlgoritmo

Subproceso llenarVector (v Por Referencia,dim)
	Definir i Como Entero
	Para i <- 0 hasta dim - 1 Hacer
		v[i] = azar(1)
	FinPara
FinSubProceso

Subproceso mostrarVector (v, dim)
	Definir i Como Entero
	Para i <- 0 hasta dim - 1 Hacer
		Escribir v[i] sin saltar
	FinPara
FinSubProceso

Funcion retorno <- compararVector(v1, v2, dim)
	definir retorno como logico
	definir i Como Entero
	retorno = Verdadero
	
	para i <- 0 hasta dim - 1 Hacer
		Si v1[i] <> v2[i] Entonces
			retorno = Falso
		FinSi
	FinPara
FinFuncion

//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//función debe devolver el resultado de está validación, para mostrar el mensaje en el
//algoritmo. Nota: recordar el uso de las variables de tipo lógico.