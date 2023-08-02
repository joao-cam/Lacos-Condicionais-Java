package JavaTech;

import java.util.Scanner;

public class Extra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		float salario,abono,novosalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.printf("O novo salário é de: "+novosalario);
	}

}
