package Singleton;
public class Singleton {
// 1. Variable estática para almacenar la única instancia
private static Singleton instancia;
// 2. Constructor privado para evitar que se creen nuevas instancias
private Singleton() {}
// 3. Método estático que devuelve la única instancia (Lazy Initialization)
public static Singleton getInstancia() {
if (instancia == null) { // Si no existe, la creamos
instancia = new Singleton();
}
return instancia; // Si ya existe, la devolvemos
}
public void mostrarMensaje() {
System.out.println("¡Soy un Singleton!");
}
}