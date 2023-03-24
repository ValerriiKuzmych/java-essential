import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 6, 23, 5005);
        Animal dog = new Animal("Labrador", 15, 25, 5001);
        Animal bird = new Animal("King Penguin", 12, 12, 5003);

        Animal[] animals = {cat, dog, bird};

        Arrays.sort(animals);

        for (Animal tmp : animals) {
            System.out.println(tmp);
        }

        //    List<Animal> listAnimals = new ArrayList<>();

        //    for (int i = 0; i < animals.length; i++) {
        //        listAnimals.add(animals[i]);
        //    }
        //    System.out.println("Largest value is " + Collections.max(listAnimals));


    }

}
