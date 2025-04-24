package Ejercicio1;
import java.util.ArrayList; 
import java.util.List;	

//Clase genérica del Depósito 
class Deposito<T> {     
	private List<T> lista = new ArrayList<>();      
	public void agregar(T i) {         
		lista.add(i);     
		}      
	public List<T> obtenerTodos() {
		return lista;     
		}
	 
	} 

//Clase para la mercaderia que tengo en el depósito
class Ingredientes{
	private String nombre;
	private int cantidad;
	private String unidad;
	
	//Creo el constructor para los ingredientes
	
	public Ingredientes(String nombre, int cantidad, String unidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.unidad = unidad;
	}

	 @Override     
	 public String toString() {
		 return "Producto nombre: " + nombre + ", Cantidad: " + cantidad + "Unidades: " + unidad; 
	 }
	 
	//Creo los getters
		
		public String getNombre() {
			return nombre;
		}
		public float getCantidad() {
			return cantidad;
		}
		public String getUnidad() {
			return unidad;
		}
		
	public void mostrarLista() {
		System.out.println("Ingrediente: " + nombre + " // Cantidad: " + cantidad + " // Unidad: " + unidad);
	}
	
}
