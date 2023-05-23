Algoritmo ejer1_dia10
	
	definir i, j Como Entero
	definir empleados, base, cobroVenta, aPagar, ventasTotales, comisiones Como Real
	
	Escribir "Ingrese la cantidad de empleados: "
	leer empleados
	
	comisiones = 0
	
	para i = 1 hasta empleados
		
		Escribir "Ingrese el sueldo base del empleado"
		leer base
		Escribir "Cuantoas ventas hizo?"
		leer ventasTotales
		
		para j = 1 hasta ventasTotales
			Escribir "monto de venta: "
			leer cobroVenta
			comisiones = comisiones + cobroVenta*0.10
			
		FinPara
		
		aPagar = base + comisiones
		Escribir "Las comisiones del empleado " i, " son de " comisiones
		Escribir "Total a pagar: " aPagar
		
	FinPara
	
FinAlgoritmo
