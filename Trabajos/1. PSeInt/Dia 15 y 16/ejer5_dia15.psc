////Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
////una cadena con un espacio adicional tras cada letra.
////Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
////dicho procedimiento.

SubProceso espaciado(frase Por Referencia)
	definir i Como Entero
	definir letra, fraseN como cadena
	fraseN = ""
	para i = 0 hasta Longitud(frase)
		letra = Subcadena(frase, i, i)
		fraseN = Concatenar(fraseN,letra)
		fraseN = Concatenar(fraseN, "  ")
	FinPara
	Escribir fraseN
FinSubProceso

Algoritmo ejer5_dia15
	definir frase como cadena
	leer frase
	espaciado(frase)
	
FinAlgoritmo
