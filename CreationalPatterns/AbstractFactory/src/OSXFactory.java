import Entity.Component;
import Entity.OSXButton;
import Entity.OSXList;
import Entity.OSXTable;

public class OSXFactory implements GUIFactory {
    @Override
    public Component createButton() {
        return new OSXButton();
    }

    @Override
    public Component createList() {
        return new OSXList();
    }

    @Override
    public Component createTable() {
        return new OSXTable();
    }
}
