import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        int[] vetor = new int [10] ;
        int []par = new int[5];
        int [] impar = new int[10];
        int i, cont=0, contPar=0, contImpar=0;
        float media=0,soma=0;
        Scanner scanner = new Scanner(System.in);

        for (i=0; i< vetor.length;i++){
            System.out.println("Coloque um número para armazenar no vetor: " );
            vetor[i]= scanner.nextInt();

            if(vetor[i] % 2 == 0){
                par[contPar] = vetor[i];
                contPar++;
            }else{
                impar[contImpar] = vetor[i];
                contImpar++;
            }
            soma += vetor[i];
            cont +=1;
        }

        System.out.println("Números pares: ");
        for (i=0;i< contPar; i++){
            System.out.print(par[i]+" ");
        }
        System.out.println("\nNúmeros impares: ");
        for (i=0;i< contImpar; i++){
            System.out.print(impar[i]+ " ");
        }

        media = soma/cont;
        System.out.println("\nSoma de todos os números: "+soma+"\nMédia de todos os números: "+media);
    }
}
