package br.com.inatel.Computadores;

public class HardwareBasico {
    private String nome;
    private int capacidade;

    public HardwareBasico(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
