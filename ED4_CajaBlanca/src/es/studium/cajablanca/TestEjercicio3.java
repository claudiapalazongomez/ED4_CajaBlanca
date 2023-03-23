package es.studium.cajablanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEjercicio3
{

	@Test
	void Camino1()
	{
		String resultadoEsperado = "La edad debe ser un número positivo.";
		String resultadoReal = Ejercicio3.edadPerro(-1);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	void Camino2()
	{
		String resultadoEsperado = "La edad es 10.5";
		String resultadoReal = Ejercicio3.edadPerro(1);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	void Camino3()
	{
		String resultadoEsperado = "La edad es 25.0";
		String resultadoReal = Ejercicio3.edadPerro(3);
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
