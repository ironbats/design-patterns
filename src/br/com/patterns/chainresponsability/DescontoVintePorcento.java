package br.com.patterns.chainresponsability;

public class DescontoVintePorcento implements Desconto {

    private Desconto desconto;

    @Override
    public double daDesconto(DesignPatternsCurso promocao, double valoRequerido) {

        if (promocao.getValor() > valoRequerido) {
            return promocao.getValor() / 0.02;
        }
        return desconto.daDesconto(promocao, valoRequerido);
    }

    @Override
    public void proximoDesconto(Desconto promocao) {
        this.desconto = promocao;
    }
}
