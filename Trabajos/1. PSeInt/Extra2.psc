Algoritmo Extra2
	Definir tiempo, hora, min, seg Como Real
	
	leer tiempo
	
	hora = trunc(tiempo / 3600)
	
	min = trunc((tiempo mod 3600) / 60)
	
	seg = (tiempo mod 3600) mod 60
	
	Escribir "Tardo un total de ", hora, " horas, " min " minutos y ", seg " segundos"
	
FinAlgoritmo
