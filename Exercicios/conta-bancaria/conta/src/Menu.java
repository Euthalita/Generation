import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int seletor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************************\n" +
                "Olá! Seja bem vindo!\n" +
                "1- Criar uma conta.\n" +
                "2- Listar todas as contas\n" +
                "3- Buscar conta por número\n" +
                "4- Atualizar dados da conta\n"+
                "5- Apagar conta\n"+
                "6- Sacar\n" +
                "7- Depositar\n" +
                "8- Transferir valores entre contas\n" +
                "9- Sair\n" +
                "Entre com uma opção: "

        );
        seletor = scanner.nextInt();

        switch (seletor) {
            case 1:
                Cadastro cliente = new Cadastro();

                cliente.realizarCadatro();
                cliente.exibirCadastro();
                break;

            case 2:
                Conta cliente1 = new Conta();

                cliente1.realizarLogin();
                cliente1.exibirLogin();

        }
    }
}