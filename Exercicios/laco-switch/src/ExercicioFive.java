import java.util.Scanner;

public class ExercicioFive {
    public static void main(String[] args) {
        int codigo = 0, qtd = 0;
        String produto="";
        float preco = 0, total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Código: ");
        codigo = scanner.nextInt();

        System.out.println("Quantidade: ");
        qtd = scanner.nextInt();

        switch (codigo){
            case 1:
                produto = "Cachorro Quente";
                preco = 10;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15;
                break;
            case 3:
                produto = "X-bacon";
                preco = 18;
                break;
            case 4:
                produto = "Bauru";
                preco = 12;
                break;
            case 5:
                produto = "Refrigerante";
                preco= 8;
                break;
            case 6:
                produto = "Suco de laranja";
                preco = 13;
                break;
            default:
                System.out.println("Código não correspondido");
                break;
        }
        total = preco*qtd;
        System.out.println("Produto: "+ produto+"\nValor total: R$ "+ total);
    }
}
