package atividade;

import java.util.Scanner;

public class AtividadeOne {
	public static void main(String[] args) {
		float salario, abono, novo_Salario;
		
		Scanner ler =  new Scanner(System.in);

		System.out.println("Digite o salário:");
		salario = ler.nextFloat();
		
		System.out.println("Digite o abono:");
		abono = ler.nextFloat();
		
		novo_Salario = salario + abono;
		
		System.out.println("Seu novo salario é: R$ "+ novo_Salario);
		
	}

}
