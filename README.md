# Metodos_de_busqueda
Metodos_de_busqueda


Proceso Busqueda_Binaria
	
	Pointer <- 1
	Final <- 5
	Dimension vec[5]
	vec[1] <- 3
	vec[2] <- 8
	vec[3] <- 11
	vec[4] <- 22
	vec[5] <- 13
	Encontrar <- Falso
	Escribir "Ingresar numero porfavor"
	Leer numero
	
	Mientras (Encontrar = Falso y Pointer <- Final) Hacer
		mitad <- trunc( (Pointer + Final) / 2 )
		
		Si numero = vec[mitad] Entonces
			Encontrar <- Verdadero
		Sino Si numero < vec[mitad] Entonces
				Final <- mitad - 1	
			SiNo
				Pointer <- mitad +1
			Fin si
		FinSi
	FinMientras
	
	Si (Encontrar = Verdadero) Entonces
		Escribir "El dato se encuentra en la posición " , mitad
	Sino 
		Escribir "DATO NO ENCONTRADO!"
	FinSi
FinProceso	



-------------------------------------------------------------------------


Proceso Busqueda_Secuencial 
	
	i <- 0
	Dimension vec[5]
	Encontrar <- Falso
	
	Para i <- i Hasta 5 Hacer
		vec[i] <- Azar(100)
	FinPara
	Escribir "Ingrese un número"
	Leer numero
	
	Mientras no Encontrar y i < 5 Hacer
		
		Si numero = vec[i] Entonces
			Encontrar <- Verdadero
			Position <- i
		FinSi
		i <- i + 1
	FinMientras
	
	Si Encontrar Entonces
		Escribir "El numero seleccionado esta en la posición: " , Position
	FinSi
FinProceso	
