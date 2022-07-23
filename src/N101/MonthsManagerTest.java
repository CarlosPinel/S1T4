package N101;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

public class MonthsManagerTest {

	static TreeSet<Month> monthsTest = new TreeSet<Month>();

	// Comprobacion de que la lista de meses tiene 12 posiciones
	@Test
	public void testCrearTSmonths1() {

		monthsTest = MonthsManager.crearTSmonths();
		int resultado = monthsTest.size();
		int esperado = 12;
		assertEquals("deben haber 12 meses", esperado, resultado);
	}

	// Comprobacion de la lista no es nula
	@Test
	public void testCrearTSmonths2() {

		monthsTest = MonthsManager.crearTSmonths();
		boolean esperado = (monthsTest != null);
		assertTrue("la lista no debe ser nula", esperado);
	}

	// Comprobacion de que en la posicion 8 est� el nombre de Agosto
	// Pasar TreeSet a ArrayList para obtener lista por indice.
	@Test
	public void testCrearTSmonths3() {
		monthsTest = MonthsManager.crearTSmonths();
		ArrayList<Month> monthsAL = new ArrayList<Month>(monthsTest);
		String resultado = monthsAL.get(7).getNombre();
		String esperado = "Agosto";
		assertEquals("el mes 8 debe ser Agosto", esperado, resultado);
	}
}