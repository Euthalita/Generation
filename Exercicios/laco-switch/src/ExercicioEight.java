import java.util.Scanner;

public class ExercicioEight {
    public static void main(String[] args) {
        int number = 0;
        float saldo = 10000, saque, deposito;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma operação: \n1- Saldo \n2- Saque \n3- Depósito \n4- Sair");
        number = scanner.nextInt();

        while (number != 4) {
            switch (number) {
                case 1:
                    System.out.println("Seu saldo é de R$ " + saldo+ "\n");
                    break;

                case 2:
                    System.out.println("\nOperação Saque\nDigite o valor do saque:");
                    saque = scanner.nextFloat();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente! Por favor, consultar seu saldo.\n");
                    } else {
                        saldo -= saque;
                        System.out.println("Valor sacado com sucesso!\nNovo saldo de R$ " + saldo+"\n");
                    }
                    break;

                case 3:
                    System.out.println("\nOperação Depósito\nInsira o valor a ser depositado: ");
                    deposito = scanner.nextFloat();
                    saldo += deposito;
                    System.out.println("Novo saldo: R$ " + (saldo)+"\n");
                    break;

                default:
                    System.out.println("Operação inválida!");

            }
            if(number == 4){
                break;
            }else {
                System.out.println("Selecione uma operação: \n1- Saldo \n2- Saque \n3- Depósito \n4- Sair");
                number = scanner.nextInt();
            }
        }
        System.out.println("Operação encerrada!");
    }
}