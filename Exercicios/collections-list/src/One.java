import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();
        int i;

        for(i=0; i<5; i++){
            System.out.println("Escreva uma cor: ");
            cores.add(scanner.next());
        }
        Iterator<String> iterator = cores.iterator();

        System.out.println("\nVocê digitou: ");
        while (iterator.hasNext()){
            String color = iterator.next();
            System.out.println(color);
        }

        Collections.sort(cores);
        System.out.println("\nCores ordenadas por ordem alfabética.");
        




    }


}