package conta.controller;

import conta.model.Conta;
import conta.repository.ContaRepository;

import java.util.ArrayList;
import java.util.Optional;

public class ContaController implements ContaRepository {
    ArrayList<Conta> listaContas = new ArrayList<Conta>();
    int numero = 0;


    @Override
    public void procurarPorNumero(int numero) {
        var conta = buscarNaCollection(numero);
        if (conta != null)
            conta.visualizar();
        else
            System.out.println("A conta número: " + numero + "não foi encontrada!");
    }

    @Override
    public void listarTodas() {
        for (var conta : listaContas) {
            conta.visualizar();
        }
    }

    @Override
    public void cadastrar(Conta conta) {
        listaContas.add(conta);
        System.out.println("Conta número: " + conta.getNumero() + " foi criada com sucesso!");
    }

    @Override
    public void atualizar(Conta conta) {
        var buscaConta = buscarNaCollection(conta.getNumero());

        if (buscaConta != null) {
            listaContas.set(listaContas.indexOf(buscaConta), conta);
            System.out.println("Conta número " + conta.getNumero() + " foi atualizada com sucesso!");
        } else
            System.out.println("Conta número " + conta.getNumero() + " não foi encontrada!");
    }

    @Override
    public void deletar(int numero) {
        Optional<Integer> conta = Optional.ofNullable(numero);

        if (conta.isPresent()) {
            if (listaContas.remove(conta) == true)
                System.out.println("Conta numero " + numero + " não foi encontrado!");
            else
                System.out.println("Conta numero " + numero + " não foi encontrada!");
        }
    }

    @Override
    public void sacar(int numero, float valor) {
        var conta = buscarNaCollection(numero);

        if (conta != null) {
            if (conta.sacar(valor) == true)
                System.out.println("O saque na conta número: " + numero + " foi efetuado com sucesso!");
            else
                System.out.println("A conta número: " + numero + " não foi encontrada!");
        }
    }

    @Override
    public void depositar(int numero, float valor) {
        var conta = buscarNaCollection(numero);

        if (conta != null) {
            conta.depositar(valor);
            System.out.println("O deposito na conta número" + numero + " foi efetuado com sucesso!");
        } else
            System.out.println("A conta não foi encontrada!");
    }

    @Override
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {


    }

    public Conta buscarNaCollection(int numero) {
        for (var conta : listaContas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public int gerarNumero() {
        return ++numero;
    }



}
