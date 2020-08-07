/**
 * Address. Follows the Austrian format for addresses.
 *
 * @author Alexander Moser
 * */
public class Address {
    /** A street name and number*/
    private String street;
    /** The zip code where the street is located*/
    private String zipCode;
    /** The name of the city*/
    private String City;

    /**
     * Constructor for a Adress
     *
     * @param  street the name of the street
     * @param  zipCode the zip code of the area
     * @param  city the name of the city
     * */
    public Address(String street, String zipCode, String city) {
        setStreet(street);
        setZipCode(zipCode);
        setCity(city);
    }

    /** Default constructor*/
    public Address() {

    }

    /** Setter for the street*/
    public void setStreet(String street) {
        this.street = street;
    }

    /** Setter for the zip code*/
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /** Setter for the city*/
    public void setCity(String city) {
        City = city;
    }

    /** Getter for the street*/
    public String getStreet() {
        return street;
    }

    /** Getter for the zip code*/
    public String getZipCode() {
        return zipCode;
    }

    /** Getter for the city*/
    public String getCity() {
        return City;
    }
}
