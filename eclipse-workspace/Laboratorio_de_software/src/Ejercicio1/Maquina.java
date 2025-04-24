package Ejercicio1;
 
public interface Maquina {
	
	void arrancar();//Método abstracto para encender las máquinas
}

class SB100 implements Maquina{
	public void arrancar() {
		System.out.println("La primer máquina está encendida");
	}
}

class SB200 implements Maquina{
	public void arrancar() {
		System.out.println("La segunda máquina está encendida");
	}


}


