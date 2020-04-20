package br.com.patterns.command;

public class Image  extends  Document{

    @Override
    public void open() {
        System.out.println("Documento Image Aberto");
    }

    @Override
    public void save() {
        System.out.println("Documento Image Salvo");
    }
}
