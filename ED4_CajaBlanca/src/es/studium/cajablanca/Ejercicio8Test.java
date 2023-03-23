package es.studium.cajablanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio8Test
{

	@Test
	void camino1()
	{
		int resultadoEsperado = 3;
		int resultadoReal = Ejercicio8.posicion("p", "pepe");
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	void camino2()
	{
		int resultadoEsperado = 0;
		int resultadoReal = Ejercicio8.posicion("p", "maria");
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	void camino3()
	{
		int resultadoEsperado = 0;
		int resultadoReal = Ejercicio8.posicion("p", " ");
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
