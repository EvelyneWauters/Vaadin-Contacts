package domain;


public class Group {

    private String name;
    private Group parent;

    /**
     * Default Constructor
     */
    public Group() {
    }


    /**
     * Getter & Setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getParent() {
        return parent;
    }

    public void setParent(Group parent) {
        this.parent = parent;
    }
}
