import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Four {
    public static void main(String[] args) {
        Integer num [] = {9,7,1,20,2,8,6,4,3,10};
        int numero;
        Set<Integer> number = new HashSet<>(Arrays.asList(num));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que você deseja encontrar: ");
        numero = scanner.nextInt();


            if (number.contains(numero)) {
                System.out.println("O número "+ numero +" foi encontrado!");
            }else {
                System.out.println("Numéro não encontrado!");
            }
        }


    }

