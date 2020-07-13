package br.com.patterns.state;

public class Orcamento {

    protected double valor;
    private String descriptionImposto;
    protected EstadoOrcamento estadoAtual;

    public Orcamento(){
        estadoAtual = new EmAprovacao();
    }

    public void setDescriptionImposto(String descriptionImposto) {
        this.descriptionImposto = descriptionImposto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getDescriptionImposto() {
        return descriptionImposto;
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);
    }
}
