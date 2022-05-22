package futbol;

// Clase
public class Jugador extends Futbolista {
	
	// Atributos.
	public short golesMarcados;
	public byte dorsal;
	
	// Constructor.
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	// Getters and Setters.
	public short getGolesMarcados() {
		return golesMarcados;
	}
	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	// Metodos.
	public boolean jugarConLasManos() {
		return false;
	}
	
	public int compareTo(Object f) {
		return Math.abs(this.getEdad() - ((Jugador)f).getEdad());
	}
	
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.getDorsal() + ". Ha marcado" + this.getGolesMarcados();
	}
	
}