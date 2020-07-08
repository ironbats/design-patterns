package br.com.patterns.templatemethod;

public class Imposto02 extends TemplateMethodImposto implements  Imposto {

    @Override
    public double calculaTaxaMaxima(double tax) {
        return tax * 0.16;
    }

    @Override
    public double calculaTaxaMinima(double tax) {
        return tax * 0.06;
    }

    @Override
    public double calculaImposto(double valorOrcamento) {
        return   valorOrcamento > 500  ? calculaTaxaMaxima(valorOrcamento) : calculaTaxaMinima(valorOrcamento);
    }

    @Override
    public double impostoCalculado(double valor) {
        return calculaImposto(valor);
    }
}
