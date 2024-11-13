import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> par = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        int somaPar = numeros.stream().filter(n -> n % 2 == 0).reduce(0, (a,b))
        System.out.println("Numeros pares "+par);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);        numeros.stream()                .filter(n -> n % 2 == 0)                .map(n -> {                    return n += n;                })                .filter(n -> n % 8 == 0)                .forEach(System.out::println);
    }
}