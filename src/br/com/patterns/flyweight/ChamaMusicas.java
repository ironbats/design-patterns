package br.com.patterns.flyweight;

import java.util.Arrays;
import java.util.List;

public class ChamaMusicas {

    public static void main(String[] args) {

        Piano piano = new Piano();


        List<Notas> notas   = Arrays.asList(

                piano.pegaTon("do"),
                piano.pegaTon("re"),
                piano.pegaTon("mi"),
                piano.pegaTon("fa"),
                piano.pegaTon("fa"),
                piano.pegaTon("fa"),

                piano.pegaTon("do"),
                piano.pegaTon("re"),
                piano.pegaTon("do"),
                piano.pegaTon("re"),

                piano.pegaTon("re"),
                piano.pegaTon("re"),
                piano.pegaTon("re"),

                piano.pegaTon("do"),
                piano.pegaTon("sol"),
                piano.pegaTon("fa"),
                piano.pegaTon("mi"),

                piano.pegaTon("mi"),
                piano.pegaTon("mi"),

                piano.pegaTon("do"),
                piano.pegaTon("re"),
                piano.pegaTon("mi"),
                piano.pegaTon("fa"),
                piano.pegaTon("fa"),
                piano.pegaTon("fa")

        );

        TocaPiano tocaPiano = new TocaPiano();
        StringBuilder sb = new StringBuilder();

        notas.forEach(n -> {
            sb.append(n.simbolos() + " ");
        });

        tocaPiano.tocaPiano(sb.toString());

    }
}
