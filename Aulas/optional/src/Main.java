import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = null;

        Optional<Cliente> clienteOptional = Optional.ofNullable(cliente);

        String nome = clienteOptional.map(resposta -> resposta.getNome()).orElse("Cliente não encontrado!");
        System.out.println(nome);
    }
}