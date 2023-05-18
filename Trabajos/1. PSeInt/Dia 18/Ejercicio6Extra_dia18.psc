//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
//un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
//posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
//o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
//en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//más cercano.
Subproceso llenarVector (vector)
	Definir frase Como Cadena
	Definir i Como Entero
	Escribir "Ingrese una frase de máximo 20 caracteres"
	Leer frase
	Mientras Longitud(frase)>20
		Escribir "La frase debe tener como máximo 20 caracteres"
		Leer frase
	Fin Mientras
	
	Para i=0 hasta 19
		vector[i]=Subcadena(frase,i,i)
	FinPara
FinSubProceso

SubProceso reemplazar(vector)
	Definir posicion, i, iDer, posicionDer, iIzq, posicionIzq Como Entero
	Definir letra, vectorDes Como Caracter
	Dimension vectorDes[20]
	
	Escribir "Indique la posición que desea reemplazar"
	Leer posicion
	Escribir "Indique el carácter a ingresar"
	Leer letra
	
	Si vector[posicion]=" " o vector[posicion]=""
		vector[posicion]=letra
		Para i=0 hasta 19
			Escribir sin saltar vector[i]
		FinPara
	SiNo
		posicionDer=0
		iDer=posicion
		
		Mientras (vector[iDer]<>" " o vector[iDer]="") y iDer<19
			iDer=iDer+1
		FinMientras
		Si iDer=19 y posicionDer=0
			posicionDer=19
		SiNo
			posicionDer=iDer
		FinSi
	
		posicionIzq=0
		iIzq=posicion
		
		Mientras (vector[iIzq]<>" " o vector[iIzq]="") y iIzq>0
			iIzq=iIzq-1
		FinMientras
		Si iIzq=0 y posicionIzq=0
			posicionIzq=0
		SiNo
			posicionIzq=iIzq
		FinSi
	
		
		Si posicionDer-posicion<posicion-posicionIzq
			Para i=0 hasta posicion-1
				vectorDes[i]=vector[i]
			FinPara
			
			vectorDes[posicion]=letra
			
			Para i=posicion+1 hasta 19
				vectorDes[i]=vector[i-1]
			FinPara
		SiNo
			Si posicion >0
				Para i=0 hasta posicion-1
					vectorDes[i]=vector[i+1]
				FinPara
			Fin si
			
			vectorDes[posicion]=letra
			
			Para i=posicion+1 hasta 19
				vectorDes[i]=vector[i]
			FinPara
		FinSi
		
		Para i=0 hasta 19
			Escribir Sin SaltarvectorDes[i]
		FinPara
	
	FinSi
	
FinSubProceso

Algoritmo Ejercicio6
	Definir vector Como Caracter
	Dimension vector[20]
	llenarvector(vector)
	reemplazar(vector)
FinAlgoritmo
