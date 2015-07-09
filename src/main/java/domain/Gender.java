package domain;

/**
 * Created by Evelyne on 09/07/15.
 */
public enum Gender {
    MALE("male"), FEMALE("female");

    private String label;


    Gender(String label) {
        this.label = label;
    }
}
