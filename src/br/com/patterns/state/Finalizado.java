package br.com.patterns.state;

public class Finalizado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orcamentos finalizados não podem ser aplicados descontos extras !");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado !");

    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado !");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já finalizado !");
    }
}
