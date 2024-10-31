import java.util.Scanner;

public class ExercicioOne {
    public static void main(String[] args) {
        int num1, num2, i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        num1 = scanner.nextInt();

        System.out.println("Digite um número:");
        num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("Código inválido!");
        }else{
            for(i=num1; i<=num2; i++){
                if(i%3==0 && i%5==0){
                    System.out.println(i+ " é multiplo de 3 e 5");
                }
            }
        }


    }
}
