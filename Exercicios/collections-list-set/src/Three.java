import java.util.*;

public class Three {
    public static void main(String[] args) {
        int num;
        Scanner scanner =  new Scanner(System.in);
        Set<Integer> number = new HashSet<>();

        System.out.println("Digite 10 valores inteiros sem repeti-los: ");
        while(number.size()<10){
            System.out.println("Digite um número: ");
            num = scanner.nextInt();

            if (number.add(num)) {
                System.out.println("Valor adicionado: " + number);
            } else {
                System.out.println("Valor já existe no conjunto. Tente outro.");
            }
        }

        Iterator<Integer> numero = number.iterator();

        while (numero.hasNext()){
            System.out.println("Listar dados do set: " + numero.next());
        }

        scanner.close();
    }
}
