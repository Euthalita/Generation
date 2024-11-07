import java.util.Scanner;

public class Cadastro {
    public String nome;
    public String cpf;
    public String dataNascimento;
    public String rg;

    Cadastro(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void realizarCadatro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.next();

        System.out.println("Digite seu CPF: ");
        cpf = scanner.next();

        System.out.println("Digite sua data de nascimento: ");
        dataNascimento = scanner.next();

        System.out.println("Digite seu RG: ");
        rg = scanner.next();
    }

    public void exibirCadastro(){
        System.out.println("Cadastro realizado com sucesso!\n"+"Seja bem vindo(a)"+nome);
    }

}
