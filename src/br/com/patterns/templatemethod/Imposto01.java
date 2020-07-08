package br.com.patterns.templatemethod;

public class Imposto01 extends TemplateMethodImposto implements Imposto {
    @Override
    public double calculaTaxaMaxima(double tax) {
        return tax * 0.20;
    }

    @Override
    public double calculaTaxaMinima(double tax) {
        return tax * 0.8;
    }

    @Override
    public double calculaImposto(double valorOrcamento) {
        return valorOrcamento > 300 ? calculaTaxaMaxima(valorOrcamento) : calculaTaxaMinima(valorOrcamento);
    }

    @Override
    public double impostoCalculado(double valor) {
        return calculaImposto(valor);
    }
}
