package atividade;

import java.util.Scanner;

public class AtividadeFour {
	public static void main(String[] args) {
		double n1, n2, n3, n4, calculo;
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Insira o 1º número: ");
		n1 = scanner.nextDouble();
		
		System.out.println("Insira o 2º numero:");
		n2 = scanner.nextDouble();
		
		System.out.println("Insira o 3º numero:");
		n3 = scanner.nextDouble();
		
		System.out.println("Insira o 4º numero:");
		n4 = scanner.nextDouble();
		
		calculo = (n1*n2)-(n3*n4);
		
		System.out.println("Diferença: "+ calculo);
		
	}
}
