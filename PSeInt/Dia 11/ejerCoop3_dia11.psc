Algoritmo ejerCoop3_dia11
	Definir intentos Como Entero
	Definir usuario, clave como cadena
	definir login Como Logico
	Definir opcionElegida, respuesta Como Caracter
	Definir botellasIng, i, pesoBotella, valorBotella, saldo Como Entero
	
	login=Falso
	intentos = 3
	saldo = 0

	Mientras login=Falso y intentos>0
		Escribir "Ingrese el usuario: "
		leer usuario
		
		si usuario=="Albus_D"
			Escribir "Ingrese la contraseña: "
			leer clave
			si clave=="caramelosDeLimon" Entonces
				
				login=Verdadero
				
			FinSi
		FinSi
		
	 intentos=intentos-1
		
	FinMientras
	Mientras login=Verdadero
		
		Escribir "Ingrese una opcion: "
		Escribir "1- Ingresar Botellas"
		Escribir "2- Consultar Saldo"
		Escribir "3- Salir"
		leer opcionElegida
		segun opcionElegida Hacer
			
			"1":
				Escribir "Ingrese la cantidad de botellas que va a depositar: "
				leer botellasIng
				para i=1 hasta botellasIng
					pesoBotella = aleatorio(100, 3000)
					si pesoBotella<=500
						valorBotella = 50
					sino
						si pesoBotella<=1500
							valorBotella = 125
						SiNo
							valorBotella = 200
						FinSi
					
					FinSi
					Escribir "El valor que se te ofrece por la botella es $" valorBotella
					Escribir "¿Acepta el valor que se le ofrece? S/N"
					leer respuesta
					si Mayusculas(respuesta)=="S"
						saldo = saldo + valorBotella
					SiNo
						Escribir "Devolviendo material..."
					
					FinSi
				FinPara
				
			"2":
				Escribir saldo
				
			"3":
				login=Falso
			
		FinSegun
		
		
	FinMientras
	
	
FinAlgoritmo
