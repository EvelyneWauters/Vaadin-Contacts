package be.vdab.contacts;

import com.vaadin.ui.*;

public class BodyComponent extends CustomComponent {

    Panel menu = new Panel("menu");
    Panel content = new Panel("content");

    Tree tree = new Tree("Groups");
    Table table = new Table("Contact");



    /**
     * Constructor
     */
    public BodyComponent() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        VerticalLayout verticalLayoutLeft = new VerticalLayout();
        VerticalLayout verticalLayoutRight = new VerticalLayout();

        //add menu & content to the vertical Layouts
        menu.setContent(verticalLayoutLeft);
        content.setContent(verticalLayoutRight);


        horizontalLayout.setSizeFull();
        verticalLayoutLeft.setSizeFull();
        verticalLayoutRight.setSizeFull();
        menu.setSizeFull();
        content.setSizeFull();
//        verticalLayoutLeft.setHeight("100%");
//        verticalLayoutRight.setHeight("100%");



        //add components to the layouts
        horizontalLayout.addComponent(menu);
        horizontalLayout.addComponent(content);
        verticalLayoutLeft.addComponent(tree);
        verticalLayoutRight.addComponent(table);

        //alignment
        horizontalLayout.setExpandRatio(menu, 0.15f);
        horizontalLayout.setExpandRatio(content, 0.85f);
        verticalLayoutRight.setExpandRatio(table, 1);
        verticalLayoutLeft.setExpandRatio(tree, 1);

        setCompositionRoot(horizontalLayout);
        setHeight("100%");
    }



}
