package JavaTech;

import java.util.Scanner;

public class CamadaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEntre com o primeira número: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2 = leia.nextInt();
		
		if(n1 > n2) {
			System.out.println("\nIntervalo inválido, entre com outro número: ");
			
		}
		for (int i = n1; i < n2; i++ ) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.printf("\n"+i+" é um número divisível por 3 e 5. ");
				
			}
		}
		
		
	}

}
