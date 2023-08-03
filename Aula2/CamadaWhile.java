package JavaTech;

import java.util.Scanner;

public class CamadaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,Menor21=0,Maior50=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("\nEntre com uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0) {
				Menor21++;
			}
			else if (idade >50) {
				Maior50++;
			}
			else if(idade < 0) {
				break;
			}
		}
		System.out.printf("\nTotal de pessoas menores de 21 anos: "+Menor21);
		System.out.printf("\nTotal de pessoas menores de 21 anos: "+Maior50);
	}

}
