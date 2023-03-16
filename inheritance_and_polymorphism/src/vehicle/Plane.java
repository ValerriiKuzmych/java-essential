package vehicle;

public class Plane extends Vehicle{


    int height;
    int passengers;

    Plane(int speed, String price, int yearOfIssue, String location, int height, int passengers) {

        super(speed, price, yearOfIssue, location);

        this.height = height;
        this.passengers = passengers;

    }
     @Override
    void PrintTransportInformation() {

         System.out.println("\nType: Plane");

        super.PrintTransportInformation();

         System.out.println("Height in meters: " +height+ "\nPassengers: " +passengers);
    }

}
