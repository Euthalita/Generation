import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor [] = {2,5,1,3,4,9,7,8,10,6};
        int i, num, posicao = 0;


        System.out.println("Digite um número que você deseja encontrar: ");
        num = scanner.nextInt();

        for(i=0; i< vetor.length; i++){
            if(num == vetor[i]) {
                System.out.println("O número "+ num + " está localizado na posição: "+i);
                posicao = vetor[i];
            }
        }
        if(num != posicao){
            System.out.println("O número"+ num+ "não foi encontrado!");
        }
    }
}