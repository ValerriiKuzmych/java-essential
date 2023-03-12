package address;

public class Address {


    private String country, city, street;
    private int apartment, index, house;

    public Address(){};

    public Address(String country, String city, String street, int apartment, int index, int house) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.apartment = apartment;
        this.index = index;
        this.house = house;
    }

    public void printAddress(){

        System.out.println(country+ "\n" +city+ "\n" +street+ " " +house+ "\nApartment: " +apartment+ "\nIndex: " +index);

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }



}
