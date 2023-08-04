package JavaTech;

import java.util.Scanner;

public class ExVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vet = {2,5,1,3,4,9,7,8,10,6};
		int numero,x=0;
		boolean resposta = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota:");
		numero = leia.nextInt();
		
		for(x=0;x<vet.length;x++) {
			if (numero == vet[x]) {
				System.out.printf("\nO valor " +numero+ " está localizado na posição: "+x);
				resposta = true;
			}
		}if (!resposta ) {
			System.out.printf("\nO número " +numero+ " não foi encontrado no vetor: ");
		}
		
		
		

	}

}
