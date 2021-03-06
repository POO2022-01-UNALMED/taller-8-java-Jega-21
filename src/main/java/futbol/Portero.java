package futbol;

// Clase.
public class Portero extends Futbolista {
	
	// Atributos.
	public short golesRecibidos;
	public byte dorsal;
	
	// Contructor.
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	// Getters and Setters.
	public short getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
	// Metodos.
	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.getDorsal() + ". Le han marcado " + this.getGolesRecibidos();
	}
	
	@Override
	public int compareTo(Object f) {
		return Math.abs(this.getGolesRecibidos() - ((Portero)f).getGolesRecibidos());
	}
	
	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
}