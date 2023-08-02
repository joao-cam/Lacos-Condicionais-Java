package JavaTech;

import java.util.Scanner;

public class Lacocondicionalif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número "+numero+" é par ");
		} else {
			System.out.println("O número "+numero+" é ímpar ");
		}
		
		if (numero>= 0) {
			System.out.println("e positivo ");
		} else {
			System.out.println("e negativo ");
		}
		
	}

}
