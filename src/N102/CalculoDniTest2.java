package N102;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CalculoDniTest2 {

	@Parameters
	public static Collection<Object[]> data(){
		
		return Arrays.asList(new Object[][] {
			{83262094, 'R'},
			{91147159, 'E'},
			{41536053, 'P'},
			{16644302, 'F'},
			{63115447, 'C'},
			{86193278, 'L'},
			{12500503, 'A'},
			{16423598, 'B'},
			{21778625, 'V'},
			{99506413, 'H'},
		});
	}
	
	private CalculoDni calculoDni;
	private int numDni;
	private char letraDniEsperada;
	
	public CalculoDniTest2(int numDni, char letraDniEsperada) {
		this.numDni = numDni;
		this.letraDniEsperada = letraDniEsperada;
		this.calculoDni = new CalculoDni();
	}
	
	@Test
	public void test() {
		char letraDniResultado = calculoDni.calcularLetraDni(numDni);
		Assert.assertEquals(letraDniResultado, letraDniEsperada);
		
	}

}
