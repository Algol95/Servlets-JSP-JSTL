package aplicacion.model;

public class Gofre {
	
	private String nombre;
	private String relleno;
	private String cubierta;
	private Double precio;

	public Gofre(String nombre, String relleno, String cubierta, double i) {
		super();
		this.nombre = nombre;
		this.relleno = relleno;
		this.cubierta = cubierta;
		this.precio = i;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRelleno() {
		return relleno;
	}

	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}

	public String getCubierta() {
		return cubierta;
	}

	public void setCubierta(String cubierta) {
		this.cubierta = cubierta;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Gofre [nombre=" + nombre + ", relleno=" + relleno + ", cubierta=" + cubierta + ", precio=" + precio
				+ "]";
	}
	

}
