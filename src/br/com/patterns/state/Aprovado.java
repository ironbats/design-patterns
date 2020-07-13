package br.com.patterns.state;

public class Aprovado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor -= orcamento.valor * 0.02;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já aprovado !");

    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já aprovados não podem ter reprovados !");

    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
