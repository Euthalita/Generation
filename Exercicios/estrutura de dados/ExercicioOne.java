import java.util.*;
import java.util.Scanner;

public class ExercicioOne {
    public static void main(String[] args) {
        Queue<String> clientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        System.out.println("1: Adicionar um novo Cliente na fila.\n" +
                "2: Listar todos os Clientes. \n" +
                "3: Retirar cliente da fila. \n" +
                "0: O programa deve ser finalizado. \n"+ "Digite uma opção:");
        escolha = scanner.nextInt();

        while (escolha !=0) {
            switch (escolha) {

                case 1:
                    System.out.println("Coloque o nome do cliente: ");
                    clientes.add(scanner.next());
                    break;
                case 2:
                    Iterator<String> iterator = clientes.iterator();
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case 3:
                    if(clientes.isEmpty()){
                        System.out.println("Fila vazia, não é possível retirar.");
                    }else{
                        clientes.poll();
                        System.out.println("Clientes na fila: "+clientes);
                    }
                    break;
                default:
                    System.out.println("Número incorreto, tente de novo.\n");
                    break;

            }
            System.out.println("\n1: Adicionar um novo Cliente na fila.\n" +
                    "2: Listar todos os Clientes. \n" +
                    "3: Retirar cliente da fila. \n" +
                    "0: O programa deve ser finalizado. \n"+ "Digite uma opção:");
            escolha = scanner.nextInt();
        }
        System.out.println("Programa finalizado!");
    }
}
