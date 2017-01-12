
import java.util.Scanner;

public class NotaPromedio {

	public static void main (String[] ar ){
		
		Scanner teclado = new Scanner (System.in);
		
		int i;
		float num1 = 0;
		
		System.out.println("A continuación se pediran 3 notas, las cuales se promediaran y se informara el promedio");
		
		for (i = 1; i < 4 ; i++){
			
			System.out.print("Ingrese la nota N°" + i +": ");
			num1 = num1 + teclado.nextFloat();
			
		}
		
		num1 = num1 / (i-1);
		
		if ( num1 >= 7){
			
			System.out.println("El promedio es "+num1+", promociono.");
			
		}else{ 
				if (num1 >= 4 ){
			
					System.out.println("El promedio es "+num1+", va a final.");
			
				}else{
			
				System.out.println("El promedio es "+num1+", debe recursar.");
				}
		}
		
		
	}
	
}
