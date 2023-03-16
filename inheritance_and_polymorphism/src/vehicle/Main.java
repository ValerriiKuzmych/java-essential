package vehicle;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(220, "8900$", 2018, "Phuket");
        Plane plane = new Plane(900,"24000000$", 2016, "London", 8800, 16);
        Ship ship = new Ship(44,"800000000$", 2015, "Genoa", "Marina Genoa", 80);

        car.PrintTransportInformation();
        plane.PrintTransportInformation();
        ship.PrintTransportInformation();

    }
}
