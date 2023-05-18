////Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
////repetidas. Al final el procedimiento mostrará la frase final.
////Por ejemplo:
////Entrada: "Habia una vez un barco"
////Salida: "Habi un vez n brco"
////Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? quedan
////al no estar repetidas.

SubProceso eliminarVocales(frase)
	definir i, letraA, letraE, letraI, letraO, letraU Como Entero
	definir fraseN, letra como cadena
	letraA=0
	letraE=0
	letraI=0
	letraO=0
	letraU=0
	fraseN = ""
	para i = 0 hasta Longitud(frase)
		letra = Minusculas(Subcadena(frase, i, i))
		segun letra Hacer
			"a": 
				si letra = "a"
					letraA = letraA + 1
				FinSi
				si letraA>1 Entonces
					letra= ""
				FinSi
			"e":
				si letra = "e"
					letraE = letraE + 1
				FinSi
				si letraE>1 Entonces
					letra= ""
				FinSi
			"i":
				si letra = "i"
					letraI = letraI + 1
				FinSi
				si letraI>1 Entonces
					letra= ""
				FinSi
			"o": 
				si letra = "o"
					letraO = letraO + 1
				FinSi
				si letraO>1 Entonces
					letra= ""
				FinSi
			"u": 
				si letra = "u"
					letraU = letraU + 1
				FinSi
				si letraU>1 Entonces
					letra= ""
				FinSi
		FinSegun
		fraseN = fraseN + letra
	FinPara
	Escribir fraseN
	
FinSubProceso

Algoritmo ejer9_dia15
	
	definir frase como cadena
	leer frase
	eliminarVocales(frase)
	
FinAlgoritmo
