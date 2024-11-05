import java.util.*;

public class ExercicioTwo {
    static class PilhaLivros {
        private Stack<String> pilha;

        public PilhaLivros() {
            pilha = new Stack<>();
        }

        public void adicionarLivro(String nome) {
            pilha.push(nome);
            System.out.println("Livro \"" + nome + "\" adicionado à pilha.");
        }

        public void listarLivros() {
            if (pilha.isEmpty()) {
                System.out.println("A pilha de livros está vazia.");
            } else {
                System.out.println("Livros na pilha:");
                for (String livro : pilha) {
                    System.out.println(livro);
                }
            }
        }

        public void retirarLivro() {
            if (pilha.isEmpty()) {
                System.out.println("A pilha está vazia. Não há livros para retirar.");
            } else {
                String livro = pilha.pop();
                System.out.println("Livro \"" + livro + "\" retirado da pilha.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaLivros pilha = new PilhaLivros();
        int opcao;

        System.out.println("Entre com a opção desejada: \n" +
                "1: Adicionar um novo livro na pilha.\n" +
                "2: Listar todos os livros.\n" +
                "3: Retirar um livro da pilha \n" +
                "0: O programa deve ser finalizado. \n");

        opcao = scanner.nextInt();

        while (opcao != 0) {
            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do livro: ");
                    pilha.adicionarLivro(scanner.next());

                    break;
                case 2:
                    pilha.listarLivros();
                    break;
                case 3:
                    pilha.retirarLivro();
                    break;
                default:
                    System.out.println("Número incorreto, tente de novo.\n");
                    break;
            }
            System.out.println("\nEntre com a opção desejada:" +
                    "\n1: Adicionar um novo livro na pilha.\n" +
                    "2: Listar todos os livros.\n" +
                    "3: Retirar um livro da pilha \n" +
                    "0: O programa deve ser finalizado. \n");

            opcao = scanner.nextInt();
        }
        System.out.println("Programa finalizado!");
    }
}