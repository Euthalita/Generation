import java.util.Scanner;

public class ExercicioThree {
    public static void main(String[] args) {
        int idade;
        String nome;
        boolean doacao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do doador: ");
        nome = scanner.next();

        System.out.println("Digite a idade do doador: ");
        idade = scanner.nextInt();


        if (idade < 18 || idade > 69) {
            System.out.println(nome + " não está apto(a) para doar sangue!\n");
        }else{
            System.out.println("Primeira doação de sangue? ");
            doacao = scanner.nextBoolean();
            if (idade >= 60 && idade <= 69 && doacao == true) {
                System.out.println(nome + " não está apto(a) para doar sangue!\n");
            }else{
                System.out.println(nome + " está apto(a) para doar sangue!\n");
            }
        }
    }
}