package br.com.patterns.strategy;

public class ChamaStrategyCountry {

    public static void main(String[] args) {

        Country country = new BRASIL();
        Country country1 = new USA();
        Country country2 = new CHINA();
        Country country3 = new ENGLAND();
        Country country4 = new RUSSIAN();
        Country country5 = new FRANCE();

        country.imprimeNomeCountry();
        country1.imprimeNomeCountry();
        country2.imprimeNomeCountry();
        country3.imprimeNomeCountry();
        country4.imprimeNomeCountry();
        country5.imprimeNomeCountry();
    }
}
