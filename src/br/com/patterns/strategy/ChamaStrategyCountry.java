package br.com.patterns.strategy;

public class ChamaStrategyCountry {

    public static void main(String[] args) {

        final String country_code = "US";
        Country countryInterface  = null;

        switch(country_code){
            case "BR" :
                countryInterface = new BRASIL();
                break;
            case "CH" :
                countryInterface = new CHINA();
                break;
            case "UK" :
                countryInterface = new ENGLAND();
                break;
            case "US" :
                countryInterface = new USA();
                break;
            case "RU" :
                countryInterface = new RUSSIAN();
                break;
            default:
                countryInterface = null;
                break;
        }

        if(countryInterface != null){
            countryInterface.imprimeNomeCountry();
        }else{
            throw new RuntimeException("Country not selected !!!");
        }
    }
}
