package JavaTech;

import java.util.Scanner;

public class LacocondicionalSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int cargo;
		float salario;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o Nome do colaborador: ");
		nome = ler.nextLine();
		System.out.println("Digite o cargo: ");
		cargo = ler.nextInt();
		System.out.println("\nEntre com o salário: ");
		salario = ler.nextFloat();
		
		
		switch(cargo) {
		case 1:
			System.out.printf("Digite o nome do colaborador: "+nome+" \nCargo Gerente\nValor do salário: %.2f",(salario + ((salario*10)/100)));
		break;
		case 2:
			System.out.printf("Digite o nome do colaborador: "+nome+" \nCargo Vendedor\nValor do salário: %.2f",(salario + ((salario*7)/100)));
		break;
		case 3:
			System.out.printf("Digite o nome do colaborador: "+nome+" \nCargo Supervisor\nValor do salário: %.2f",(salario + ((salario*9)/100)));
		break;
		case 4:
			System.out.printf("Digite o nome do colaborador: "+nome+" \nCargo Motorista\nValor do salário: %.2f",(salario + ((salario*6)/100)));
		break;
		case 5:
			System.out.printf("Digite o nome do colaborador: "+nome+" \nCargo Estoquista\nValor do salário: %.2f",(salario + ((salario*5)/100)));
		break;
		case 6:
			System.out.printf("Digite o nome do colaborador: "+nome+" \nCargo Técnico de TI\nValor do salário: %.2f",(salario + ((salario*8)/100)));
		break;
		
		}
	}

}
