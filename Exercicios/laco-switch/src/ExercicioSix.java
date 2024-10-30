import java.util.Scanner;

public class ExercicioSix {
    public static void main(String[] args) {
        String nome, cargo="";
        int codigo;
        float salario = 0, reajuste = 0, novo_salario = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do colaborador: ");
        nome = scanner.next();

        System.out.println("Digite o cargo: ");
        codigo = scanner.nextInt();

        System.out.println("Digite o salario: ");
        salario = scanner.nextFloat();

        switch (codigo){
            case 1:
                cargo = "Gerente";
                reajuste = 0.1f;
                break;
            case 2:
                cargo = "Vendendor";
                reajuste = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                reajuste = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                reajuste = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                reajuste = 0.05f;
                break;
            case 6:
                cargo = "Tecnico de TI";
                reajuste = 0.08f;
                break;
        }
        novo_salario = salario + (reajuste*salario);
        System.out.println("Colaborador: "+nome+"\nCargo: "+cargo+"\nSalário reajustado: "+novo_salario);
    }
}
