
public class Coche {
        
	
	
	//Atributos
	
	Integer cilindrada;
	String color;
	Double precio;
	boolean isArrancado;
	
	
	
	public void arrancar() {
		
		
		if (isArrancado != true) {
		isArrancado = true;
		System.out.println ("Brrrrrr!!! El coche acaba de arrancar.");
		
		} else {
			
		System.out.println ("Kisch, kishch!!! El coche ya est� arrancado.");
		
		
		}
	}
	
	public void verCoche() {
		System.out.println("Este coche es de color " + color + " tiene una cilindrada de " +
		cilindrada + " y cuesta " + precio + " euros.");
		
		
		if (isArrancado == true) {
		System.out.println ("Ahora mismo est� arrancado.");
		} else {
		System.out.println ("Ahora mismo est� parado.");
		}
	}
	
	
}
