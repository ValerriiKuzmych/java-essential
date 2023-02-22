package anonyumysEnum;

enum Animals{

    ELEPHANT(30), RABBIT(2);

    int age;

    Animals(int age) {

        this.age = age;

    }


    @Override
    public String toString() {
        return "Animals:" + super.toString() +
                " age: " + age;
    }
}

public class Main {

    public static void main(String[] args) {

        Animals animals = Animals.ELEPHANT;
        Animals animals1 = Animals.RABBIT;

        System.out.println(animals1.toString());
        System.out.println(animals.toString());


    }
}
