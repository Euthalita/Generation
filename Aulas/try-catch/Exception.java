import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int dividendo = 0;
        int divisor = 0;
        boolean loop = true;

        do {
            try{
                System.out.println("Digite o dividendo: ");
                dividendo = scanner.nextInt();

                System.out.println("Digite o divisor: ");
                divisor = scanner.nextInt();
                divide(dividendo, divisor);
            } catch(InputMismatchException e){
                System.err.println("\nExceção: " + e);
                scanner.nextLine();
                System.out.println("Digite apenas números inteiros!");
            }

        }while(loop);

    }

    public static  void divide(int dividendo, int divisor){
        System.out.println("Divisão = "+(dividendo/divisor));
    }
}
