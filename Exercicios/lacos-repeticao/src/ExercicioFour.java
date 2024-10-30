import java.util.Scanner;

public class ExercicioFour {
    public static void main(String[] args) {
        String []caracter = new String[3];
        int i;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva três caracteristicas para determinar um animal.\n1ª caracteristica: Vertebrado ou invertebrado.\n2ª caracteristica: Ave, Mamífero, Inseto ou Anelídeo\n3ª característica: Carnívoro, Onívoro, Herbívoro, Hematófago");
        for (i =0; i<3; i++){
            System.out.println("Digite a caracteristica: ");
            caracter [i] = scanner.next().toUpperCase();
        }
        if (caracter[0].equals("VERTEBRADO") || caracter[0].equals("INVERTEBRADO")){
            if(caracter[0].equals("VERTEBRADO") && caracter[1].equals("MAMÍFERO")){
                if(caracter[2].equals("ONÍVORO")){
                    System.out.println("É um HOMEM");
                }else if (caracter[2].equals("HERBÍVORO")){
                    System.out.println("É uma VACA");
                }else{
                    System.out.println("Impossivel cálcular , digite novamente!");
                }
            } else if (caracter[0].equals("VERTEBRADO") && caracter[1].equals("AVE")){
                if(caracter[2].equals("CARNÍVORO")){
                    System.out.println("É uma ÁGUIA");
                }else if (caracter[2].equals("ONÍVORO")){
                    System.out.println("É uma POMBA");
                }else {
                    System.out.println("Impossivel cálcular , digite novamente!");
                }
            } else if (caracter[0].equals("INVERTEBRADO") && caracter[1].equals("INSETO")){
                if(caracter[2].equals("HEMATÓFAGO")){
                    System.out.println("É uma PULGA");
                }else if (caracter[2].equals("HERBÍVORO")){
                    System.out.println("É uma lagarta");
                }else {
                    System.out.println("Impossivel cálcular , digite novamente!");
                }
            } else if (caracter[0].equals("INVERTEBRADO") && caracter[1].equals("ANELÍDEO")) {
                if (caracter[2].equals("HEMATÓFAGO")){
                    System.out.println("É uma SANGUESSUGA");
                } else if (caracter[2].equals("ONÍVORO")) {
                    System.out.println("É uma MINHOCA");
                }else {
                    System.out.println("Impossivel cálcular , digite novamente!");
                }
            }
        }else{
            System.out.println("Não existe essa possibilidade, somente as que estão informadas acima");
        }


    }
}
