package arraylist;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {


        ArrayList<String> animalsList = new ArrayList<>();

        animalsList.add(0, "Elephant");
        animalsList.add(1, "Rabbit");
        animalsList.add(2, "Mouse");
        animalsList.add(3, "Monkey");
        animalsList.add(4, "Cow");
        animalsList.add(5, "Duck");
        animalsList.add(6, "Zebra");
        animalsList.add(7, "Crocodile");

        System.out.println(animalsList.toString());

        animalsList.remove(1);
        animalsList.remove(1);
        animalsList.remove(3);

        System.out.println(animalsList.toString());

        System.out.println(animalsList.size());





    }
}
