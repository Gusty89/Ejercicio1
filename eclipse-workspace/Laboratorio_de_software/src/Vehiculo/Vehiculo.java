package Vehiculo;
class Vehiculo {     
	public void arrancar() {         
		System.out.println("El vehículo está arrancando...");     
} } 
class Auto extends Vehiculo {     
	// ERROR: No se puede sobreescribir un método final 
	public void arrancar() {         
	System.out.println("El auto está arrancando...");     
	} 
} 