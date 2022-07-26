package N102;



/**
 * Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre
 * el n�mero com a par�metre. 
 * Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perqu� el test rebi un espectre de
 * dades ampli i validi si el c�lcul �s correcte per a 10 n�meros de DNI
 * predefinits.
 *
 */

public class CalculoDni {

	public Character calcularLetraDni(int numDni) {
		
		// Datos
        int numClave = 0;
        char letraDni = '*';
        // Logica
        numClave = numDni % 23;
        char [] letrasDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        letraDni = letrasDNI[numClave];
        return letraDni;
	}
}
