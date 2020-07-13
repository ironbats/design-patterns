package br.com.patterns.observer;

import br.com.patterns.builder.NotaFiscal;

public class SaveDB implements  AcaoNotaFiscal{
    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Salvo no Banco !");
    }
}
