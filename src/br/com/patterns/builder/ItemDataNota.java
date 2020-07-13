package br.com.patterns.builder;

public class ItemDataNota {

    private String nome;
    private double valor;

    public ItemDataNota(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
