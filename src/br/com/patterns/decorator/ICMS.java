package br.com.patterns.decorator;

public class ICMS extends Imposto {


    public ICMS(Imposto imposto) {
        super(imposto);
    }


    public ICMS() {
    }


    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.07 + calculoDeOutroImposto(orcamento);
    }
}
