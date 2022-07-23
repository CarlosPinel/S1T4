/**
 * 
 */
package N103;

import org.junit.Test;

public class ClasePruebaTest {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testThrowsArrayIndexException() {
		
		ClasePrueba.ArrayIndexException();
	}
}
