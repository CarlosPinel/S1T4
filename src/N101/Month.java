package N101;

public class Month implements Comparable<Month> {

	// Attributes
	private String nombre;
	private int num;

	// Constructor
	public Month(String nombre, int num) {
		this.nombre = nombre;
		this.num = num;
	}

	// getters/setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	// Methods
	public String toString() {
		return "Mes: " + this.nombre + ". Numero: " + this.num;
	}

	// SelfCompareTo

	public int compareTo(Month m) {
		return Integer.compare(this.num, m.getNum());
	}
}
