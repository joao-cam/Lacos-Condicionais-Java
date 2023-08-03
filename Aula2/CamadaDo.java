package JavaTech;

import java.util.Scanner;

public class CamadaDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0,soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				soma+= numero;
			}
		} while (numero != 0);
		      System.out.printf("\nA soma dos números positivos é: "+soma);
    }

}