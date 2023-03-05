package oop;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car(1995);
        Car car2 = new Car(2000, "Green");
        Car car3 = new Car(1999, 1445, 200);
        Car car4 = new Car(2001, 1500, "Oliv", 201 );


        System.out.println(car.getColor() + " " + car.getYear() + " " + car.getWeight() + " " + car.getSpeed());
        System.out.println(car1.getColor() +" "+ car1.getYear() + " " + car1.getWeight() + " " + car1.getSpeed());
        System.out.println(car2.getColor() +" "+ car2.getYear() + " " + car2.getWeight() + " " + car2.getSpeed());
        System.out.println(car3.getColor() +" "+ car3.getYear() + " " + car3.getWeight() + " " + car3.getSpeed());
        System.out.println(car4.getColor() +" "+ car4.getYear() + " " + car4.getWeight() + " " + car4.getSpeed());

    }
}
