package N201;

import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

/**
 * Defineix un Matcher personalitzat per a Hamcrest que proporcioni el Matcher
 * de longitud per a un String.
 * 
 * Volem usar la classe ->FeatureMatcher.
 * 
 * Amb FeatureMatcher podem ajustar un Matcher existent, decidir quin camp de
 * l'Objecte prova ha de coincidir i proporcionar un missatge d'error agradable.
 * El constructor de FeatureMatcher té els següents arguments en aquest ordre:
 * 
 * El matcher que volem embolicar. Una descripció de la funció que provem. Una
 * descripció del possible mismatch (desajustament). L'únic mètode que hem de
 * sobreescriure és featureValueOf (T actual), que retorna el valor que es
 * passarà al mètode match () / matchesSafely (). Utilitza el seu comparador
 * personalitzat en una prova per a comprovar si la cadena "Mordor" té una
 * longitud de 8.
 * 
 * Ajusta la prova si és necessari.
 *
 */

public class PruebaStringTest {

	//pruebas de hamcrest
	/*
	@Test
	public void testSameString() {

		PruebaString s = new PruebaString();
		s.setMensaje("Mordor");
		String resultado = s.getMensaje();
		String esperado = "Pepe";
		MatcherAssert.assertThat("Esperando recibir el mismo String", resultado, equalTo(esperado));
	}
	*/


	@Test
	public void testStringLength() {
		PruebaString s = new PruebaString();
		s.setMensaje("Mordor");
		String resultado = s.getMensaje();
		MatcherAssert.assertThat("Esperando recibir un String de 8 caracteres", resultado, length(is(8)));
		
	}

	public static FeatureMatcher<String, Integer> length(Matcher<? super Integer> matcher) {
		return new FeatureMatcher<String, Integer>(matcher, "la longitud esperada del String", "la longitud del String recibida") {
			@Override
			protected Integer featureValueOf(String actual) {
				return actual.length();
			}
		};
	}
}