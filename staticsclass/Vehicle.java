package staticsclass;

public class Vehicle {


    public void methodPrint(){

        System.out.println("methodPrint: Vehicle");

    }

    public class Wheel{

        public void methodPrint(){

            System.out.println("methodPrint: Wheel");

        }

    }

    public class Door {

        public void methodPrint() {

            System.out.println("methodPrint: Door");
        }
    }


}

class Main{

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Door door = new Vehicle().new Door();
        Vehicle.Wheel wheel = new Vehicle().new Wheel();

        vehicle.methodPrint();
        door.methodPrint();
        wheel.methodPrint();
    }
}
