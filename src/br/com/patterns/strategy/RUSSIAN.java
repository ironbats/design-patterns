package br.com.patterns.strategy;

public class RUSSIAN implements Country{
    @Override
    public void imprimeNomeCountry() {
        System.out.println("мы в россии!");

    }
}
