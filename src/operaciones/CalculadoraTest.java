package operaciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora(20, 10);
		int resultado = calc.suma();
		assertEquals(30, resultado);

	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora(20, 10);
		int resultado = calc.resta();
		assertEquals(10, resultado);
	}

	@Test
	void testRestaA() {
		Calculadora calc = new Calculadora(10, 20);
		int resultado = calc.resta();
		assertEquals(10, resultado);
	}

	@Test
	void testMultiplica() {
		Calculadora calc = new Calculadora(20, 10);
		int resultado = calc.multiplica();
		assertEquals("Fallo en la multiplicación: ", 200, resultado);
	}

	@Test
	void testDivide() {
		Calculadora calc = new Calculadora(20, 10);
		int resultado = calc.divide();
		assertEquals(2, resultado);
	}

	@Test
	void testResta2() {
		Calculadora calc = new Calculadora(20, 10);
		boolean resultado = calc.resta2();
		assertTrue(resultado);
	}

	@Test
	void testResta2A() {
		Calculadora calc = new Calculadora(10, 20);
		boolean resultado = calc.resta2();
		assertFalse(resultado);
	}

	@Test
	void divide2() {
		Calculadora calc = new Calculadora(20, 0);
		Integer resultado = calc.divide2();
		assertNull(resultado);
	}
	
	@Test
	void divide2A() {
		Calculadora calc = new Calculadora(20, 10);
		Integer resultado = calc.divide2();
		assertNotNull(resultado);
	}

}
