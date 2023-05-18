Algoritmo integradorPseint_GenZ
	
	definir n Como Entero
	definir matrizGenZ, muestra Como Caracter
	definir Result_DiagP, Result_DiagS, GenZ Como Logico
	
	Escribir "Analizando muestra... "
	Escribir "..."
	muestra = "ACCDBBADDDCCBACABDCBDCBADBDACBBBBDAABBCCBAACCABDBDCDDABDBDADAAACBBBBCDDDCBBBDDCDABBDDABDBDBBACADCDAAADACDDDACCDCACDDABACDCCCAABDDCCACDADDBCBAACCDBCBCDDDCAACCBAADCBBBCDCBBACBDCCDDADBABCAABBACABDCAACCBDADDCAAACCDBDBBCDDDDDACBCDDADDDDCBADADBDCADDABBCDAACBCCDDDADDADADAACCACDCDDABCCCADABBACDACCAADDBCBCCDADBCCADAAABDDDAABBABCADDCCAADDCDDCDCACBADADACADDAADCBDBCDBDDACDCBCDCCABBDCBACDDACCCDADBCADCACAAABBBCADDDDBCBACDBDAAADDDACCDACBBBADACCCDCACCBACDADBCBBDADACABAACBCCADDCCCCACCCCADBCCDAADCAABBABAADDBDADDABABCCABBCDDACCADAAADBBCCDBADCADCBBDADACCDDBCAAABBBDCAAAACBAADBABBABACDDBBCBDCDCADABABBDADCBADAACDBCBDABADBCBADCACADAABCDDCABACDDBDCBCBDCAAACBDABBCACBACCCBACACDCADBDCDCDDCAACDBDCBACDBBDAABDBBCBAAADBABDBAACAAACDCDAAABABDDDBCACADCBBAADCCDABCCCBBCACCBAABDAADDDCDACDDDBCDCCBABDABACCDCDCDABAABCABBADADCBDDACDDCDDCDACDADADCACBCDABABDDCCDBCCDABACDBDAABDBDDDBADDBACABDCDDBACDDBBDDBBACBCCAACABBDADDBCAACCBCCDADDBCAADDADCCCBAAABABBBBBCABAACADBCBBABACCABCDAABADCCCCDCCADDDCCABBDDDAAADDADACBBBCBDAADACABABBAACCCADADDABDBCADDDCCDBBCCBCDCDBDDDDCACDACDBBBDDBADDACADDADDABCACDCBBADDABBBDCBBDCDAABADDDDDBCACCCCAAACBCBCDBACCCDACCCDBCBDCBADBCDDACCDBDBDBCAAACDDCBAABDBCAADCADDBABABDCBCBCBBBCACBCADDCAAAAAACBBACBBCCACBDCDDDDADCAAACBABDDBDADBAADCBABDDBCDBABDBAADDDBACBBBCCCDBDDBDDAADBBADADDDCBCACBABCDBBABAADABCABCDBACBBBCDBADADDBDCBDABBDDDCDDCCACDCBDCADABAABCDCAACCDDBADBDBCDACAAACBCADCCCBAC"
	
	si Longitud(muestra)=9
		n=3
		Dimension matrizGenZ[n,n]
	SiNo
		si Longitud(muestra)=16
			n=4
			Dimension matrizGenZ[n,n]
		sino
			si Longitud(muestra)=1369 
				n=37
				Dimension matrizGenZ[n,n]
			FinSi
		FinSi
	FinSi
	
	rellenadoMatriz(matrizGenZ, muestra, n)
	escribirMatrizGenZ(matrizGenZ, n)
	Escribir "..."
	Escribir ""
	Result_DiagP = analizarGenZenDiagonalPrincipal(matrizGenZ, n, muestra)
	Escribir  Result_DiagP
	Result_DiagS = analizarGenZenDiagonalSecundaria(matrizGenZ, n, muestra)
	Escribir Result_DiagS
	Escribir ""
	GenZ = Result_DiagS y Result_DiagP
	Escribir "El resultado fue... " GenZ
	
FinAlgoritmo

////////////////////////////////////////////////////

SubProceso rellenadoMatriz(matrizGenZ, muestra, n)
	definir i,j, contadorCaracter Como Entero
	contadorCaracter=0
	para i=0 hasta n-1
		para j=0 hasta n-1
			matrizGenZ[i,j] = Subcadena(muestra, contadorCaracter, contadorCaracter)
			contadorCaracter = contadorCaracter+1
		FinPara
	FinPara
FinSubProceso

////////////////////////////////////////////////////

SubProceso escribirMatrizGenZ(matrizGenZ, n)
	definir i,j Como Entero
	para i=0 hasta n-1
		para j=0 hasta n-1
			escribir matrizGenZ[i,j] Sin Saltar
			
		FinPara
		escribir ""
	FinPara
FinSubProceso

////////////////////////////////////////////////////

// Veo en la diagonal principal si todos los caracteres son iguales

funcion diagonalPrincipal = analizarGenZenDiagonalPrincipal(matrizGenZ, n, muestra)
	
	definir diagonalPrincipal, resultado Como Logico
	definir i, j Como Entero
	Definir aComparar Como Caracter
	aComparar = matrizGenZ[0,0]
	escribir aComparar
	
	
	para i=0 hasta n-1
		si matrizGenZ[i,i] == aComparar
			resultado = Verdadero
		sino
			resultado = falso
			j=n-1
			i=n-1
	FinSi
	FinPara
//	para i=0 hasta n-1
//		para j=0 hasta n-1
//			si matrizGenZ[i,j] == aComparar
//				resultado = Verdadero
//			sino
//				resultado = falso
//				j=n-1
//				i=n-1
//			FinSi
//		FinPara
//	FinPara
	
	diagonalPrincipal = resultado
FinFuncion

////////////////////////////////////////////////////

funcion diagonalSecundaria = analizarGenZenDiagonalSecundaria(matrizGenZ, n, muestra)
	
	definir diagonalSecundaria, resultado Como Logico
	definir i, j Como Entero
	Definir aComparar Como Caracter
	resultado = falso

	aComparar = matrizGenZ[0,n-1]
	escribir aComparar
	resultado= Verdadero
	para i=0 hasta n-1 Hacer
		si matrizGenZ[i, n-1-i] <> aComparar
			resultado=Falso
		FinSi
	FinPara
	
	
	diagonalSecundaria = resultado
FinFuncion

	