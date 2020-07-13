package br.com.patterns.decorator;

public class Orcamento {

    private double valor;
    private String descriptionImposto;


    public void setDescriptionImposto(String descriptionImposto) {
        this.descriptionImposto = descriptionImposto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getDescriptionImposto() {
        return descriptionImposto;
    }
}
