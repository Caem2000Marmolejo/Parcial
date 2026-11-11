package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logica.Parcial;

public class testParcial {
		
		@Test
		public void testCalcularRaicesExitoso() throws Exception {
		Parcial p = new Parcial();	
		String resultado = p.calcularRaices(1, -5, 6);
		assertTrue(resultado.contains("3.0"));
		assertTrue(resultado.contains("2.0"));
		}
	
		@Test
		public void testAIgualACero() {
		Parcial p = new Parcial();
		try {
		p.calcularRaices(0, 2, 1);
		fail("Debió lanzar excepción");
		}
		catch (Exception e) {
		assertEquals("A no puede ser 0.", e.getMessage());
		}
		}
		@Test
		public void testRaicesComplejas() {
		Parcial p = new Parcial();
		try {
		p.calcularRaices(1, 2, 5);
		fail("Debio lanzar excepcion");
		} 
		catch (Exception e) {
		assertEquals("La ecuacion tiene raices complejas.",
		e.getMessage());
		}
		}
		@Test
		public void testRaizDoble() throws Exception {
		Parcial p = new Parcial();
		String resultado = p.calcularRaices(1, -2, 1);
		assertTrue(resultado.contains("1.0"));
		}
		}

