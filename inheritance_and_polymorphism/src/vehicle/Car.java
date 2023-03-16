package vehicle;

public class Car extends Vehicle {

    Car(int speed, String price, int yearOfIssue, String location){

        super(speed, price, yearOfIssue, location);

    }
    void PrintTransportInformation(){

        System.out.println("Type: Car");
        super.PrintTransportInformation();

    }



}
