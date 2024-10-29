package atividade;

import java.util.Scanner;

public class AtividadeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] notas = new double [4]; 
		double soma = 0, media;
		int i;
		
		Scanner ler =  new Scanner(System.in);
			
		for (i=0; i< notas.length; i++) {
			System.out.println("Coloque a "+(i+1)+"º nota: ");
			notas[i] = ler.nextDouble();
			soma += notas[i];
		}
		
		
		media = soma / notas.length;
		System.out.println("Sua média final é igual á: "+media);
		
		ler.close();
	}

}
