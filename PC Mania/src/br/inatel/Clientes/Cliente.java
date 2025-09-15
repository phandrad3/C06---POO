package br.inatel.Clientes;
import br.inatel.Computadores.Computador;

public class Cliente {
    // atributos
    private String nome;
    private String cpf;
    private Computador computador;
    private Computador computadores[] = new Computador[50];
    private int qtdComputadores;

    // metodos
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null)
                total += computadores[i].getPreco();
        }
        return total;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public void setComputadores(Computador[] computadores) {
        this.computadores = computadores;
    }

    public int getQtdComputadores() {
        return qtdComputadores;
    }

    public void setQtdComputadores(int qtdComputadores) {
        this.qtdComputadores = qtdComputadores;
    }


}