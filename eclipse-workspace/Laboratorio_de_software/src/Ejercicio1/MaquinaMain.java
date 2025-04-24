package Ejercicio1;
import java.util.ArrayList; 
import java.util.List;
public class MaquinaMain{
	public  static void main(String[] args) {
		Maquina SB100 = new SB100();
		Maquina SB200 = new SB200();
		
		SB100.arrancar();
		SB200.arrancar();
		
		Deposito<Ingredientes> ingrediente = new Deposito<>();
		//Agregar ingredientes
		ingrediente.agregar(new Ingredientes("Frutas frescas", 500, "gr"));
		ingrediente.agregar(new Ingredientes("Leche", 250, "ml"));
		ingrediente.agregar(new Ingredientes("Sumplementos Proteícos", 700, "gr"));
		
		//Creo un for para mostrar los ingredientes
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Lista de ingredientes");
		System.out.println("--------------------------------------------------------------------");
       for(Ingredientes i : ingrediente.obtenerTodos()) {
    	   i.mostrarLista();
    	   System.out.println("--------------------------------------------------------------------");
       }
		
	}
}