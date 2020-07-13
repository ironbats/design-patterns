package br.com.patterns.state;

public class Reprovado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não podem ter descontos aplicados !");
    }

    @Override
    public void aprova(Orcamento orcamento) {

        throw new RuntimeException("Orçamento reprovado não pode ser aprovado novamente !");

    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já se encontra reprovado !");

    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }
}
