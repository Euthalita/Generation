import java.util.Scanner;

public class ExercicioTwo {
    public static void main(String[] args) {
        int i, par=0, impar=0;
        int [] number  = new int [11];

        Scanner scanner = new Scanner(System.in);

        for (i=1; i < number.length; i++) {
            System.out.println("Digite o " + i + "º número: ");
            number[i] = scanner.nextInt();

            if(number[i] % 2 == 0) {
                par += 1;
            }else {
                impar += 1;
            }
        }
        System.out.println("Total de números pares: "+par+ "\nTotal de números pares: "+impar);
    }
}



