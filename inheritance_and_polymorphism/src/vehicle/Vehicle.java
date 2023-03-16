package vehicle;

public class Vehicle {

    int speed;
    String price;
    int yearOfIssue;
    String location;

    Vehicle(int speed, String price, int yearOfIssue, String location){

        this.speed = speed;
        this.price = price;
        this.yearOfIssue = yearOfIssue;
        this.location = location;
    }

    void PrintTransportInformation(){

        System.out.println("Max. speed km/h = " +speed+ "\nYear of issue: " +yearOfIssue+ "\nPrice: " +price+ "\nLocation: " +location);

    }
}
