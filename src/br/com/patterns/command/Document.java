package br.com.patterns.command;

public class Document implements DocumentsEvent {

    @Override
    public void open() {

        System.out.println("Documento Aberto !");
    }

    public void save() {
        System.out.println("Documento Salvo !");

    }

}
