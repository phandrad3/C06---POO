package br.com.inatel.Clientes;
import br.com.inatel.Computadores.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador computador;
    private Computador computadores[] = new Computador[50];
    private int qtdComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float calculaTotalCompra(){
        float total = 0;
        for (int i = 0; i < qtdComputadores; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public void adicionarComputador(Computador computador) {
        if (qtdComputadores < computadores.length) {
            computadores[qtdComputadores] = computador;
            qtdComputadores++;
        }
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public int getQtdComputadores() {
        return qtdComputadores;
    }

}