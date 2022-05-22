package futbol;

//Clase.
public abstract class Futbolista implements Comparable<Object> {
	
	// Atributos.
	private String nombre;
	private int edad;
	private String posicion;
	
	// Contructor.
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	// Getters and Setters.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	// Metodos.
	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion();
	}
	
	public boolean equals(Futbolista f) {
		return super.equals(f);
	}
	
	public abstract boolean jugarConLasManos();
	
}