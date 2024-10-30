import java.util.Scanner;

public class ExercicioTwo {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque um número: ");
        number = scanner.nextInt();

        if(number < 0){
            if(number % 2 == 0){
                System.out.println("O número "+number+" é par e negativo");
            }else{
                System.out.println("O número "+number+" é impar e negativo");
            }
        }else if (number == 0) {
            System.out.println("0 é um número neutro");
        }else{
            if(number % 2 != 0 ){
                System.out.println("O número "+number+" é impar e positivo");
            }else{
                System.out.println("O número "+number+" é impar e positivo");
            }
        }
    }
}
