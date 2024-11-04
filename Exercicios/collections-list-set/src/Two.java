import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>(Arrays.asList(2,3,5,1,9,6,1,8,4,7));

        System.out.println("Digite o número que você deseja encontrar: ");
        num = scanner.nextInt();

        if(lista.contains(num)){
            System.out.println("O número "+num+ " está localizado na posição: "+ lista.indexOf(num));
        }else{
            System.out.println("O número "+num+ " não foi encontrado!");
        }
    }
}
