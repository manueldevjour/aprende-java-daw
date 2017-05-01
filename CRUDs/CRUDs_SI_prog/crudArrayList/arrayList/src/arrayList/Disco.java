package arrayList;

public class Disco {

	private String marca;
	private String almacenamiento;
	private String tipo;
	private String conexion;
	private float precio;
	
	public Disco(String m, String a, String t, String c, float p) {
		this.marca = m;
		this.almacenamiento = a;
		this.tipo = t;
		this.conexion = c;
		this.precio = p;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getConexion() {
		return conexion;
	}

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
