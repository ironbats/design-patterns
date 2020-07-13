package br.com.patterns.observer;

import br.com.patterns.builder.NotaFiscal;

public class EnviaEmail  implements AcaoNotaFiscal{

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("enviado ao email !");
    }
}
