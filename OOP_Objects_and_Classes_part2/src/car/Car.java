package car;

public class Car {

    private int year;
    private String color;

    private double speed;

    private int weight;

    Car() {

        this(2019, "default", 280, 1800  );

        System.out.println("Constructor_0 class Car");
    }

    Car(int year) {

        this(year,"default", 280, 1800);

        this.year = year;

        System.out.println("Constructor_1 class Car: " +year);
    }

    Car(int year, double speed) {

        this(year,"default", speed, 1800);

        this.year = year;
        this.speed = speed;

        System.out.println("Constructor_2 class Car: " +this.year+ " " +this.speed);
    }

    Car(int year, String color, double speed) {

        this(year, color, speed, 1800);

        this.year = year;
        this.color = color;
        this.speed = speed;

        System.out.println("Constructor_3 class Car: " +this.year+ " " +this.color+ " " +this.speed);
    }

    Car(int year, String color, double speed, int weight) {

        this.year = year;
        this.color = color;
        this.speed = speed;
        this.weight = weight;

        System.out.println("Constructor_4 class Car: " +this.year+ " " +this.color+ " " +this.speed+ " " +this.weight);
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }
}
