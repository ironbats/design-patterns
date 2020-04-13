package br.com.patterns.chainresponsability;

public class DescontoDezPorCento implements Desconto {

    private Desconto desconto;

    @Override
    public double daDesconto(DesignPatternsCurso promocao, double valoRequerido) {

        if (promocao.getValor() > valoRequerido) {
            return promocao.getValor() / 0.01;
        }
        return desconto.daDesconto(promocao, valoRequerido);
    }

    @Override
    public void proximoDesconto(Desconto promocao) {
        this.desconto = promocao;
    }
}
