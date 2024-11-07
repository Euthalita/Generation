import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int seletor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Seja bem vindo!\nDigite 1 para criar uma conta.\nDigite 2 para fazer o login.");
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