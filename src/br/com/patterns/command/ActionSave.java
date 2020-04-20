package br.com.patterns.command;

public class ActionSave  implements  ActionListenerCommand{

    private Document  [] document;

    public ActionSave(Document... document){
        this.document=document;
    }


    @Override
    public void execute() {
        for(Document  doc : document){
            doc.save();
        }
    }
}
