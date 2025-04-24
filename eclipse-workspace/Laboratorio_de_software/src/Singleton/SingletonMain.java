package Singleton;
public class SingletonMain {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstancia();
		Singleton s2 = Singleton.getInstancia();
		s1.mostrarMensaje(); // ¡Soy un Singleton!
		// Comprobamos que es la misma instancia
		System.out.println(s1 == s2); // true
	}
}