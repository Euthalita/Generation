public class MenuConta {
    public static void main(String[] args) {
        Conta conta = new Conta("Fulano", 1234, 1, 1500 );
        Conta conta1 = new Conta("Thalita", 2222, 1, 10000f);

        System.out.println(conta);
        conta.Imprimir();
        conta1.Imprimir();
        conta.setTitular("Eu");

        conta.Imprimir();
        System.out.println(conta.getTitular());
    }
}
