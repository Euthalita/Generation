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
        float saldo, limite, valor;


        ContaCorrente c1 = new ContaCorrente(contas.gerarNumero(), 4312, 1, "Ana Maria", 4000f, 400);
        ContaCorrente c2 = new ContaCorrente(contas.gerarNumero(), 3288, 1, "Lucas Roberto", 6000, 1000);
        ContaPoupanca c3 = new ContaPoupanca(contas.gerarNumero(), 5449,2, "Fernando Dias", 2500,11);
        ContaPoupanca c4 = new ContaPoupanca(contas.gerarNumero(), 3677,2, "Yuri Martinz", 10000,11);
        contas.cadastrar(c1);
        contas.cadastrar(c2);
        contas.cadastrar(c3);
        contas.cadastrar(c4);

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
                    System.out.println("Criar conta: \nDigite o número da agencia:");
                    agencia = scanner.nextInt();
                    System.out.println("Digite o Nome do Titular: ");
                    scanner.skip("\\R?");
                    titular = scanner.nextLine();

                    do {
                        System.out.println("Digite o tipo da conta: \n1-Conta Corrente\n2-Conta Poupança");
                        tipo = scanner.nextInt();
                    } while (tipo < 1 && tipo > 2);

                    System.out.println("Digite o saldo da conta: ");
                    saldo = scanner.nextFloat();

                    switch (tipo) {
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
                    System.out.println("Consultar dados da conta - por número");

                    System.out.println("Digite o número da conta:");
                    numero = scanner.nextInt();

                    contas.procurarPorNumero(numero);

                    keyPress();
                    break;
                case 4:
                    System.out.println("Atualizar os dados da conta: ");

                    System.out.println("Digite o número da conta: ");
                    numero = scanner.nextInt();

                    var buscaConta = contas.buscarNaCollection(numero);

                    if(buscaConta != null){

                        tipo = buscaConta.getTipo();

                        System.out.println("Digite o número da agência: ");
                        agencia =scanner.nextInt();
                        System.out.println("Digite o nome do titular");
                        scanner.skip("\\R?");
                        titular = scanner.nextLine();

                        System.out.println("Digite o saldo da conta: ");
                        saldo = scanner.nextFloat();

                        switch (tipo){
                            case 1 -> {
                                System.out.println("Digite o limite de crédito: ");
                                limite = scanner.nextFloat();

                                contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
                            }
                            case 2 -> {
                                System.out.println("Digite o dia do aniversário da conta: ");
                                aniversario = scanner.nextInt();

                                contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
                            }
                            default -> {
                                System.out.println("Tipo de conta inválido!");
                            }
                        }
                    }else
                        System.out.println("A conta não foi encontrada!");

                    keyPress();
                    break;

                case 5:
                    System.out.println("Apagar conta: ");

                    System.out.println("Digite o número da conta: ");
                    numero = scanner.nextInt();

                    contas.deletar(numero);

                    keyPress();
                    break;
                case 6:
                    System.out.println("Sacar: ");

                    System.out.println("Digite o número da conta: ");
                    numero = scanner.nextInt();

                    do{
                        System.out.println("Digite o valor do saque: ");
                        valor = scanner.nextFloat();
                    }while(valor <= 0);

                    contas.sacar(numero, valor);

                    keyPress();
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

