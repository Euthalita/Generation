
import java.util.HashSet;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SetEx {

        public static void main(String[] args) {

            // Cria a Collection Set, do tipo String chamada setFrutas
            HashSet<String> setFrutas = new HashSet<String>();

            Scanner scanner = new Scanner(System.in);

            // Adiciona algumas frutas na Colection Set
            setFrutas.add("Abacate");
            setFrutas.add("Banana");
            setFrutas.add("Jaboticaba");
            setFrutas.add("Kiwi");
            setFrutas.add("Maçã");
            setFrutas.add("Morango");
            setFrutas.add("Pêra");
            setFrutas.add("Jaboticaba");
            setFrutas.add("Kiwi");

            //essa collection n guarda em uma posição especifica e também não repete dados
            //nota-se que o kiwi msm sendo colocado 2x só aparece uma
            System.out.println(setFrutas);

            //adicionando itens a lista manualmente
            System.out.println("Digite o no me da fruta");
            setFrutas.add(scanner.nextLine());

            //Busca informação na lilsta
            System.out.println("\nExiste a fruta Kiwi?"+ setFrutas.contains("Kiwi"));

            //é o famoso delete sem Where, vai limpar a lista
            setFrutas.clear();

            //Verifica se a Collection Set está vazia
            System.out.println("\nA Colection Set está vazia? " + setFrutas.isEmpty());




    }
}