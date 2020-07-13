package br.com.patterns.state;

public class ChamaPatternState {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        orcamento.setDescriptionImposto("Imposto Orçamento STATE");
        orcamento.setValor(870);

        orcamento.aplicaDescontoExtra();
        System.out.println("Valor desconto inicial  ! " + orcamento.getValor());


        orcamento.aprova();
        orcamento.aplicaDescontoExtra();

        System.out.println("Aprovado desconto extra ! " + orcamento.getValor());


       orcamento.finaliza();
        orcamento.aplicaDescontoExtra(); //lança exception

    }
}
