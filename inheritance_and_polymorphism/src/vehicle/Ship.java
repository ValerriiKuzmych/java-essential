package vehicle;

public class Ship extends Vehicle {

    int passengers;
    String port;


    Ship(int speed, String price, int yearOfIssue, String location, String port, int passengers) {

        super(speed, price, yearOfIssue, location);

        this.port = port;
        this.passengers = passengers;


    }
     @Override
    void PrintTransportInformation(){

         System.out.println("\nType: Ship");

        super.PrintTransportInformation();

         System.out.println("Port: " +port+ "\nPassengers: " +passengers);

    }
}
