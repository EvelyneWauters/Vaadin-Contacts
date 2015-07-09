package be.vdab.contacts;

import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

public class ComponentTopLabel extends CustomComponent {

    Button contacts = new Button("Contacts");
    Button registration = new Button("Registration");
    Button login = new Button("Login");
    Label placeFiller = new Label("");

    /**
     * Constructor
     */
    public ComponentTopLabel() {
        contacts.addClickListener((event)-> {
            Notification.show("here are all your friends");
        });
        registration.addClickListener((event)-> {
            Notification.show("join us!");
        });
        login.addClickListener((event)-> {
            Notification.show("hello there!");
        });

        contacts.setStyleName(ValoTheme.BUTTON_BORDERLESS);
        login.setStyleName(ValoTheme.BUTTON_BORDERLESS);
        registration.setStyleName(ValoTheme.BUTTON_BORDERLESS);


        HorizontalLayout layout = new HorizontalLayout();

        layout.setWidth("100%");

        layout.addComponent(contacts);
        layout.addComponent(placeFiller);
        layout.addComponent(registration);
        layout.addComponent(login);

        //dit moet NADAT de componenten zijn toegevoegd aan de layout
        layout.setExpandRatio(placeFiller, 1);

        setCompositionRoot(layout);


    }



}
