package br.com.patterns.builder;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NFEBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemDataNota> itens = new ArrayList<>();
    private double valorBruto;
    private double imposto;
    private String obervacao;
    private Calendar dataAtual;

    public NFEBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NFEBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NFEBuilder comItens(ItemDataNota item) {
        itens.add(item);
        valorBruto += item.getValor();
        imposto += item.getValor() * 0.09;
        return this;
    }

    public NFEBuilder comObservacao(String observacao) {
        this.obervacao = observacao;
        return this;
    }

    public NFEBuilder comDataAtual(Calendar dataAtual) {
        this.dataAtual = dataAtual;
        return this;
    }

    public NotaFiscal constroiNFE() {
        return new NotaFiscal(cnpj, razaoSocial, dataAtual, valorBruto, imposto, itens, obervacao);
    }

}
