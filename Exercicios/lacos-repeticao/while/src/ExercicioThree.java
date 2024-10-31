import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExercicioThree {
    public static void main(String[] args) {
        int idade, soma_maior=0, soma_menor=0;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        idade = scanner.nextInt();

        while (idade>0){

            if (idade < 21){
                soma_menor += 1;
            }else if (idade > 50) {
                soma_maior += 1;
            }
            System.out.println("Digite uma idade: ");
            idade = scanner.nextInt();
        }
        System.out.println("Total de pessoas menores que 21 anos: "+ soma_menor);
        System.out.println("Total de pessoas maiores que 50 anos: "+soma_maior);
    }
}