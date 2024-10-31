import java.util.Scanner;

public class ExercicioSix {
    public static void main(String[] args) {
        int num,cont=0, soma=0;
        float media=0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite um número: ");
            num = scanner.nextInt();

            if(num % 3 == 0){
                cont +=1;
                soma +=num;
                media = soma/cont;
            }
        }while(num != 0);

        System.out.println("A média de todos os números múltiplos de 3 é: "+media);
    }
}
