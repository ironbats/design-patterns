package br.com.patterns.builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

    private String cnpj;
    private String razaoSocial;
    private Calendar dataemissao;
    private double valorbruto;
    private double impostos;
    private List<ItemDataNota> itens;
    private String observações;

    public NotaFiscal(String cnpj, String razaoSocial, Calendar dataemissao, double valorbruto, double impostos, List<ItemDataNota> itens, String observações) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.dataemissao = dataemissao;
        this.valorbruto = valorbruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observações = observações;
    }

    public Calendar getDataemissao() {
        return dataemissao;
    }

    public double getImpostos() {
        return impostos;
    }

    public double getValorbruto() {
        return valorbruto;
    }

    public List<ItemDataNota> getItens() {
        return itens;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getObservações() {
        return observações;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", dataemissao=" + dataemissao +
                ", valorbruto=" + valorbruto +
                ", impostos=" + impostos +
                ", itens=" + itens +
                ", observações='" + observações + '\'' +
                '}';
    }
}

