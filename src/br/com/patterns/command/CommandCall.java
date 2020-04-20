package br.com.patterns.command;

public class CommandCall {

    public static void main(String[] args) {
        Document document = new Document();

        PDF pdf = new PDF();
        WORD word = new WORD();
        Image image = new Image();


        ActionListenerCommand clickOpen = new ActionOpen(document,pdf,word,image);
        ActionListenerCommand clickSave = new ActionSave(document,pdf,word,image);

        MenuOptions menuOptions = new MenuOptions(clickOpen, clickSave);
        menuOptions.clickOpen();
        menuOptions.clickSave();

    }
}
