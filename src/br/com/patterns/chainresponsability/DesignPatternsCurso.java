package br.com.patterns.chainresponsability;

public class DesignPatternsCurso {

    private String nomeDesignPattern;
    private double valor;

    DesignPatternsCurso(String nomeDesignPattern, double valor) {

        this.nomeDesignPattern = nomeDesignPattern;
        this.valor = valor;

    }

    public double getValor() {
        return valor;
    }

    public String getNomeDesignPattern() {
        return nomeDesignPattern;
    }
}
