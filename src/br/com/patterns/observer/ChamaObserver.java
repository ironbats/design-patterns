package br.com.patterns.observer;

import br.com.patterns.builder.ItemDataNota;

import java.util.Calendar;

public class ChamaObserver {

    public static void main(String[] args) {

        NFEBuilder nfe = new NFEBuilder();

        nfe.adicionaAcao(new EnviaEmail());
        nfe.adicionaAcao(new SaveDB());
        nfe.adicionaAcao(new EnviaSMS());
        nfe.adicionaAcao(new ImprimeNOTA());


        nfe.comCnpj("111111").paraEmpresa("teste")
                .comItens(new ItemDataNota("item-01",590))
                .comDataAtual(Calendar.getInstance())
                .comObservacao("Observer Patter").constroiNFE();

    }
}
