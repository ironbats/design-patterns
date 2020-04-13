package br.com.patterns.chainresponsability;

public class SemDesconto implements Desconto {

    private Desconto desconto;

    @Override
    public double daDesconto(DesignPatternsCurso promocao, double valoRequerido) {

        return 0;
    }

    @Override
    public void proximoDesconto(Desconto promocao) {
    }
}
