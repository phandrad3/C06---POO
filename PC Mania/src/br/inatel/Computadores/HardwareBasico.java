package br.inatel.Computadores;

public class HardwareBasico {
    // atributos
    private String nome;
    private int capacidade;

    // metodos
    public HardwareBasico(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
