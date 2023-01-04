import Entity.Component;

public interface GUIFactory {
    Component createButton();
    Component createList();
    Component createTable();

}
