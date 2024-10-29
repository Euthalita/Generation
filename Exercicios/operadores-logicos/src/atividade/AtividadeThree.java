package atividade;

import java.util.Scanner;

public class AtividadeThree {
	public static void main(String[] args) {
		double salario, adicional, hora_extra, desconto, salario_liquido;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Coloque o salário bruto: ");
		salario = scanner.nextDouble();
		
		System.out.println("Coloque o adicional noturno:");
		adicional = scanner.nextDouble();
		
		System.out.println("Coloque as horas extras:");
		hora_extra = scanner.nextDouble();
		
		System.out.println("Coloque o desconto:");
		desconto = scanner.nextDouble();
		
		salario_liquido = salario + adicional+ (hora_extra*5)- desconto;
		 System.out.println("\nO salário liquido é: "+ salario_liquido);
		scanner.close();
	}
}
