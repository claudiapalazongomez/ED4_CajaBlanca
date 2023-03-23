package es.studium.cajablanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEjercicio1
{

	@Test
	void camino1() //copiamos este m�todo y le cambiamos el nombre por tantos caminos que tengamos
	{
		//Mismo tipo de dato que nos devuelve el m�todo (en este caso boolean)
		//CajaBlanca c = new CajaBlanca(); y en resultadoReal pondriamos c.esPar(2)
		boolean resultadoEsperado = true;
		boolean resultadoReal = Ejercicio1.esPar(2); //debemos llamar al m�todo de la clase y la podemos llamar porque es static (si no fuera static, instanciamos un objeto dentro de este m�todo)
		assertEquals(resultadoEsperado, resultadoReal); //m�todo de JUnit al que le pasamos las variables y las compara
	}
	
	@Test
	void camino2() 
	{
		boolean resultadoEsperado = false;
		boolean resultadoReal = Ejercicio1.esPar(3);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
