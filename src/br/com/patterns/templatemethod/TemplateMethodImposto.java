package br.com.patterns.templatemethod;

public abstract class TemplateMethodImposto {

    public abstract double calculaTaxaMaxima(double tax);
    public abstract double calculaTaxaMinima(double tax);
    public abstract double calculaImposto(double tax);

}
