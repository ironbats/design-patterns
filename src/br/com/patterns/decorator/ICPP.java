package br.com.patterns.decorator;

public class ICPP extends Imposto {



    public ICPP(Imposto imposto){
        super(imposto);
    }


    public ICPP(){}

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.10 + calculoDeOutroImposto(orcamento);
    }
}
