package be.vdab.contacts;

import com.vaadin.ui.*;

/**
 * Created by Evelyne on 09/07/15.
 */
public class MenuPanel extends CustomComponent{
    Panel menu = new Panel("menu");
    Tree tree = new Tree("groups");


    /**
     * Constructor
     */
    public MenuPanel() {
        VerticalLayout layout = new VerticalLayout();
        menu.setSizeFull();

        layout.addComponent(menu);
        layout.addComponent(tree);

        setCompositionRoot(layout);
    }
}
