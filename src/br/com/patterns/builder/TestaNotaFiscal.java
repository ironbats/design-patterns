package br.com.patterns.builder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TestaNotaFiscal {

    public static void main(String[] args) {

        List<ItemDataNota> itens = Arrays.asList(new ItemDataNota("item1", 200), new ItemDataNota("item2", 300));
        double valortoal = itens.stream().mapToDouble(ItemDataNota::getValor).sum();
        double imposto = valortoal * 0.08;

        NotaFiscal nf = new NotaFiscal("1321321", "felipe rodrigues",
                Calendar.getInstance(), valortoal, imposto, itens, "teste observações");

        System.out.println("IMPRIME DADOS DA NOTA FISCAL SEM O PATTERN    --  >  " + nf);


        NFEBuilder nfe = new NFEBuilder();
        nfe.comCnpj("3133312312")
                .paraEmpresa("teste patter builder")
                .comItens(new ItemDataNota("item1", 200))
                .comItens(new ItemDataNota("item2", 300))
                .comItens(new ItemDataNota("item3", 400))
                .comDataAtual(Calendar.getInstance())
                .comObservacao("Esse pattern foi feito para essa nota fiscal !").constroiNFE();

        System.out.println("CRIA NFE COM PATTERN BUILDER " + nfe);

    }
}
