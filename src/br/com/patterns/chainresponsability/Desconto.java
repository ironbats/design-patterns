package br.com.patterns.chainresponsability;

public interface Desconto {

    double daDesconto(DesignPatternsCurso promocao, double valoRequerido);

    void proximoDesconto(Desconto desconto);
}
