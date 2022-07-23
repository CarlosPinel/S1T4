package N101;

import java.util.TreeSet;

/**
 * Crea una classe Java que insereixi en una llista ordenada els noms dels mesos
 * de l'any. Verifica amb jUnit que la llista té 12 posicions, que no és nul·la
 * i que en la seva posició 8 conté el nom 'agost'.
 *
 */

public class MonthsManager {

	// Para que no acepte duplicados y tenga un orden definido, TreeSet de objeto Month

	public static TreeSet<Month> crearTSmonths() {

		TreeSet<Month> monthsTS = new TreeSet<Month>();
		
		Month month1 = new Month("Enero",1);
		monthsTS.add(month1);
		Month month2 = new Month("Febrero",2);
		monthsTS.add(month2);
		Month month3 = new Month("Marzo",3);
		monthsTS.add(month3);
		Month month4 = new Month("Abril",4);
		monthsTS.add(month4);
		Month month5 = new Month("Mayo",5);
		monthsTS.add(month5);
		Month month6 = new Month("Junio",6);
		monthsTS.add(month6);
		Month month7 = new Month("Julio",7);
		monthsTS.add(month7);
		Month month8 = new Month("Agosto",8);
		monthsTS.add(month8);
		Month month9 = new Month("Septiembre",9);
		monthsTS.add(month9);
		Month month10 = new Month("Octubre",10);
		monthsTS.add(month10);
		Month month11 = new Month("Noviembre",11);
		monthsTS.add(month11);
		Month month12 = new Month("Diciembre",12);
		monthsTS.add(month12);
		
		for(Month month : monthsTS) {
		System.out.println(month.getNombre());
		}
		return monthsTS;
	}
}
