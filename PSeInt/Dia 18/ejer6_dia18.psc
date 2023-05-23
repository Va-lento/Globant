Algoritmo ejer6_dia18
	definir vector, caracterPedido Como Caracter
	definir frase como cadena
	Definir n, i Como Entero
	
	Dimension vector[20]
	
	Escribir "Ingrese una frase de 20 caracteres o menos"
	leer frase
	
	si Longitud(frase) > 20
		Escribir "La frase excede la cantidad de caracteres"
	SiNo
		meterPalabra(vector, frase)
		
		Escribir "Ingrese un caracter que quiera ingresar al vector y en que lugar del 0 al 19"
		leer caracterPedido, n
		meterCaracter(vector, caracterPedido, n)
		para i=0 hasta 19
			Escribir vector[i] 
		FinPara
		
	FinSi

FinAlgoritmo

SubProceso meterPalabra(vector Por Referencia, frase)
	
	definir i Como Entero
	
	para i=0 hasta 19
		vector[i]=Subcadena(frase, i, i)
	FinPara
	
FinSubProceso

SubProceso meterCaracter(vector Por Referencia, caracterPedido, n)
	si (vector[n] == "") o  (vector[n] == " ")
		vector[n] = caracterPedido
	SiNo
		Escribir "Esa posicion esta ocupada por: " vector[n]
	FinSi
	
FinSubProceso
	