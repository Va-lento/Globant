Algoritmo extra_8
	
	Definir salario como cadena
	
	Definir ventas, horas, sueldo como real
	
	Definir comision, fijoYComision, fijo Como Real
	
	Escribir "Escriba el tipo de salario: COMISION / SALARIO Y COMISION / FIJO"
	
	Leer salario
	
	segun Mayusculas(salario) hacer
		"COMISION":
			
			Escribir "Ingrese el monto de las ventas de la semana"
			leer ventas
			
			comision = ventas * 0.40
			Escribir "Su sueldo semanal es de: " comision
			
		"SALARIO Y COMISION":
			
			Escribir "Ingrese el monto de las ventas de la semana"
			leer ventas
			
			Escribir "Ingrese las horas"
			leer horas
			Escribir "Ingrese la paga x hora"
			leer fijo
			
			si horas < 40
				fijoYComision = (horas * fijo) + ventas * 0.25
				Escribir "Su salario es de: " fijoYComision
			SiNo
				Escribir "LAS HORAS MAXIMAS A TENER EN CUENTA SON 40 POR SEMANA"
				fijoYComision = (40 * fijo) + ventas * 0.25
				Escribir "Su salario es de: " fijoYComision
			FinSi
			
		"FIJO" : 
			
			Escribir "Ingrese las horas"
			leer horas
			Escribir "Ingrese la paga x hora"
			leer fijo
			
			si horas > 40
				Definir horasExtra Como Real
				horasExtra = horas - 40
				
				sueldo = horas * fijo + horasExtra * (1.50*fijo)
				
				Escribir "Su sueldo es de: " sueldo
			sino 
				
				sueldo = horas * fijo
				Escribir "Su sueldo es de: " sueldo
				
			FinSi
		
	FinSegun
	
FinAlgoritmo
