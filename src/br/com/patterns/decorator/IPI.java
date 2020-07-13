package br.com.patterns.decorator;

public class IPI extends Imposto {

    public IPI(Imposto imposto){
        super(imposto);
    }

    public IPI(){}

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculoDeOutroImposto(orcamento);
    }
}
