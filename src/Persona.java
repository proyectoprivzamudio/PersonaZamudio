import java.sql.Date;

public class Persona {
	// Atributos
	private String nombre;
	private Date fechaNac;
	private int anno;

	// Constructor
	public Persona(String nombre, Date fechaNac, int anno) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.anno = anno;
	}

	//Metodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	@Override
	public String toString() {
		return "Nombree: "+this.nombre+"\nFecha Nacimiento: "+this.fechaNac+"\nAño: "+this.anno;
	}

}
