
public class Objeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un objeto de la clase Coche
		Coche c;		
		//Importante el new Coche(), para darle valor. Por defecto el valor es null.
		
		c = new Coche();
		//Declaramos los atributos 
		c.cilindrada= 1800;
		c.color = "plata";
		c.precio = 25000.0;
		
		
		
		
		System.out.println ("¿Qué coche es este?");
		c.verCoche();
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();
		System.out.println ("¿Qué coche es este?");
		c.verCoche();
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();
		
		
		Coche b = new Coche();
		
		b.cilindrada=2100;
		b.color = "rojo";
		b.precio= 32000.0;
		
		System.out.println ("¿Qué coche es este?");
		b.verCoche();
		System.out.println("Vamos a arrancar el coche");
		b.arrancar();
		System.out.println ("¿Qué coche es este?");
		b.verCoche();
		System.out.println("Vamos a arrancar el coche");
		b.arrancar();
		
	}

}
