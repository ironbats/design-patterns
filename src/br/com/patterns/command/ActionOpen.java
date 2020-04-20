package br.com.patterns.command;

public class ActionOpen implements ActionListenerCommand {

    private Document[] document;

    public ActionOpen(Document... document) {
        this.document = document;
    }

    @Override
    public void execute() {
        for (Document doc : document) {
            doc.open();
        }
    }

}
