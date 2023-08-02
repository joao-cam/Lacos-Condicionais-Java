package JavaTech;

import java.util.Scanner;

public class LacocondicionalSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigoproduto,quantidade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		codigoproduto = ler.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		quantidade = ler.nextInt();
		
		
		switch(codigoproduto) {
		case 1:
			System.out.println("Produto: Cachorro Quente\nValor total de: "+10*quantidade);
		break;
		case 2:
			System.out.println("Produto: X-Salada\nValor total de: "+15*quantidade);
		break;
		case 3:
			System.out.println("Produto: X-Bacon\nValor total de: "+18*quantidade);
		break;
		case 4:
			System.out.println("Produto: Bauru\nValor total de: "+12*quantidade);
		break;
		case 5:
			System.out.println("Produto: Refrigerante\nValor total de: "+8*quantidade);
		break;
		case 6:
			System.out.println("Produto: Suco de laranja\nValor total de: "+13*quantidade);
		break;
		}
			
	}

}
