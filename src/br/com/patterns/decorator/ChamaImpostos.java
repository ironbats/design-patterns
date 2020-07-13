package br.com.patterns.decorator;

public class ChamaImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        orcamento.setDescriptionImposto("Orcamento Decorator");
        orcamento.setValor(450);

        Imposto imposto = new ICMS(new IPI(new ISS()));

        double calculoImpostos  = imposto.calcula(orcamento);
        System.out.println(calculoImpostos);
    }
}
