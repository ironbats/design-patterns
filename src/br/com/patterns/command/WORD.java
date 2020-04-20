package br.com.patterns.command;

public class WORD  extends  Document{

    @Override
    public void open() {
        System.out.println("Documento WORD Aberto");
    }

    @Override
    public void save() {
        System.out.println("Documento WORD Salvo");
    }

}
