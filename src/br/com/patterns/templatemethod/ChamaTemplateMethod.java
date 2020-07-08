package br.com.patterns.templatemethod;

public class ChamaTemplateMethod {

    public static void main(String[] args) {

        Imposto i1 = new Imposto02();
        Imposto i2 = new Imposto01();

        System.out.println(i1.impostoCalculado(300));
        System.out.println(i2.impostoCalculado(600));
    }
}
