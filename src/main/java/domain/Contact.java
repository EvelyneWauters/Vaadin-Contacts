package domain;


import java.util.Date;

public class Contact {
    /**
    * field variables
    */

    private String firstName;
    private String lastName;
    private Gender gender;
    private Date date;
    private Address address;
    private Group group;

    /**
     * Default Constructor
     */
    public Contact() {
    }

    /**
     * Other Methods
     */
    @Override
    public String toString() {
        return "Contact{" +
                "address=" + address +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", date=" + date +
                ", group=" + group +
                '}';
    }

    /**
     * Getter & Setters
     */
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
