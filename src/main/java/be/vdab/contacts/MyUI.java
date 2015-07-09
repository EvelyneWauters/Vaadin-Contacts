package be.vdab.contacts;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

import java.awt.*;

/**
 *
 */
@Theme("mytheme")
@Widgetset("be.vdab.contacts.MyAppWidgetset")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout content = new VerticalLayout();
        setContent(content);

        ComponentTopLabel componentTopLabel = new ComponentTopLabel();
        BodyComponent bodyComponent = new BodyComponent();
//        MenuPanel menuPanel = new MenuPanel();
//        ContentPanel contentPanel = new ContentPanel();

        content.addComponent(componentTopLabel);
        content.addComponent(bodyComponent);

    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
