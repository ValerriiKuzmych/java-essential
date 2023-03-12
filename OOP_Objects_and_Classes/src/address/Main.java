package address;

public class Main {
    public static void main(String[] args) {

     //  address.Address addressSet = new address.Address();

     //  addressSet.setCountry("Germany");
     //  addressSet.setCity("Berlin");
     //  addressSet.setStreet("Dessauer Street");
     //  addressSet.setHouse(43);
     //  addressSet.setApartment(2);
     //  addressSet.setIndex(12689);

     //  System.out.println(addressSet.getCountry()+ "\n" +addressSet.getCity()+ "\n" +addressSet.getStreet()+ " " +addressSet.getHouse()+ "\n" +addressSet.getApartment()+ "\n" +addressSet.getIndex());


        Address addressConstructor = new Address("Germany", "Berlin", "Dessauer Street", 2, 12689, 43);

        addressConstructor.printAddress();
    }
}