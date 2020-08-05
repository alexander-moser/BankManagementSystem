public class Address {
    private String street;
    private String zipCode;
    private String City;

    public Address(String street, String zipCode, String city) {
        setStreet(street);
        setZipCode(zipCode);
        setCity(city);
    }

    public Address() {

    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return City;
    }
}
