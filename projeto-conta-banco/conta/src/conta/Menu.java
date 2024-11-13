package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
    public static void main(String[] args) {
        int seletor;
        Scanner scanner = new Scanner(System.in);
        ContaController contas = new ContaController();

        int opcao, numero, agencia, tipo, aniversario;
        String titular;
        float saldo, limite;


        while (true) {
            System.out.println("********************************************\n" +
                    "            BANCO SOULAR            \n" +
                    "********************************************\n" +
                    "         Olá! Seja bem vindo!\n" +
                    "1- Criar uma conta\n" +
                    "2- Listar todas as contas\n" +
                    "3- Buscar conta por número\n" +
                    "4- Atualizar dados da conta\n" +
                    "5- Apagar conta\n" +
                    "6- Sacar\n" +
                    "7- Depositar\n" +
                    "8- Transferir valores entre contas\n" +
                    "9- Sair\n" +
                    "********************************************\n" +
                    "Entre com uma opção: \n"

            );
            seletor = scanner.nextInt();

            switch (seletor) {
                case 1:
                    System.out.println("Criar conta: ");
                    agencia = scanner.nextInt();
                    System.out.println("Digite o Nome do Titular: ");
                    scanner.skip("\\R?");
                    titular = scanner.nextLine();

                    do{
                        System.out.println("Digite o tipo da conta: \n1-Conta Corrente\n2-Conta Poupança");
                        tipo = scanner.nextInt();
                    }while(tipo <1 && tipo >2);

                    System.out.println("Digite o saldo da conta: ");
                    saldo = scanner.nextFloat();

                    switch (tipo){
                        case 1 -> {
                            System.out.println("Digite o limite do crédito: ");
                            limite = scanner.nextInt();
                            contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
                        }
                        case 2 -> {
                            System.out.println("Digite o dia do Aniversário da conta: ");
                            aniversario = scanner.nextInt();
                            contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
                        }
                    }
                    keyPress();
                    break;

                case 2:
                    System.out.println("Listar todas as contas: ");
                    contas.listarTodas();
                    keyPress();
                    break;
                case 3:
                    System.out.println("Buscar conta!");
                    keyPress();
                    break;
                case 4:
                    System.out.println("Atualizar os dados da conta: ");
                    break;
                case 5:
                    System.out.println("Apagar conta: ");
                    break;
                case 6:
                    System.out.println("Sacar: ");
                    break;
                case 7:
                    System.out.println();
                    break;
                case 8:
                    System.out.println();
                    break;
                case 9:
                    System.out.println("ADIOS");
                    sobre();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!\n Tente novamente!");

            }


        }


    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Thalita");
        System.out.println("Generation Brasil - generation@generation.org");
        System.out.println("*********************************************************");
    }

    public static void keyPress() {

        try {

            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
    }
}

