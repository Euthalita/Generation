import java.util.Scanner;

public class ExercicioSeven {
    public static void main(String[] args) {
        float n1, n2, total;
        int codigo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        n1 = scanner.nextFloat();

        System.out.println("Digite o segundo valor: ");
        n2 = scanner.nextFloat();

        System.out.println("Selecione o código da operação: \n1- Soma\n2- Subitração\n3- Multiplicação\n4- Divisão");
        codigo = scanner.nextInt();

        switch (codigo){
            case 1:
                total = n1+n2;
                System.out.println("Total = "+total);
                break;
            case 2:
                total = n1-n2;
                System.out.println("Total = "+total);
                break;
            case 3:
                total = n1*n2;
                System.out.println("Total = "+total);
                break;
            case 4:
                total = n1/n2;
                System.out.println("Total = "+total);
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }
}
