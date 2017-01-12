
import java.util.Scanner;

public class OperacionLogica {

	public static void main (String[] ar){
		
		Scanner teclado = new Scanner (System.in);
		
		float num1, num2, suma, resta, div, prod;
		
		System.out.println("Operaciones logicas de Suma, Resta, Producto y Division");
		
		System.out.print("Ingrese el 1er numero: ");
		num1 = teclado.nextFloat();
		
		System.out.print("Ingrese el 2do numero: ");
		num2 = teclado.nextFloat();
		
		suma = num1 + num2;
		System.out.println("La Suma entre " +num1+ " y "+num2+ " es igual a "+ suma);
		
		prod = num1 * num2;
		System.out.println("El Producto entre "+num1+" y "+num2+ " es igual a "+ prod);
		
			if ( num1 > num2){
			
				resta = num1 - num2;
				
				System.out.println("La Resta entre "+num1+ " y "+num2+ " es igual a "+ resta);
				
			}
			else{
					
				resta = num2 - num1;	
				
				System.out.println("La Resta entre "+num2+ " y "+num1+ " es igual a "+ resta);
			
			}			
			
			
				if (num2 == 0){
				
					System.out.println("No se puede dividir por 0");
				}
				else{
					
					div = num1 / num2;
					
					System.out.println("La Division entre "+num1+ " y "+num2+ " es igual a "+ div);
				}
			
			
	}
	
}
