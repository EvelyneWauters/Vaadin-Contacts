package be.vdab.contacts;

import com.vaadin.ui.*;

/**
 * Created by Evelyne on 09/07/15.
 */
public class ContentPanel extends CustomComponent {
    Panel content = new Panel("content");
    Table table = new Table("Contact");

    public ContentPanel() {
        VerticalLayout layout = new VerticalLayout();
        content.setSizeFull();

        layout.addComponent(content);
        layout.addComponent(table);

        setCompositionRoot(layout);
    }
}
