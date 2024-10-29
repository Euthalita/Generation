import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExercicioOne {
    public static void main(String[] args) {
        int i;
        float [] number = new float[3];
        float soma;

        Scanner scanner = new Scanner(System.in);

        for (i=0; i < number.length; i++){
            System.out.println("Escreva um número: ");
            number[i] = scanner.nextFloat();
        }

        soma = number[0] + number[1];

        if (soma < number[2]){
            System.out.println("A soma de A + B é menor que C");
        } else if (soma > number[2]) {
            System.out.println("A soma de A + B é maior que C");
        } else {
            System.out.println("A+B é igual a C");
        }

    }
}