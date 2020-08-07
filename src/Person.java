/**
 * Person.
 *
 * @author Alexander Moser
 * */
public class Person {
    /** Name of a person*/
    private String name;
    /** Surname of a person*/
    private String surname;
    /** Address of a person*/
    private Address address;

    /** Constructor for a person
     *
     * @param name name of a person
     * @param surname surname of a person
     * @param address address of a person
     * */
    public Person(String name, String surname, Address address) {
        setName(name);
        setSurname(surname);
        setAddress(address);
    }

    /** Default constructor*/
    public Person() {
    }

    /** Setter for the name*/
    public void setName(String name) {
        this.name = name;
    }

    /** Setter for the surname*/
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /** Setter for the address*/
    public void setAddress(Address address) {
        this.address = address;
    }

    /** Getter for the name*/
    public String getName() {
        return name;
    }

    /** Getter for the surname*/
    public String getSurname() {
        return surname;
    }

    /** Getter for the address*/
    public Address getAddress() {
        return address;
    }
}
