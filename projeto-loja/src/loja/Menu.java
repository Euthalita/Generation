package loja;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int seletor;
        Scanner scanner = new Scanner(System.in);

        int codigo, qtd;
        String nome_produto;
        float preco;

        while (true) {
            System.out.println("Seja bem vindo á loja do 1 REAL!\nDigite a opção desejada!");
            System.out.println("1- Cadastrar produto\n" +
                    "2- Listar produtos\n" +
                    "3- Buscar produto\n" +
                    "4- Atualizar dados dos produtos\n" +
                    "5- Apagar produto\n" +
                    "6- Comprar produto\n" +
                    "7- Adicionar novo produto\n" +
                    "8- Sair\n" +
                    "********************************************\n" +
                    "Entre com uma opção: \n");
            seletor = scanner.nextInt();

            switch (seletor) {
                case 1:
                    System.out.println("Cadastrar produto: ");
                    keyPress();
                    break;
                case 2:
                    System.out.println("Listar produtos:");
                    keyPress();
                    break;
                case 3:
                    System.out.println("Buscar produto");
                    keyPress();
                    break;
                case 4:
                    System.out.println("Atualizar dados dos produtos");
                    keyPress();
                    break;

                case 5:
                    System.out.println("Apagar produto");
                    keyPress();

                    break;
                case 6:
                    System.out.println("Comprar produto");
                    keyPress();
                    break;

                case 7:
                    System.out.println("Adicionar novo produto");
                    keyPress();
                    break;
                case 8:
                    System.out.println("Programa finalizado!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!\n Tente novamente!");

            }

        }

    }

    public static void keyPress() {

        try {

            System.out.println("\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
}