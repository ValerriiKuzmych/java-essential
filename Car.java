package oop;

public class Car {

    private int year, weight;
    private String color;

    private  double speed;



    Car(){


    }

    Car(int year){
        this(year, "Yello");
        this.year = year;
    }

    Car(int year, String color){
        this(year, 1500 , color, 200);
        this.year = year;
        this.color = color;
    }

     Car(int year, int weight, double speed) {
        this(year, weight, "Red", speed);
        this.year = year;
        this.weight = weight;
        this.speed = speed;
    }

     Car(int year, int weight, String color, double speed) {
        this.year = year;
        this.weight = weight;
        this.color = color;
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }
}
