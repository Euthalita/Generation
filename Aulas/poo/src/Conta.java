public class Conta {

    private String titular;
    private int numero;
    private int agencia;
    private int tipo;
    private float saldo;

    public Conta(String titular, int agencia, int tipo, float saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void Imprimir() {
        System.out.println("\nTitula: " + titular);
        System.out.println("Agencia: " + agencia);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: " + saldo);
    }
}
