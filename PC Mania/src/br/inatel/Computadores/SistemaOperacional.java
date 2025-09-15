package br.inatel.Computadores;

public class SistemaOperacional {
    // atributos
    private String nome;
    private int tipo;

    // metodos
    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}