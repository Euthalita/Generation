import java.util.Scanner;

public class ExercicioFive {
    public static void main(String[] args) {
        int num, soma=0, negativo=0;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Digite um número:");
            num = scanner.nextInt();

            if(num >0){
                soma += num;
            }else{
                negativo += num;
            }
        } while(num !=0);

        System.out.println("Soma dos numeros positivos: "+soma+"\nSoma dos números negativos: "+negativo);
    }
}
