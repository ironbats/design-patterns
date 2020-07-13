package br.com.patterns.observer;

import br.com.patterns.builder.NotaFiscal;

public interface AcaoNotaFiscal {

    void executa(NotaFiscal notaFiscal);
}
