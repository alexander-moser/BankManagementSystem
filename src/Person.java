import java.util.Date;

public class Person {
    private final String name;
    private String surname;
    private final Date birthday;
    private Address address;

    public Person(String name, String surname, Date birthday, Address address) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }
}
