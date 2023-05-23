////Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
////terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
////cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
////(incluyendo a las vocales acentuadas) se mantienen sin cambios.
////Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
////correspondiente. Utilice la estructura "según" para la transformación.
////Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
////La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
////NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.

SubProceso transformador(palabra)
	definir i Como Entero
	Definir letra, fraseNueva como cadena
	
	fraseNueva = ""
	
	para i = 0 hasta Longitud(palabra)
		letra = subcadena(palabra, i, i)
			segun Minusculas(letra)
			"a":
				letra = "@"
			"e":
				letra = "#"
			"i":
				letra = "$"
			"o":
				letra = "%"
			"u":
				letra = "*"
			De Otro Modo:
				letra = letra
		FinSegun
		fraseNueva = Concatenar(fraseNueva,letra)
	FinPara
	Escribir fraseNueva
FinSubProceso

Algoritmo ejer4_dia15
	Definir palabra como cadena
	Escribir "Ingrese una palabra:"
	leer palabra
	transformador(palabra)
	
FinAlgoritmo
