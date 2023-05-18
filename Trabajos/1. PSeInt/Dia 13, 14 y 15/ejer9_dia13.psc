Algoritmo ejer9_dia13
	definir nombre, diaSemana, turno, diaFestivo Como Cadena
	definir horas, sueldoJornada Como real
	Escribir "Ingrese el nombre del trabajador: "
	leer nombre
	Escribir "Ingrese el dia de la semana: "
	leer diaSemana
	Escribir "Era dia festivo?"
	leer diaFestivo
	Escribir "Ingrese el turno: "
	leer turno
	Escribir "Ingrese horas trabajadas: "
	leer horas
	sueldoJornada = calcularSueldo(turno, horas, diaFestivo)
	Escribir nombre, " recibira un total de " sueldoJornada " por su jornada del dia: " diaSemana
FinAlgoritmo


funcion sueldo = calcularSueldo (turnoDoN, cantHoras, diaFest)
	definir sueldo Como Real	
	segun Mayusculas(turnoDoN)
		"DIURNO":
			si Minusculas(diaFest) == "si"
				sueldo = cantHoras*(90 + 90*0.10)
			SiNo
				sueldo = cantHoras*90
			FinSi
		"NOCTURNO":
			si Minusculas(diaFest) == "si"
				sueldo = cantHoras*(125 + 125*0.15)
			SiNo
				sueldo = cantHoras*125
			FinSi
	FinSegun
FinFuncion
	