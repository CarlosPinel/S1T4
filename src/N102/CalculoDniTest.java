package N102;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoDniTest {

	@Test
	public void testcalcularLetraDni1() {
		char resultado = CalculoDni.calcularLetraDni(83262094);
		char esperado = 'R';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
	
	@Test
	public void testcalcularLetraDni2() {
		char resultado = CalculoDni.calcularLetraDni(91147159);
		char esperado = 'E';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
	
	@Test
	public void testcalcularLetraDni3() {
		char resultado = CalculoDni.calcularLetraDni(41536053);
		char esperado = 'P';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
	
	@Test
	public void testcalcularLetraDni4() {
		char resultado = CalculoDni.calcularLetraDni(16644302);
		char esperado = 'F';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
	
	@Test
	public void testcalcularLetraDni5() {
		char resultado = CalculoDni.calcularLetraDni(63115447);
		char esperado = 'C';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
	
	@Test
	public void testcalcularLetraDni6() {
		char resultado = CalculoDni.calcularLetraDni(86193278);
		char esperado = 'L';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
	
	@Test
	public void testcalcularLetraDni7() {
		char resultado = CalculoDni.calcularLetraDni(12500503);
		char esperado = 'A';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
	
	@Test
	public void testcalcularLetraDni8() {
		char resultado = CalculoDni.calcularLetraDni(16423598);
		char esperado = 'B';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
	
	@Test
	public void testcalcularLetraDni9() {
		char resultado = CalculoDni.calcularLetraDni(21778625);
		char esperado = 'V';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
	
	@Test
	public void testcalcularLetraDni10() {
		char resultado = CalculoDni.calcularLetraDni(99506413);
		char esperado = 'H';
		assertEquals("Letra correspondiente", esperado, resultado);
	}
}
