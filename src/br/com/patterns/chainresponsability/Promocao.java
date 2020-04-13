package br.com.patterns.chainresponsability;

public class Promocao {

    public static void main(String... args) {

        Promocao promocao = new Promocao();

        double total = promocao.chamaMetodoChainResponsability(300, 350);

        System.out.println(total);
    }

    public double chamaMetodoChainResponsability(double valorRequerido, double valorLivro) {

        DesignPatternsCurso designPatternsCurso =
                new DesignPatternsCurso("Chain of Responsability", valorLivro);

        Desconto d = new DescontoDezPorCento();
        Desconto d1 = new DescontoVintePorcento();
        Desconto d2 = new DescontoCinquentaPorCento();
        Desconto d3 = new SemDesconto();


        d.proximoDesconto(d1);
        d1.proximoDesconto(d2);
        d2.proximoDesconto(d3);

        return d.daDesconto(designPatternsCurso, valorRequerido);


    }
}
