package br.com.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Piano {

    private static Map<String, Notas> notas =  new HashMap<>();

    //SERA CARREGADO NA MEMORIA , E SERA UTILIZADO O MESMO OBJETO DE REFERENCIA PELA JVM

    static {
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
    }

    public Notas pegaTon(String code) {
        return notas.get(code);
    }
}
