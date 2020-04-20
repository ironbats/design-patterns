package br.com.patterns.command;

public class PDF extends  Document {

    @Override
    public void open() {
        System.out.println("Documento PDF Aberto");
    }

    @Override
    public void save() {
        System.out.println("Documento PDF Salvo");
    }
}
