import java.util.Scanner;

public class Conta {
    private int numeroConta;
    private float saldo;
    private String agencia;
    private int tipoConta;
    private String titular;

    public Conta(){

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void realizarLogin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque o número da sua conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Coloque sua agência: ");
        agencia = scanner.next();

        System.out.println("Digite 1 para conta corrente:\nDigite 2 para conta poupança:");
        tipoConta = scanner.nextInt();


    }

    public void exibirLogin(){
        System.out.println("Seja bem vindo(a)!!!\nLogin realizado com sucesso!!!");
    }

    public void sacar(){

    }

    public void depositar(){

    }

}
