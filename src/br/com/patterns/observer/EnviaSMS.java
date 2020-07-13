package br.com.patterns.observer;

import br.com.patterns.builder.NotaFiscal;

public class EnviaSMS  implements  AcaoNotaFiscal{
    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("envio de SMS");
    }
}
