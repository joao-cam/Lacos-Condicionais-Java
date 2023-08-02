package JavaTech;

import java.util.Scanner;

public class Lacocondicionalif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A,B,C;
		int soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nAdicione o valor de A: ");
			A = (int) leia.nextFloat();
		System.out.println("\nAdicione o valor de B: ");
			B = (int) leia.nextFloat();
		System.out.println("\nAdicione o valor de C: ");
			C = (int) leia.nextFloat();
			
		soma = A + B;
		 if (soma >C)
		 System.out.println("\n A soma de A + B é maior que C ");
			 
		 else if (soma <C)
		 System.out.println("\nA soma de A + B é menor que C ");
		 
		 else
			 System.out.println("\nA soma será igual a C ");
			 
		 
		 }

}
