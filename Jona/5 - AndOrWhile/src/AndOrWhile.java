import java.util.Scanner;

public class AndOrWhile {

		public static void main (String[] ar){
			
			Scanner teclado = new Scanner (System.in);
			int num1 = 1; 
			int num2 = 1;
			
			System.out.println("Se pedira 2 numeros enteros iguales positivos, ingrese en los dos 0 para finalizar o un numero negaivo");
			
			while (num1 != 0 && num2 != 0 || num1 < 0 && num2 < 0){
				
				System.out.print("Ingrese el 1er numero: ");
				num1 = teclado.nextInt();
				
				System.out.print("Ingrese el 2do numero: ");
				num2 = teclado.nextInt();
				
				
			if (num1 != num2){
					
				System.out.println("Usted ingreso dos numeros distintos, vuelva a ingresar los numeros");
				System.out.println("esta vez que sean iguales GIL");	
			}else{
				
				
				if (num1 == num2 && num1 == 0){
					
					System.out.println("Usted selecciono la opción de salir, gracias por su tiempo");	
				}else{
				
					if (num1 == num2 && num1 < 10 && num2 > 0){
					
						System.out.println("Numeros iguales ingresados menores que 10 y mayores que 0");
					
					}else{
					
						if (num1 == num2 && num1 > 10){
						
							System.out.println("Numeros iguales ingresados mayores que 10");
						}
						}		
						}		
				}	
			}	
		}
}
